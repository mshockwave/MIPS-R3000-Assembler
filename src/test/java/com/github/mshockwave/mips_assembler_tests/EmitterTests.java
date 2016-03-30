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

public class EmitterTests {

    @Test
    public void testRInstruction1(){
        System.out.println("Testing R type instruction by r_type_1.S...");
        /*
        * Test normal registers instructions
        * */

        InputStream testCaseStream = getClass().getClassLoader().getResourceAsStream("r_type_1.S");

        assertNotNull("r_type_1.S is null", testCaseStream);

        try{
            MipsAsmLexer lexer = new MipsAsmLexer( new ANTLRInputStream(testCaseStream) );
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            MipsAsmParser parser = new MipsAsmParser(tokens);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            Emitter emitter = new Emitter(0x0, outStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(emitter, parser.prog());

            /**-----------------Verify----------------------**/

            ByteBuffer buffer = ByteBuffer.wrap(outStream.toByteArray()).order(ByteOrder.BIG_ENDIAN);
            assertEquals("Output byte length", 4 * 6, buffer.array().length);

            //int i;
            /*
            System.out.println("Raw:");
            byte[] bytes = buffer.array();
            for(i = 0; i < 24; i++){
                System.out.print(String.format("0x%x ", bytes[i]));
            }
            System.out.println(" ");
            */

            int v = buffer.getInt(4);
            assertEquals("Instruction Length", 4, v);

            v = buffer.getInt(8);
            assertEquals("sub  $3, $2, $1", 0x00411822, v);

            v = buffer.getInt(12);
            assertEquals("add  $4, $1, $2", 0x00222020, v);

            v = buffer.getInt(16);
            assertEquals("xor  $4, $3, $4", 0x00642026, v);

            v = buffer.getInt(20);
            assertEquals("nor  $4, $4, $4", 0x00842027, v);
            /*
            for(i = 0; i < 6; i++){
                int v = buffer.getInt(i * 4);
                System.out.println("0x" + Integer.toHexString(v));
            }
            */

            testCaseStream.close();

        }catch (IOException e){
            fail("Failed loading resource file");
            e.printStackTrace();
        }
    }

    @Test
    public void testRInstruction2(){
        System.out.println("Testing R type instruction by r_type_2.S...");
        /*
        * Test special instructions
        * Jump, Shift .etc
        * */

        InputStream testCaseStream = getClass().getClassLoader().getResourceAsStream("r_type_2.S");

        assertNotNull("r_type_2.S is null", testCaseStream);

        try{
            MipsAsmLexer lexer = new MipsAsmLexer( new ANTLRInputStream(testCaseStream) );
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            MipsAsmParser parser = new MipsAsmParser(tokens);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            Emitter emitter = new Emitter(0x0, outStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(emitter, parser.prog());

            /**-----------------Verify----------------------**/

            ByteBuffer buffer = ByteBuffer.wrap(outStream.toByteArray()).order(ByteOrder.BIG_ENDIAN);
            assertEquals("Output byte length", 4 * 5, buffer.array().length);

            int v = buffer.getInt(4);
            assertEquals("Instruction Length", 3, v);

            v = buffer.getInt(8);
            assertEquals("jr   $ra", 0x03E00008, v);

            v = buffer.getInt(12);
            assertEquals("srl  $1, $1, 2", 0x00010882, v);

            v = buffer.getInt(16);
            assertEquals("sra  $1, $1, 3", 0x000108C3, v);

            testCaseStream.close();

        }catch (IOException e){
            fail("Failed loading resource file");
            e.printStackTrace();
        }
    }
}
