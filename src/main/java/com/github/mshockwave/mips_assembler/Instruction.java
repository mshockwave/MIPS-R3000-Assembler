package com.github.mshockwave.mips_assembler;

import java.util.ArrayList;
import java.util.List;

public class Instruction {

    public static class Type {
        //Use explicit integer instead of enum
        //Due to performance concern
        public static final int R = 0;
        public static final int I = 1;
        public static final int J = 2;
        public static final int S = 3;
    }

    private int mInstructionType = Type.R;
    public int getInstructionType(){ return mInstructionType; }

    private final List<Field> mFields = new ArrayList<>();

    public int getFieldsNum(){ return mFields.size(); }
    public Field getField(int index){
        return (index < mFields.size())? mFields.get(index) : null;
    }

    private Instruction(){
        //Can't construct this class from outside
    }

    /*Factory methods*/
    public static Instruction newRTypeInstruction(){
        Instruction instruction = new Instruction();
        instruction.mInstructionType = Type.R;

        //Func field
        instruction.mFields.add(new Field(6));
        //Shamt field
        instruction.mFields.add(new Field(5));
        //Rd field
        instruction.mFields.add(new Field(5));
        //Rt field
        instruction.mFields.add(new Field(5));
        //Rs field
        instruction.mFields.add(new Field(5));
        //Op code
        instruction.mFields.add(new Field(6));

        return instruction;
    }

    public static Instruction newITypeInstruction(){
        Instruction instruction = new Instruction();
        instruction.mInstructionType = Type.I;

        //Imm field
        instruction.mFields.add(new Field(16));
        //Rt field
        instruction.mFields.add(new Field(5));
        //Rs field
        instruction.mFields.add(new Field(5));
        //Op code
        instruction.mFields.add(new Field(6));

        return instruction;
    }

    public static Instruction newJTypeInstruction(){
        Instruction instruction = new Instruction();
        instruction.mInstructionType = Type.J;

        //Addr field
        instruction.mFields.add(new Field(26));
        //Op code
        instruction.mFields.add(new Field(6));

        return instruction;
    }

    public static Instruction newSTypeInstruction(){
        Instruction instruction = new Instruction();
        instruction.mInstructionType = Type.S;

        //Op code
        instruction.mFields.add(new Field(26));
        instruction.mFields.add(new Field(6));

        return instruction;
    }
}
