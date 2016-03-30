package com.github.mshockwave.mips_assembler;

import com.github.mshockwave.mips_assembler.emitters.Emitter;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmLexer;
import com.github.mshockwave.mips_assembler.grammars.MipsAsmParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    @Option(name="--base-address", aliases = {"-b"},
            usage = "Specific input initial PC address.")
    private String mBaseAddress = "0x0";

    @Option(name="--output-file", aliases = {"-o"},
            usage = "Specific output file name.")
    private File mOutputFile = new File("iimage.bin");

    //Other arguments
    //Input file
    @Argument
    private List<String> mArguments = new ArrayList<>();

    public static void main(String[] args){
        new Main().doMain(args);
    }

    private void doMain(String[] args){
        CmdLineParser cmdParser = new CmdLineParser(this);

        try{

            cmdParser.parseArgument(args);

            if(mArguments.isEmpty())
                throw new CmdLineException(cmdParser, "No input file given", new IllegalArgumentException());

            File inputFile = new File(mArguments.get(0));
            if(!inputFile.exists()){
                throw new CmdLineException(cmdParser,
                        "File " + mArguments.get(0) + " not exist",
                        new IllegalArgumentException());
            }

            int baseAddress;
            try{
                baseAddress = Utils.transformHex(mBaseAddress, "");
            }catch (RuntimeException e){
                throw new CmdLineException(cmdParser,
                        "Invalid base address: " + mBaseAddress,
                        new IllegalArgumentException());
            }

            InputStream inputStream;
            OutputStream outputStream;
            try{
                inputStream = new BufferedInputStream(new FileInputStream(inputFile));
                outputStream = new BufferedOutputStream(new FileOutputStream(mOutputFile));

                MipsAsmLexer lexer = new MipsAsmLexer( new ANTLRInputStream(inputStream) );
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                MipsAsmParser parser = new MipsAsmParser(tokens);
                Emitter emitter = new Emitter(baseAddress, outputStream);

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(emitter, parser.prog());

                inputStream.close();
                outputStream.close();

            }catch (IOException e){
                System.err.println("Error handling input or output files");
                e.printStackTrace();
            }

        }catch (CmdLineException e){
            cmdParser.printUsage(System.err);
        }
    }
}
