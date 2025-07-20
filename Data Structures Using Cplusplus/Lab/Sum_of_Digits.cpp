#include<iostream>
using namespace std;

int main(){
	int num;
	
	cout << "Enter The Number :-" ;
	cin >> num ;
	
	int sum = 0;
	while(num != 0) {
		int digit ;
		digit = num % 10 ;
		sum = sum + digit ;
		num = num / 10 ;		
	}
	
	cout << "The Sum Of All Digits Is " << sum ;
}