package com.github.mshockwave.mips_assembler;

import java.nio.Buffer;
import java.nio.ByteBuffer;
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

    public static void zeroBufferInt(ByteBuffer buffer){
        buffer.clear();
        buffer.putInt(0);
        buffer.clear();
    }

    public static byte[] reversedBytes(byte[] bytes){
        int i;
        int len = bytes.length;
        byte[] result = new byte[len];
        for(i = 0; i < len; i++){
            result[i] = bytes[len - 1 - i];
        }
        return result;
    }

    public static int transformHex(String valStr, String exceptionMsg){
        int v;
        try{
            if(valStr.startsWith("0x") || valStr.startsWith("0X")){
                v = Integer.parseInt(valStr, 16);
            }else{
                v = Integer.parseInt(valStr, 10);
            }
        }catch (NumberFormatException e){
            throw new RuntimeException(exceptionMsg);
        }
        return v;
    }
}
