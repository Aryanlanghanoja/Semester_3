#include<iostream>
using namespace std ;

int main()
{
	int *a , *b ;
	
	cin>>*a;
	a = &a ;
	cin>>*b;
	b = &b ;
	
		
	*a = *a + *b;
	*b = *a - *b;
	*a = *a - *b ;
	
	cout << "After Swapping A = " << *a << " And B = " << *b ;
}