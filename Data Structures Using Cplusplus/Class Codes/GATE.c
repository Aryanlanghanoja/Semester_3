#include<stdio.h>
#define print(a,b) 	printf("%d %d\n",a,b );

global;
int a = 9 ;
int b = 11 ;

C();
D();
E();

int main()
{
	int a = 5 ;
	int b = 3 ;
	
	print(a,b);
	
	C();
	
	a = 3 , b = 6 ;
	
	E();
}

C()
{
	int b = 70 ;
	D();
	print(a,b);
	a = 1 , b = 2 ;
}

D()
{
	print(a,b);
	E();
	a = 7 , b = 8 ;
	
}

E()
{
	int a = 77 ;
	print(a,b);
	a = 4 , b = 5 ;
}