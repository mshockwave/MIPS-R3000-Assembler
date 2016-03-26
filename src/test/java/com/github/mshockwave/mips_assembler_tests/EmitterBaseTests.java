package com.github.mshockwave.mips_assembler_tests;

import static org.junit.Assert.*;

import com.github.mshockwave.mips_assembler.EmitterBase;
import org.junit.*;

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
}
