package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

public class Emitter extends JInstrsEmitter{

    public Emitter(int baseAddress){
        mBaseAddress = baseAddress;
    }

    @Override
    public void exitStat(MipsAsmParser.StatContext ctx){
        //Check whether there is label
        MipsAsmParser.LabelContext labelCtx;
        if(!(labelCtx = ctx.label()).isEmpty()){

            String labelStr = labelCtx.iden().getText();
            mLabelsMap.put(labelStr, mInstructions.size() - 1);

            //TODO: Resolve labels
        }
    }
}
