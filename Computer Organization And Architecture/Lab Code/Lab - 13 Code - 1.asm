	   LDA 8200
	   MVI B,00
	   MOV C,B
	   CPI 64
	   JC HUNT
	   SUI 64
	   INR B
	
	   STA 8202
	   HLT
	   JC UNIT
	   SUI 0A
	   INR C
	   JMP HUNT

UNIT:	   STA 8201
	   MOV A,C
	   STA 8202
	   MOV A,B
	   STA 8203
	   HLT
