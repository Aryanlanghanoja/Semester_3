#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cout << "Enter The Number of Terms:- ";
	cin >> n ;
	
	int a = 0 ;
	int b = 1 ;
	int c ;
	
	int i = 0 ;
	
	cout << a << " " << b << " ";
	
	while(i < n)
	{
		c = a + b ;
		
		cout << c << " " ;
		a = b ;
		b = c ;
		i++;	
	}
}