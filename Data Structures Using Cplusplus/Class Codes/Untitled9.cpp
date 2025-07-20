// wap to swap two numbers using pointers .

#include<iostream>
using namespace std;

int main()
{
	int *a , *b ;
	int num1 , num2 ;
	
	a = &num1 ;
	b = &num2 ;
	
	cout << "Enter The First Number :- ";
	cin >> num1 ;
	
	cout << "Enter The Second Number :- ";
	cin >> num2 ;
	
	cout << "Before Swapping A = " << *a << " And B = " << *b << "\n";
	
	*a = *a + *b;
	*b = *a - *b;
	*a = *a - *b ;
	
	cout << "After Swapping A = " << *a << " And B = " << *b ;
	
}