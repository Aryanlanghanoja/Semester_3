#include<iostream>
using namespace std;

int main(){
	int num;
	
	cout << "Enter The Number :-" ;
	cin >> num ;
	
	int mul = 1;
	while(num != 0) {
		int digit ;
		digit = num % 10 ;
		mul = mul * digit ;
		num = num / 10 ;		
	}
	
	cout << "The Multiplication Of All Digits Is " << mul ;
}