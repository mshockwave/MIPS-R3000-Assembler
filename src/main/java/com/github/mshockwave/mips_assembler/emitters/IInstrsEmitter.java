package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.Instruction;
import com.github.mshockwave.mips_assembler.Utils;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

public class IInstrsEmitter extends RInstrsEmitter{

    private void configInstruction(Instruction instruction, int op, String rs, String rt, String imm){

        int v = Utils.transformHex(imm, "Wrong I type imm value");

        //Imm
        instruction.getField(0).or(immBits(v));

        //rt
        instruction.getField(1).or(regBits(rt));

        //rs
        instruction.getField(2).or(regBits(rs));

        //op
        instruction.getField(3).or(immBits(op));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_addi(MipsAsmParser.Op_addiContext ctx) { }
    @Override public void exitOp_addi(MipsAsmParser.Op_addiContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x08,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_addiu(MipsAsmParser.Op_addiuContext ctx) { }
    @Override public void exitOp_addiu(MipsAsmParser.Op_addiuContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x09,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.usigned_imm().getText());
    }

    @Override public void enterOp_lw(MipsAsmParser.Op_lwContext ctx) { }
    @Override public void exitOp_lw(MipsAsmParser.Op_lwContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x23,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_lh(MipsAsmParser.Op_lhContext ctx) { }
    @Override public void exitOp_lh(MipsAsmParser.Op_lhContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x21,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_lhu(MipsAsmParser.Op_lhuContext ctx) { }
    @Override public void exitOp_lhu(MipsAsmParser.Op_lhuContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x25,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_lb(MipsAsmParser.Op_lbContext ctx) { }
    @Override public void exitOp_lb(MipsAsmParser.Op_lbContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x20,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_lbu(MipsAsmParser.Op_lbuContext ctx) { }
    @Override public void exitOp_lbu(MipsAsmParser.Op_lbuContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x24,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_sw(MipsAsmParser.Op_swContext ctx) { }
    @Override public void exitOp_sw(MipsAsmParser.Op_swContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x2B,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_sh(MipsAsmParser.Op_shContext ctx) { }
    @Override public void exitOp_sh(MipsAsmParser.Op_shContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x29,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_sb(MipsAsmParser.Op_sbContext ctx) { }
    @Override public void exitOp_sb(MipsAsmParser.Op_sbContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x28,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    @Override public void enterOp_lui(MipsAsmParser.Op_luiContext ctx) { }
    @Override public void exitOp_lui(MipsAsmParser.Op_luiContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        String imm = ctx.usigned_imm().getText();
        int v = Utils.transformHex(imm, "Wrong I type imm value");

        //Imm
        instruction.getField(0).or(immBits(v));

        //rt
        instruction.getField(1).or(regBits(ctx.rt.getText()));

        //op
        instruction.getField(3).or(immBits(0x0F));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_andi(MipsAsmParser.Op_andiContext ctx) { }
    @Override public void exitOp_andi(MipsAsmParser.Op_andiContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x0C,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.usigned_imm().getText());
    }

    @Override public void enterOp_ori(MipsAsmParser.Op_oriContext ctx) { }
    @Override public void exitOp_ori(MipsAsmParser.Op_oriContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x0D,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.usigned_imm().getText());
    }

    @Override public void enterOp_nori(MipsAsmParser.Op_noriContext ctx) { }
    @Override public void exitOp_nori(MipsAsmParser.Op_noriContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x0E,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.usigned_imm().getText());
    }

    @Override public void enterOp_slti(MipsAsmParser.Op_sltiContext ctx) { }
    @Override public void exitOp_slti(MipsAsmParser.Op_sltiContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstruction(instruction, 0x0A,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.signed_imm().getText());
    }

    private void configInstructionTarget(Instruction instruction, int op, String rs, String rt, String target){

        //Try to resolve target label
        if(mLabelsMap.containsKey(target)){
            instruction.getField(0).or(immBits(mLabelsMap.get(target)));
        }else{
            instruction.getField(0).or(immBits(0));

            //Put into unresolved set
            final UnresolvedLabel label = new UnresolvedLabel(instruction.getField(0), ResolveKind.BRANCH, mInstructions.size());
            mUnResolvedLabelsMap.put(target, label);
        }

        //rt
        instruction.getField(1).or(regBits(rt));

        //rs
        instruction.getField(2).or(regBits(rs));

        //op
        instruction.getField(3).or(immBits(op));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_beq(MipsAsmParser.Op_beqContext ctx) { }
    @Override public void exitOp_beq(MipsAsmParser.Op_beqContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstructionTarget(instruction, 0x04,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.target.getText());
    }

    @Override public void enterOp_bne(MipsAsmParser.Op_bneContext ctx) { }
    @Override public void exitOp_bne(MipsAsmParser.Op_bneContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstructionTarget(instruction, 0x05,
                ctx.rs.getText(),
                ctx.rt.getText(),
                ctx.target.getText());
    }

    @Override public void enterOp_bgtz(MipsAsmParser.Op_bgtzContext ctx) { }
    @Override public void exitOp_bgtz(MipsAsmParser.Op_bgtzContext ctx) {
        Instruction instruction = Instruction.newITypeInstruction();

        configInstructionTarget(instruction, 0x07,
                ctx.rs.getText(),
                "$zero",
                ctx.target.getText());
    }
}
