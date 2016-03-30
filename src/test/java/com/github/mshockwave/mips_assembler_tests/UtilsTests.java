package com.github.mshockwave.mips_assembler_tests;

import static org.junit.Assert.*;

import com.github.mshockwave.mips_assembler.Utils;
import org.junit.*;

import java.util.BitSet;

public class UtilsTests {

    @Test
    public void testShifts(){
        System.out.println("Testing shiftLeft()...");
        BitSet sample = new BitSet();
        sample.set(1);
        sample.set(3);
        BitSet result = Utils.shiftLeft(sample, 4);
        assertEquals("result == {5, 7}", result.toString(), "{5, 7}");

        System.out.println("Testing shiftRightLogic()...");
        sample.clear();
        sample.set(2);
        sample.set(6);
        result = Utils.shiftRightLogic(sample, 3);
        assertEquals("result == {3}", result.toString(), "{3}");
    }
}
