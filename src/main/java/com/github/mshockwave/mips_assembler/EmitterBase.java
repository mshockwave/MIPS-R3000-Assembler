package com.github.mshockwave.mips_assembler;

import com.github.mshockwave.mips_assembler.grammars.MipsAsmBaseListener;
import com.google.common.primitives.Ints;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

public class EmitterBase extends MipsAsmBaseListener{

    //Context
    protected int mBaseAddress = 0; //Initial PC address
    protected final Map<String, Integer> mLabelsMap = new HashMap<>();
    protected final Map<String, Field> mUnResolvedLabelsMap = new HashMap<>();

    protected final List<Instruction> mInstructions = new ArrayList<>();

    //Routines
    public static int regIndex(String regStr){
        if(regStr == null) return -1;

        if(regStr.matches("^\\$[0-9]+$")){
            String numStr = regStr.substring(1);
            try{
                int num = Integer.valueOf(numStr);
                if(num < 0 || num > 31) return -1;
                return num;
            }catch (NumberFormatException e){
                return -1;
            }
        }

        if(regStr.matches("^\\$s[0-7]$")){
            char n = regStr.charAt(2);
            return 16 + (n - '0');
        }

        if(regStr.matches("^\\$t[0-9]$")){
            char n = regStr.charAt(2);

            int num = n - '0';
            if(num < 8) return num + 8;
            return num + 16;
        }

        if(regStr.matches("^\\$v[01]$")){
            char n = regStr.charAt(2);

            return 2 + (n - '0');
        }

        if(regStr.matches("^\\$a[0-3]$")){
            char n = regStr.charAt(2);

            return 4 + (n - '0');
        }

        if(regStr.matches("^\\$k[01]$")){
            char n = regStr.charAt(2);

            return 26 + (n - '0');
        }

        if(regStr.equals("$zero")) return 0;

        if(regStr.equals("$at")) return 1;

        if(regStr.equals("$gp")) return 28;

        if(regStr.equals("$sp")) return 29;

        if(regStr.equals("$fp")) return 30;

        if(regStr.equals("$ra")) return 31;

        return -1;
    }

    public static BitSet regBits(String regStr){
        int index = regIndex(regStr);
        byte[] bytes = ByteBuffer.allocate(4)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .putInt(index).array();
        return BitSet.valueOf(bytes);
    }

    public static BitSet immBits(int val){
        byte[] bytes = ByteBuffer.allocate(4)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .putInt(val).array();
        return BitSet.valueOf(bytes);
    }
}
