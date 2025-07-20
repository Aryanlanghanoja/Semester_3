#include<iostream>
using namespace std;

int main(){
	int num;
	
	cout << "Enter The Number :-" ;
	cin >> num ;
	
	int revnumber = 0; 
	
	while(num!=0) { 
		int digit = num %10 ;
		revnumber = revnumber*10 + digit ; 
		num = num / 10 ; 
	}
	
	cout << "The Reverse Number Is " << revnumber ;
}