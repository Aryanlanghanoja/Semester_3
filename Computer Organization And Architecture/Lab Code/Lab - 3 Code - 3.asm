// Add the content of memory location D000h, D001h and store the result at memory locations D040h and D041H
MVI A,56H;
STA D000H;
MVI A,78H;
STA D001H;
LDA D000H;
MOV B,A;
LDA D001H;
ADD B;
STA D040H;
MVI A,00H;
ADC A;
STA D041H;
