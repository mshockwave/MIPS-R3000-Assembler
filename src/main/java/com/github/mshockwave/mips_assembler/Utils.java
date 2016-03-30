package com.github.mshockwave.mips_assembler;

import java.util.BitSet;

public class Utils {

    //Immutable
    public static BitSet shiftLeft(BitSet src, int offset){
        if(offset < 0) return src;
        BitSet result = new BitSet();

        int i;
        for(i = 0; i < src.length(); i++){
            if(src.get(i)){
                result.set(i + offset, true);
            }
        }

        return result;
    }

    //Immutable
    public static BitSet shiftRightLogic(BitSet src, int offset){
        if(offset < 0) return src;
        BitSet result = new BitSet();

        int i;
        for(i = 0; i < src.length(); i++){
            if(src.get(i)){
                if(i - offset < 0) continue;
                result.set(i - offset, true);
            }
        }

        return result;
    }
}
