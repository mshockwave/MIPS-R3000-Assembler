MIPS R3000 Assembler
====================
Assembler for [this simulator](https://github.com/mshockwave/MIPS-R3000-CPU-Simulator).  
Checkout the simulator's documentations for more details about ISA spec.

Design
------
This project use [ANTLR4](http://www.antlr.org/index.html) as parser and lexer. The grammar could be found in [MipsAsm.g4](gen-src/main/antlr/MipsAsm.g4).  
The compatible Java version is 1.7.

Build / Run
-----------
* Build
  `./gradlew installApp`
  The result would be under build/install/mips-r3000-assembler directory.
  
* Run unit tests
  `./gradlew test`
  
* Run
  `cd build/install/mips-r3000-assembler`
  `./bin/mips-r3000-assembler` (Linux/Mac)
  `./bin/mips-r3000-assembler.bat` (Windows)
  The commandline options' description would be displayed if no arguments were given.  
  You can also run by gradle:  
  `./gradlew run`
  
* Package to zip
  `./gradelw distZip`