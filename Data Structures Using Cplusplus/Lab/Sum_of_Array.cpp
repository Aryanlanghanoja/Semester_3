#include<iostream>
using namespace std;

int main() {
	int arr[10];
	
	for(int i=0;i<10;i++) {
		cout << "Enter The Integer At " << i << " th Index :- ";
		cin >> arr[i] ;
	}
	
	int *ptr = arr ;
	
	int sum = 0;
	
	for(int i=0;i<10;i++) {
		sum = sum + *ptr ;
		*ptr++ ;
	}
	
	cout << "The Sum Of All Elements In Array Is " << sum ;
}