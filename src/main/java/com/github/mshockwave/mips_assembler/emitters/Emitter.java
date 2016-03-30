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

            //TODO: Resolve labels
        }
    }

    @Override
    public void exitProg(MipsAsmParser.ProgContext ctx) {

        //Epilogue
        //Print

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
