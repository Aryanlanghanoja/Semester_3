#include<iostream>
using namespace std;

int main(){
	int a[6] = {5,50,53,6,39,10} ;
	int count = 0;
	
	for(int i=0;i<(sizeof(a)/sizeof(a[0]));i++){
		for(int j=i;j<(sizeof(a)/sizeof(a[0]));j++){
			count ++ ;
			if(a[j] < a[i] ){
				int temp;
				temp = a[i];
				a[i]= a[j] ;
				a[j] = temp ;
			}
		}
	}
	
	for(int i=0;i<(sizeof(a)/sizeof(a[0]));i++){
		cout<<a[i] << "\n";
	}
	
	cout << count ;
}