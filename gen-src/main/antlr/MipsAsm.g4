grammar MipsAsm;

prog:   stat+ ;

iden: ALPHA
    | NUM
    | ALPHA iden
    | NUM iden
    | '_' iden
    ;
label: iden ':'
    ;

reg: S_REG
    | T_REG
    | A_REG
    | V_REG
    | K_REG
    | IMM_REG
    | '$zero'
    | '$sp'
    | '$fp'
    | '$ra'
    ;
usigned_imm: NUM
    | HEX_NUM
    ;
signed_imm: '-' usigned_imm
    | usigned_imm
    ;

stat: instr NEWLINE
    | instr
    | label instr NEWLINE
    | label instr
    | NEWLINE
    | COMMENT
    ;

op_add: 'add' rd=reg ',' rs=reg ',' rt=reg
    ;
op_addu: 'addu' rd=reg ',' rs=reg ',' rt=reg
    ;
op_sub: 'sub' rd=reg ',' rs=reg ',' rt=reg
    ;
op_and: 'and' rd=reg ',' rs=reg ',' rt=reg
    ;
op_or: 'or' rd=reg ',' rs=reg ',' rt=reg
    ;
op_nor: 'nor' rd=reg ',' rs=reg ',' rt=reg
    ;
op_xor: 'xor' rd=reg ',' rs=reg ',' rt=reg
    ;
op_nand: 'nand' rd=reg ',' rs=reg ',' rt=reg
    ;
op_slt: 'slt' rd=reg ',' rs=reg ',' rt=reg
    ;
op_sll: 'sll' rd=reg ',' rt=reg ',' usigned_imm
    ;
op_srl: 'srl' rd=reg ',' rt=reg ',' usigned_imm
    ;
op_sra: 'sra' rd=reg ',' rt=reg ',' usigned_imm
    ;
op_jr: 'jr' rs=reg
    ;
instr_r: op_add
        | op_addu
        | op_sub
        | op_and
        | op_or
        | op_nor
        | op_xor
        | op_nand
        | op_slt
        | op_sll
        | op_srl
        | op_sra
        | op_jr
        ;

op_addi: 'addi' rt=reg ',' rs=reg ',' signed_imm
    ;
op_addiu: 'addiu' rt=reg ',' rs=reg ',' usigned_imm
    ;
op_lw: 'lw' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_lh: 'lh' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_lhu: 'lhu' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_lb: 'lb' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_lbu: 'lbu' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_sw: 'sw' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_sh: 'sh' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_sb: 'sb' rt=reg ',' signed_imm '(' rs=reg ')'
    ;
op_lui: 'lui' rt=reg ',' usigned_imm
    ;
op_andi: 'andi' rt=reg ',' rs=reg ',' usigned_imm
    ;
op_ori: 'ori' rt=reg ',' rs=reg ',' usigned_imm
    ;
op_nori: 'nori' rt=reg ',' rs=reg ',' usigned_imm
    ;
op_slti: 'slti' rt=reg ',' rs=reg ',' signed_imm
    ;
op_beq: 'beq' rs=reg ',' rt=reg ',' target=iden
    ;
op_bne: 'bne' rs=reg ',' rt=reg ',' target=iden
    ;
op_bgtz: 'bgtz' rs=reg ',' target=iden
    ;
instr_i: op_addi
    | op_addiu
    | op_lw
    | op_lh
    | op_lhu
    | op_lb
    | op_lbu
    | op_sw
    | op_sh
    | op_sb
    | op_lui
    | op_andi
    | op_ori
    | op_nori
    | op_slti
    | op_beq
    | op_bne
    | op_bgtz
    ;

op_j: 'j' target=iden
    ;
op_jal: 'jal' target=iden
    ;
instr_j: op_j
    | op_jal
    ;

op_halt: 'halt'
    ;

instr: instr_r
    | instr_i
    | instr_j
    | op_halt
    | instr COMMENT
    ;

WS: [ \t]+ -> skip ;
NEWLINE: '\r'? '\n' ;
COMMENT: '#' .*? NEWLINE -> skip;
NUM: [0-9]+ ;
HEX_NUM: '0'[xX][a-fA-F0-9]+;
ALPHA: [a-zA-Z]+ ;

IMM_REG: '$'[0-9]+ ;
S_REG: '$s'[0-7] ;
T_REG: '$t'[0-9] ;
V_REG: '$v'[01] ;
A_REG: '$a'[0-3] ;
K_REG: '$k'[01] ;