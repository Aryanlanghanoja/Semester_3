// Create c++  programm to find the sum of n numbers using recursion.

#include<iostream>
using namespace std;

int sum(int n)
{
	if(n == 1)
		return 1 ;
	
	else
		return( n + sum (n - 1)) ;
		
}

int main()
{
	int n;
	
	cout << "Enter A Number :- " ;
	cin >> n ;	
		
	cout << "The Sum of First " << n << " Numbers Is " << sum(n) ;
	
	return 0 ;
}