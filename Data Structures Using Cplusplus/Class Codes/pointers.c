#include<stdio.h>

void main()
{
//	int a = 10 ;

	char *p ;
	char a ;
	p = &a ;
	
//	printf("%u\n%d\n",&a,a);
	printf("p = %u\n",p);
	printf("*p = %u\n",*p);
	printf("&p = %u",&p);
	printf("\np = %u\n",p);
	printf("*p = %u\n",*p);
	printf("&p = %u",&p);
	
}