#include<iostream>
using namespace std;

int main()
{
	int age;
	
	cout << "Enter Your Age :-" ;
	cin >> age ;
	
		if(age >= 60)
		{
			cout << "Senior Citizen" ;
		}
		
		else if (age>=19)
		{
			cout<< "Adult" ;
		}
		
		else if (age >= 12)
		{
			cout<< "Teen";
		}
		
		else if  (age > 1)
		{
			cout << "Child";
		}
		
		else if ( age > 0)
		{
			cout << "New Born" ;
		}
		
		else
		{
			cout << "Enter A Valid Input"
		}

	
	return 0;
}