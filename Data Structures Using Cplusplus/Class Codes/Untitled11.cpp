#include<iostream>
#include<string>
using namespace std;

int main()
{
	char name[5];
	
	name[0] = 'A' ;
	name[1] = 'R' ;
	name[2] = 'Y' ;
	name[3] = 'A' ;
	name[4] = 'N' ;
	
	cout << "My Name Is :- \n" ; 
	
	for(int i = 0 ; i < 5 ; i++)
	{
		cout << name[i] <<"\n" ;
	}
	
	char *ptr ;
	string str ;
	
	cin >> str ;
	cout << str ;
	
	
}