package com.github.mshockwave.mips_assembler;

import java.util.BitSet;

public class Field {
    private int mBitWidth = 32;
    public int getBitWidth(){ return mBitWidth; }
    private BitSet mMask;

    private BitSet mBits = null;

    public Field(int width){
        mBitWidth = width;
        mBits = new BitSet(width);

        mMask = new BitSet(width);
        mMask.set(0, width, true);
    }

    public BitSet getBits(){ return mBits; }

    private void truncate(){
        mBits.and(mMask);
    }

    public void or(BitSet bitSet){
        mBits.or(bitSet);
        truncate();
    }
    public void setBit(int index){
        if(index < mBitWidth){
            mBits.set(index, true);
            truncate();
        }
    }
    public void clear(int index){
        if(index < mBitWidth){
            mBits.set(index, false);
            truncate();
        }
    }

    public void flip(){
        //Flip all
        mBits.flip(0, mBitWidth);
        truncate();
    }
    public void flip(int index){
        if(index < mBitWidth){
            mBits.flip(index);
            truncate();
        }
    }
}
