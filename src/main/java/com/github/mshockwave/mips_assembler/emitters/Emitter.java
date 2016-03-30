package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.Instruction;
import com.github.mshockwave.mips_assembler.Utils;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Emitter extends JInstrsEmitter{

    private OutputStream mOutStream;

    public Emitter(int baseAddress, OutputStream oStream){
        mBaseAddress = baseAddress;
        mOutStream = oStream;
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

                UnresolvedLabel label = mUnResolvedLabelsMap.get(labelStr);
                int instructionAddr = label.InstructionOffset * 4 + mBaseAddress;

                int resultVal;
                switch(label.ResolveKind){
                    case ResolveKind.BRANCH:{
                        resultVal = (labelAddr - (instructionAddr + 4)) / 4;
                        break;
                    }

                    case ResolveKind.JUMP: {
                        //Create mask to extract (PC+4)[31:28]
                        int mask = ~((1 << 28) - 1);

                        resultVal = instructionAddr + 4; //PC+4
                        resultVal &= mask;

                        int mask2 = (~mask) - 3/*11*/;

                        resultVal |= (labelAddr & mask2);

                        break;
                    }

                    default:
                        throw new RuntimeException("Unrecognized resolved kind");
                }

                label.Field.or(immBits(resultVal));
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
