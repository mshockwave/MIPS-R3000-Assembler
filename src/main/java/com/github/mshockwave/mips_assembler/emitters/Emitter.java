package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.Instruction;
import com.github.mshockwave.mips_assembler.Utils;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public class Emitter extends JInstrsEmitter{

    private OutputStream mOutStream;

    public Emitter(int baseAddress, OutputStream oStream){
        mBaseAddress = baseAddress;
        mOutStream = oStream;
    }

    //Op Halt
    @Override
    public void exitOp_halt(MipsAsmParser.Op_haltContext ctx) {
        Instruction instruction = Instruction.newSTypeInstruction();

        instruction.getField(0).or(immBits(0xFFFFFFFF));
        instruction.getField(1).or(immBits(0xFF));

        mInstructions.add(instruction);
    }

    @Override
    public void exitStat(MipsAsmParser.StatContext ctx){
        //Check whether there is label
        MipsAsmParser.LabelContext labelCtx = ctx.label();
        if( labelCtx != null && !labelCtx.isEmpty() ){

            String labelStr = labelCtx.iden().getText();
            mLabelsMap.put(labelStr, mInstructions.size() - 1);

            if(mUnResolvedLabelsMap.containsKey(labelStr)){
                int labelAddr = mLabelsMap.get(labelStr) * 4 + mBaseAddress;

                List<UnresolvedLabel> labels = mUnResolvedLabelsMap.get(labelStr);
                for(UnresolvedLabel label : labels){
                    int instructionAddr = label.InstructionOffset * 4 + mBaseAddress;

                    int resultVal;
                    switch(label.ResolveKind){
                        case ResolveKind.BRANCH:{
                            resultVal = (labelAddr - (instructionAddr + 4)) / 4;
                            break;
                        }

                        case ResolveKind.JUMP: {

                            int mask = (1 << 28) - 1;

                            resultVal = labelAddr & mask;
                            resultVal >>= 2;

                            break;
                        }

                        default:
                            throw new RuntimeException("Unrecognized resolved kind");
                    }

                    label.Field.or(immBits(resultVal));
                }

                mUnResolvedLabelsMap.remove(labelStr);
            }
        }
    }

    @Override
    public void exitProg(MipsAsmParser.ProgContext ctx) {

        //Epilogue
        //Check whether there are unresolved labels
        if(!mUnResolvedLabelsMap.isEmpty()){
            for (String label : mUnResolvedLabelsMap.keySet()) {
                System.out.println("Error: Unresolved label: " + label);
            }

            throw new RuntimeException("Exist unresolved labels");
        }

        //Print result

        //32bits
        ByteBuffer buffer = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN);
        Utils.zeroBufferInt(buffer);

        try{
            //Init PC address
            buffer.putInt(mBaseAddress);
            mOutStream.write(buffer.array());
            Utils.zeroBufferInt(buffer);

            //Instruction length
            buffer.putInt(mInstructions.size());
            mOutStream.write(buffer.array());
            Utils.zeroBufferInt(buffer);

            for(Instruction instruction : mInstructions){
                buffer.put(instruction.getBits().toByteArray());
                mOutStream.write(Utils.reversedBytes(buffer.array()));
                Utils.zeroBufferInt(buffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
