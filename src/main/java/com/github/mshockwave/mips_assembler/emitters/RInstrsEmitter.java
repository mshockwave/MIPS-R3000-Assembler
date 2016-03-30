package com.github.mshockwave.mips_assembler.emitters;

import com.github.mshockwave.mips_assembler.EmitterBase;
import com.github.mshockwave.mips_assembler.Instruction;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;

public class RInstrsEmitter extends EmitterBase{

    private void setUpType1(Instruction instruction, String rs, String rt, String rd){

        instruction.getField(2).or(regBits(rd));

        instruction.getField(3).or(regBits(rt));

        instruction.getField(4).or(regBits(rs));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_add(MipsAsmParser.Op_addContext ctx) {}
    @Override public void exitOp_add(MipsAsmParser.Op_addContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x20));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_addu(MipsAsmParser.Op_adduContext ctx) { }
    @Override public void exitOp_addu(MipsAsmParser.Op_adduContext ctx) {

        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x21));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_sub(MipsAsmParser.Op_subContext ctx) { }
    @Override public void exitOp_sub(MipsAsmParser.Op_subContext ctx) {

        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x22));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_and(MipsAsmParser.Op_andContext ctx) { }
    @Override public void exitOp_and(MipsAsmParser.Op_andContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x24));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_or(MipsAsmParser.Op_orContext ctx) { }
    @Override public void exitOp_or(MipsAsmParser.Op_orContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x25));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_nor(MipsAsmParser.Op_norContext ctx) { }
    @Override public void exitOp_nor(MipsAsmParser.Op_norContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x27));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_xor(MipsAsmParser.Op_xorContext ctx) { }
    @Override public void exitOp_xor(MipsAsmParser.Op_xorContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x26));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_nand(MipsAsmParser.Op_nandContext ctx) { }
    @Override public void exitOp_nand(MipsAsmParser.Op_nandContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x28));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    @Override public void enterOp_slt(MipsAsmParser.Op_sltContext ctx) { }
    @Override public void exitOp_slt(MipsAsmParser.Op_sltContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x2A));

        setUpType1(instruction, ctx.rs.getText(), ctx.rt.getText(), ctx.rd.getText());
    }

    private void setUpType2(Instruction instruction, String rt, String rd, String shamt){

        int v;
        try{
            if(shamt.startsWith("0x") || shamt.startsWith("0X")){
                v = Integer.parseInt(shamt, 16);
            }else{
                v = Integer.parseInt(shamt, 10);
            }
        }catch (NumberFormatException e){
            throw new RuntimeException("Wrong R type shamt value");
        }

        instruction.getField(1).or(immBits(v));

        instruction.getField(2).or(regBits(rd));

        instruction.getField(3).or(regBits(rt));

        mInstructions.add(instruction);
    }

    @Override public void enterOp_sll(MipsAsmParser.Op_sllContext ctx) { }
    @Override public void exitOp_sll(MipsAsmParser.Op_sllContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x00));

        setUpType2(instruction, ctx.rt.getText(), ctx.rd.getText(), ctx.usigned_imm().getText());
    }

    @Override public void enterOp_srl(MipsAsmParser.Op_srlContext ctx) { }
    @Override public void exitOp_srl(MipsAsmParser.Op_srlContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x02));

        setUpType2(instruction, ctx.rt.getText(), ctx.rd.getText(), ctx.usigned_imm().getText());
    }

    @Override public void enterOp_sra(MipsAsmParser.Op_sraContext ctx) { }
    @Override public void exitOp_sra(MipsAsmParser.Op_sraContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x03));

        setUpType2(instruction, ctx.rt.getText(), ctx.rd.getText(), ctx.usigned_imm().getText());
    }

    @Override public void enterOp_jr(MipsAsmParser.Op_jrContext ctx) { }
    @Override public void exitOp_jr(MipsAsmParser.Op_jrContext ctx) {
        Instruction instruction = Instruction.newRTypeInstruction();

        //Func
        instruction.getField(0).or(immBits(0x08));

        String rs = ctx.rs.getText();
        instruction.getField(4).or(regBits(rs));

        mInstructions.add(instruction);
    }
}
