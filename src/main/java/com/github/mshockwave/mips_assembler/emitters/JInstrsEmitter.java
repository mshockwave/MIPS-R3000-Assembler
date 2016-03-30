package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.Instruction;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

import java.util.ArrayList;
import java.util.List;

public class JInstrsEmitter extends IInstrsEmitter{

    private void configInstructionTarget(Instruction instruction, int op, String target){
        //Try to resolve target label
        if(mLabelsMap.containsKey(target)){
            instruction.getField(0).or(immBits(mLabelsMap.get(target)));
        }else{
            instruction.getField(0).or(immBits(0));

            //Put into unresolved set
            final UnresolvedLabel label = new UnresolvedLabel(instruction.getField(0), ResolveKind.JUMP, mInstructions.size());
            if(mUnResolvedLabelsMap.containsKey(target)){
                mUnResolvedLabelsMap.get(target).add(label);
            }else{
                List<UnresolvedLabel> labels = new ArrayList<>();
                labels.add(label);
                mUnResolvedLabelsMap.put(target, labels);
            }
        }

        instruction.getField(1).or(immBits(op));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_j(MipsAsmParser.Op_jContext ctx) { }
    @Override public void exitOp_j(MipsAsmParser.Op_jContext ctx) {
        Instruction instruction = Instruction.newJTypeInstruction();

        configInstructionTarget(instruction, 0x02, ctx.target.getText());
    }

    @Override public void enterOp_jal(MipsAsmParser.Op_jalContext ctx) { }
    @Override public void exitOp_jal(MipsAsmParser.Op_jalContext ctx) {
        Instruction instruction = Instruction.newJTypeInstruction();

        configInstructionTarget(instruction, 0x03, ctx.target.getText());
    }
}
