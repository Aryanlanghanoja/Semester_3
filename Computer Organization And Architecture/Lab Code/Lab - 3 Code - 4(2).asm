//Transfer the array (3 byte) of data starting from D000h to the locations starting from D050h by memory pointer with and without LDA/STA

LXI B,D000H;
LXI D,D050H;
LDAX B;
STAX D;
INX B;
INX D;
LDAX B;
STAX D;
INX B;
INX D;
LDAX B;
STAX D;