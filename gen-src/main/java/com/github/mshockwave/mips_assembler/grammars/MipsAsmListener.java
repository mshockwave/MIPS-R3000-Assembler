// Generated from /Users/mac/workspace/mips-r3000-assembler/gen-src/main/antlr/MipsAsm.g4 by ANTLR 4.5.1
package com.github.mshockwave.mips_assembler.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MipsAsmParser}.
 */
public interface MipsAsmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MipsAsmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MipsAsmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#iden}.
	 * @param ctx the parse tree
	 */
	void enterIden(MipsAsmParser.IdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#iden}.
	 * @param ctx the parse tree
	 */
	void exitIden(MipsAsmParser.IdenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MipsAsmParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MipsAsmParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#reg}.
	 * @param ctx the parse tree
	 */
	void enterReg(MipsAsmParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#reg}.
	 * @param ctx the parse tree
	 */
	void exitReg(MipsAsmParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#imm}.
	 * @param ctx the parse tree
	 */
	void enterImm(MipsAsmParser.ImmContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#imm}.
	 * @param ctx the parse tree
	 */
	void exitImm(MipsAsmParser.ImmContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MipsAsmParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MipsAsmParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_add}.
	 * @param ctx the parse tree
	 */
	void enterOp_add(MipsAsmParser.Op_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_add}.
	 * @param ctx the parse tree
	 */
	void exitOp_add(MipsAsmParser.Op_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_addu}.
	 * @param ctx the parse tree
	 */
	void enterOp_addu(MipsAsmParser.Op_adduContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_addu}.
	 * @param ctx the parse tree
	 */
	void exitOp_addu(MipsAsmParser.Op_adduContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sub}.
	 * @param ctx the parse tree
	 */
	void enterOp_sub(MipsAsmParser.Op_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sub}.
	 * @param ctx the parse tree
	 */
	void exitOp_sub(MipsAsmParser.Op_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_and}.
	 * @param ctx the parse tree
	 */
	void enterOp_and(MipsAsmParser.Op_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_and}.
	 * @param ctx the parse tree
	 */
	void exitOp_and(MipsAsmParser.Op_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_or}.
	 * @param ctx the parse tree
	 */
	void enterOp_or(MipsAsmParser.Op_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_or}.
	 * @param ctx the parse tree
	 */
	void exitOp_or(MipsAsmParser.Op_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_nor}.
	 * @param ctx the parse tree
	 */
	void enterOp_nor(MipsAsmParser.Op_norContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_nor}.
	 * @param ctx the parse tree
	 */
	void exitOp_nor(MipsAsmParser.Op_norContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_xor}.
	 * @param ctx the parse tree
	 */
	void enterOp_xor(MipsAsmParser.Op_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_xor}.
	 * @param ctx the parse tree
	 */
	void exitOp_xor(MipsAsmParser.Op_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_nand}.
	 * @param ctx the parse tree
	 */
	void enterOp_nand(MipsAsmParser.Op_nandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_nand}.
	 * @param ctx the parse tree
	 */
	void exitOp_nand(MipsAsmParser.Op_nandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_slt}.
	 * @param ctx the parse tree
	 */
	void enterOp_slt(MipsAsmParser.Op_sltContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_slt}.
	 * @param ctx the parse tree
	 */
	void exitOp_slt(MipsAsmParser.Op_sltContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sll}.
	 * @param ctx the parse tree
	 */
	void enterOp_sll(MipsAsmParser.Op_sllContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sll}.
	 * @param ctx the parse tree
	 */
	void exitOp_sll(MipsAsmParser.Op_sllContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_srl}.
	 * @param ctx the parse tree
	 */
	void enterOp_srl(MipsAsmParser.Op_srlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_srl}.
	 * @param ctx the parse tree
	 */
	void exitOp_srl(MipsAsmParser.Op_srlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sra}.
	 * @param ctx the parse tree
	 */
	void enterOp_sra(MipsAsmParser.Op_sraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sra}.
	 * @param ctx the parse tree
	 */
	void exitOp_sra(MipsAsmParser.Op_sraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_jr}.
	 * @param ctx the parse tree
	 */
	void enterOp_jr(MipsAsmParser.Op_jrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_jr}.
	 * @param ctx the parse tree
	 */
	void exitOp_jr(MipsAsmParser.Op_jrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#instr_r}.
	 * @param ctx the parse tree
	 */
	void enterInstr_r(MipsAsmParser.Instr_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#instr_r}.
	 * @param ctx the parse tree
	 */
	void exitInstr_r(MipsAsmParser.Instr_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_addi}.
	 * @param ctx the parse tree
	 */
	void enterOp_addi(MipsAsmParser.Op_addiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_addi}.
	 * @param ctx the parse tree
	 */
	void exitOp_addi(MipsAsmParser.Op_addiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_addiu}.
	 * @param ctx the parse tree
	 */
	void enterOp_addiu(MipsAsmParser.Op_addiuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_addiu}.
	 * @param ctx the parse tree
	 */
	void exitOp_addiu(MipsAsmParser.Op_addiuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lw}.
	 * @param ctx the parse tree
	 */
	void enterOp_lw(MipsAsmParser.Op_lwContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lw}.
	 * @param ctx the parse tree
	 */
	void exitOp_lw(MipsAsmParser.Op_lwContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lh}.
	 * @param ctx the parse tree
	 */
	void enterOp_lh(MipsAsmParser.Op_lhContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lh}.
	 * @param ctx the parse tree
	 */
	void exitOp_lh(MipsAsmParser.Op_lhContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lhu}.
	 * @param ctx the parse tree
	 */
	void enterOp_lhu(MipsAsmParser.Op_lhuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lhu}.
	 * @param ctx the parse tree
	 */
	void exitOp_lhu(MipsAsmParser.Op_lhuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lb}.
	 * @param ctx the parse tree
	 */
	void enterOp_lb(MipsAsmParser.Op_lbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lb}.
	 * @param ctx the parse tree
	 */
	void exitOp_lb(MipsAsmParser.Op_lbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lbu}.
	 * @param ctx the parse tree
	 */
	void enterOp_lbu(MipsAsmParser.Op_lbuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lbu}.
	 * @param ctx the parse tree
	 */
	void exitOp_lbu(MipsAsmParser.Op_lbuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sw}.
	 * @param ctx the parse tree
	 */
	void enterOp_sw(MipsAsmParser.Op_swContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sw}.
	 * @param ctx the parse tree
	 */
	void exitOp_sw(MipsAsmParser.Op_swContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sh}.
	 * @param ctx the parse tree
	 */
	void enterOp_sh(MipsAsmParser.Op_shContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sh}.
	 * @param ctx the parse tree
	 */
	void exitOp_sh(MipsAsmParser.Op_shContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_sb}.
	 * @param ctx the parse tree
	 */
	void enterOp_sb(MipsAsmParser.Op_sbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_sb}.
	 * @param ctx the parse tree
	 */
	void exitOp_sb(MipsAsmParser.Op_sbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_lui}.
	 * @param ctx the parse tree
	 */
	void enterOp_lui(MipsAsmParser.Op_luiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_lui}.
	 * @param ctx the parse tree
	 */
	void exitOp_lui(MipsAsmParser.Op_luiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_andi}.
	 * @param ctx the parse tree
	 */
	void enterOp_andi(MipsAsmParser.Op_andiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_andi}.
	 * @param ctx the parse tree
	 */
	void exitOp_andi(MipsAsmParser.Op_andiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_ori}.
	 * @param ctx the parse tree
	 */
	void enterOp_ori(MipsAsmParser.Op_oriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_ori}.
	 * @param ctx the parse tree
	 */
	void exitOp_ori(MipsAsmParser.Op_oriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_nori}.
	 * @param ctx the parse tree
	 */
	void enterOp_nori(MipsAsmParser.Op_noriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_nori}.
	 * @param ctx the parse tree
	 */
	void exitOp_nori(MipsAsmParser.Op_noriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_slti}.
	 * @param ctx the parse tree
	 */
	void enterOp_slti(MipsAsmParser.Op_sltiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_slti}.
	 * @param ctx the parse tree
	 */
	void exitOp_slti(MipsAsmParser.Op_sltiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_beq}.
	 * @param ctx the parse tree
	 */
	void enterOp_beq(MipsAsmParser.Op_beqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_beq}.
	 * @param ctx the parse tree
	 */
	void exitOp_beq(MipsAsmParser.Op_beqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_bne}.
	 * @param ctx the parse tree
	 */
	void enterOp_bne(MipsAsmParser.Op_bneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_bne}.
	 * @param ctx the parse tree
	 */
	void exitOp_bne(MipsAsmParser.Op_bneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_bgtz}.
	 * @param ctx the parse tree
	 */
	void enterOp_bgtz(MipsAsmParser.Op_bgtzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_bgtz}.
	 * @param ctx the parse tree
	 */
	void exitOp_bgtz(MipsAsmParser.Op_bgtzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#instr_i}.
	 * @param ctx the parse tree
	 */
	void enterInstr_i(MipsAsmParser.Instr_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#instr_i}.
	 * @param ctx the parse tree
	 */
	void exitInstr_i(MipsAsmParser.Instr_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_j}.
	 * @param ctx the parse tree
	 */
	void enterOp_j(MipsAsmParser.Op_jContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_j}.
	 * @param ctx the parse tree
	 */
	void exitOp_j(MipsAsmParser.Op_jContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_jal}.
	 * @param ctx the parse tree
	 */
	void enterOp_jal(MipsAsmParser.Op_jalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_jal}.
	 * @param ctx the parse tree
	 */
	void exitOp_jal(MipsAsmParser.Op_jalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#instr_j}.
	 * @param ctx the parse tree
	 */
	void enterInstr_j(MipsAsmParser.Instr_jContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#instr_j}.
	 * @param ctx the parse tree
	 */
	void exitInstr_j(MipsAsmParser.Instr_jContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#op_halt}.
	 * @param ctx the parse tree
	 */
	void enterOp_halt(MipsAsmParser.Op_haltContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#op_halt}.
	 * @param ctx the parse tree
	 */
	void exitOp_halt(MipsAsmParser.Op_haltContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsAsmParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(MipsAsmParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsAsmParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(MipsAsmParser.InstrContext ctx);
}