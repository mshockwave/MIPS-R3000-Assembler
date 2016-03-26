package com.github.mshockwave.mips_assembler;

import com.github.mshockwave.mips_assembler.grammars.MipsAsmBaseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmitterBase extends MipsAsmBaseListener{

    //Construct context
    protected final Map<String, Field> mLabelsMap = new HashMap<>();
    protected final Map<String, Field> mUnResolvedLabelsMap = new HashMap<>();

    protected final List<Instruction> mInstructions = new ArrayList<>();
}
