#include<iostream>
using namespace std;

int main() {
    int array[5] = {10,-1,9,4,-8};

    cout << "Before :- " << endl ;

    for(int i = 0 ; i < sizeof(array) / sizeof(array[0]) ; i++) {
        cout << array[i] << " " ;
    }

    for(int i=0;i<(sizeof(array) / sizeof(array[0])) / 2 ;i++) {
        int temp = array[i];
        array[i] = array[(sizeof(array) / sizeof(array[0])) - i - 1] ;
        array[(sizeof(array) / sizeof(array[0])) - i - 1] = temp ;
    }

    cout << endl << "After :- " << endl ;

    for(int i = 0 ; i < sizeof(array) / sizeof(array[0]) ; i++) {
        cout << array[i] << " " ;
    }
    
}