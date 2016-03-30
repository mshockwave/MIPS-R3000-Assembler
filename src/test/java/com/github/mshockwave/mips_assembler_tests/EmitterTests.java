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

            /**-----------------Check answer----------------------**/

            ByteBuffer buffer = ByteBuffer.wrap(outStream.toByteArray()).order(ByteOrder.BIG_ENDIAN);
            assertEquals("Output byte length", 6 * 4, buffer.array().length);

            System.out.println("Raw:");
            int i;
            byte[] bytes = buffer.array();
            for(i = 0; i < 24; i++){
                System.out.print(String.format("0x%x ", bytes[i]));
            }
            System.out.println(" ");


            for(i = 0; i < 6; i++){
                int v = buffer.getInt(i * 4);
                System.out.println("0x" + Integer.toHexString(v));
            }

        }catch (IOException e){
            fail("Failed loading resource file");
            e.printStackTrace();
        }
    }
}
