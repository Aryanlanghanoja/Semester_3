LDA C101H;
MOV B,A;
LDA C100H;
MVI C,00H;
L1 : SUB B;
       INR C;
       CMP B;
       JP L1;
       MOV D,A;
       MOV A,C;
       STA C102H;
       MOV A,D;
       STA C103H;





