	   LDA C030
	   MVI C,04
	   LXI H,C031

LOOP:	   CMP M
	   JNC SKIP
	   MOV A,M

SKIP:	   INX H
	   DCR C
	   JNZ LOOP
	   STA C040
	   HLT
