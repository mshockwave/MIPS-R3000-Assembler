package com.github.mshockwave.mips_assembler;

import java.util.ArrayList;
import java.util.List;

public class InstructionBase {

    public static class Type {
        //Use explicit integer instead of enum
        //Due to performance concern
        public static final int R = 0;
        public static final int I = 1;
        public static final int J = 2;
        public static final int S = 3;
    }

    protected int mInstructionType = Type.R;
    public int getInstructionType(){ return mInstructionType; }

    protected final List<Field> mFields = new ArrayList<>();

    public int getFieldsNum(){ return mFields.size(); }
    public Field getField(int index){
        return (index < mFields.size())? mFields.get(index) : null;
    }
}
