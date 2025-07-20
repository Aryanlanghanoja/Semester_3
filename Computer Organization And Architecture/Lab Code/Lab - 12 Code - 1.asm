	   LDA 2000
	   ANI 0F
	   MOV B,A
	   LDA 2000
	   ANI F0
	   RLC
	   RLC
	   RLC
	   RLC
	   MOV D,A
	   MVI A,00
	   MVI C,0A

BACK:	   ADD D
	   DCR C
	   JNZ BACK
	   ADD B
	   STA 2001
	   HLT
