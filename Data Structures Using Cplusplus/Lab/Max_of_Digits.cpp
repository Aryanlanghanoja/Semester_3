#include<iostream>
using namespace std;

int main(){
	int num;
	
	cout << "Enter The Number :-" ;
	cin >> num ;
	
	int max = 0;
	while(num != 0) {
		if(num%10 > max) {
			max = num % 10 ;
		}
		
		num = num / 10 ;		
	}
	
	cout << "The Maximum Of All Digits Is " << max ;
}