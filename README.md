MIPS R3000 Assembler
====================
Assembler for [this simulator](https://github.com/mshockwave/MIPS-R3000-CPU-Simulator).<br/>
Checkout the simulator's documentations for more details about ISA spec.

Design
------
This project use [ANTLR4](http://www.antlr.org/index.html) as parser and lexer. The grammar could be found in [MipsAsm.g4](gen-src/main/antlr/MipsAsm.g4).<br/>
The compatible Java version is 1.7.

Build / Run
-----------
* Build <br/>
  `./gradlew installApp`<br/>
  The result would be under build/install/mips-r3000-assembler directory.
  
* Run unit tests <br/>
  `./gradlew test`
  
* Run <br/>
  `cd build/install/mips-r3000-assembler`<br/>
  `./bin/mips-r3000-assembler` (Linux/Mac)<br/>
  `./bin/mips-r3000-assembler.bat` (Windows)<br/>
  The commandline options' description would be displayed if no arguments were given.<br/>
  You can also run by gradle:<br/>
  `./gradlew run`
  
* Package to zip <br/>
  `./gradelw distZip`