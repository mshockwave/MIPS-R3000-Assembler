package com.github.mshockwave.mips_assembler_tests;

import static org.junit.Assert.*;

import com.github.mshockwave.mips_assembler.EmitterBase;
import org.junit.*;

import java.util.BitSet;

public class EmitterBaseTests{

    @Test
    public void testRegIndex(){
        //Test EmitterBase.regIndex
        int result;

        System.out.println("Testing EmitterBase.regIndex()...");

        result = EmitterBase.regIndex("$s0");
        assertEquals("$s0", 16, result);

        result = EmitterBase.regIndex("$t1");
        assertEquals("$t1", 9, result);

        result = EmitterBase.regIndex("$t8");
        assertEquals("$t8", 24, result);

        result = EmitterBase.regIndex("$10");
        assertEquals("$10", 10, result);

        result = EmitterBase.regIndex("$32");
        assertEquals("$32", -1, result);

        result = EmitterBase.regIndex("$fp");
        assertEquals("$fp", 30, result);

        result = EmitterBase.regIndex("$sp");
        assertEquals("$sp", 29, result);
    }

    @Test
    public void testRegBits(){
        //Test EmitterBase.regBits

        System.out.println("Testing EmitterBase.regBits()...");

        BitSet sampleBits = new BitSet(5);
        sampleBits.set(1, true); //value == 2

        BitSet bits = EmitterBase.regBits("$2");
        BitSet resultBits = new BitSet(5);
        resultBits.or(bits);

        assertTrue("$2 to BitSet of size 5", sampleBits.equals(resultBits));
    }
}
