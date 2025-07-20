#include<stdio.h>
#include<conio.h>

int main()
{
	int a[5],i;
	int *p;
	p  = a ;
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	for(i=0;i<5;i++)
	{
		printf("%d\n",&a[i]);
	}
	
	printf("%u\n",a);
	printf("%u\n",p);
	printf("%u",&a[0]);
	return 0;
}