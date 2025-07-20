// Subtract two 16-bit numbers// (HL-BC and store answer in HL)

LXI H,5678H;
LXI B,1234H;
MOV A,L;
SUB C;
MOV L,A;
MOV A,H;
SUB B;
MOV B,A;
MVI A,00H;
SBB B;
MOV H,B;