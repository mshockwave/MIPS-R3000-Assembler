package com.github.mshockwave.mips_assembler_tests;

import static org.junit.Assert.*;

import com.github.mshockwave.mips_assembler.emitters.Emitter;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmLexer;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class EmitterIInstructionTests {
    @Test
    public void testITypeInstruction1(){
        System.out.println("Testing I type instruction by i_type_1.S...");
        /*
        * Test branch instructions
        * */

        InputStream testCaseStream = getClass().getClassLoader().getResourceAsStream("i_type_1.S");

        assertNotNull("i_type_1.S is null", testCaseStream);

        try{
            MipsAsmLexer lexer = new MipsAsmLexer( new ANTLRInputStream(testCaseStream) );
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            MipsAsmParser parser = new MipsAsmParser(tokens);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            Emitter emitter = new Emitter(0x200, outStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(emitter, parser.prog());

            /**-----------------Verify----------------------**/

            ByteBuffer buffer = ByteBuffer.wrap(outStream.toByteArray()).order(ByteOrder.BIG_ENDIAN);
            assertEquals("Output byte length", 4 * 16, buffer.array().length);

            /*
            int i;
            for(i = 0; i < 16; i++){
                int v = buffer.getInt(i * 4);
                System.out.println("0x" + Integer.toHexString(v));
            }*/

            int v = buffer.getInt(4);
            assertEquals("Instruction Length", 14, v);

            v = buffer.getInt(8);
            assertEquals("lhu  $2, 0($0)", 0x94020000, v);

            v = buffer.getInt(12);
            assertEquals("bne  $2, $0, x_not_0", 0x1440000b, v);

            v = buffer.getInt(16);
            assertEquals("ori  $5, $0, 0x88", 0x34050088, v);

            v = buffer.getInt(28);
            assertEquals("bne  $6, $0, x_0_else", 0x14c00005, v);

        }catch (IOException e){
            fail("Failed loading resource file");
            e.printStackTrace();
        }catch (Exception e){
            fail("Unknown Exception");
            e.printStackTrace();
        }
    }
}
