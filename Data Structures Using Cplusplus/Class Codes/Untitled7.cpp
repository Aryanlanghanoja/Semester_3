#include<iostream>
using namespace std;

int GCD(int num1,int num2) ;
int main()
{
	int num1,num2;
	
	cout << "Enter The First Number :- " ;
	cin >> num1 ;
	
	cout << "Enter The Second Number :- " ;
	cin >> num2 ;
	
	int ans = GCD (num1,num2) ;
	
	cout << "The GCD Of " << num1 << " and " << num2 << " Is " << ans ;
	
	return 0 ;
}

int GCD (int num1 ,int num2)
{
	if(num1 % num2 == 0)
	{
		return num2 ;
	}
	
	else
	{
		return GCD(num2 , num1 % num2) ;
	}
}