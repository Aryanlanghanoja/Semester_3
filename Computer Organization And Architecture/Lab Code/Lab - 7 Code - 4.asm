	   LDA 2000
	   MOV D,A
	   MVI B,02

L1:	   SUB B
	   JNZ L1
	   MVI C,00
	   CMP C
	   JZ L2
	   JNZ L3

L2:	   MOV A,D
	   STA C201
	   HLT

L3:	   MOV A,D
	   STA C202
	   HLT
