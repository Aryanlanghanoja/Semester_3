#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int num,i;
	
	cout << "Enter A Number :- ";
	cin >> num ;
	
	for(i=2 ;i<=sqrt(num);i++)
	{
		if(num%i == 0)
		{
			break;
		}
	}
	
	if(num == i)
	{
		cout << num << " Is A Prime Number" ;
	}
	
	else
	{
		cout << num << " Is Not A Prime Number" ;
	}
}