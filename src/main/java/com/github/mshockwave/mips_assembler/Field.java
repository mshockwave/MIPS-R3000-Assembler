package com.github.mshockwave.mips_assembler;

import java.util.BitSet;

public class Field {
    private int mBitWidth = 32;
    public int getBitWidth(){ return mBitWidth; }

    private BitSet mBits = null;

    public Field(int width){
        mBitWidth = width;
        mBits = new BitSet(width);
    }

    public void or(BitSet bitSet){ mBits.or(bitSet); }
    public void setBit(int index){
        if(index < mBitWidth) mBits.set(index, true);
    }
    public void clear(int index){
        if(index < mBitWidth) mBits.set(index, false);
    }

    public void flip(){
        //Flip all
        mBits.flip(0, mBitWidth);
    }
    public void flip(int index){
        if(index < mBitWidth) mBits.flip(index);
    }
}
