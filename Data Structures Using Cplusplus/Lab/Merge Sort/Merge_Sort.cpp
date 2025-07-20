#include<iostream>
using namespace std;

int main() {
    int array_one[5];
    int array_two[5];
    int array_sorted[10] ;

    cout << "Enter The Elements Of First Array :- " << endl ;

    for(int i=0 ; i < (sizeof(array_one)/ sizeof(array_one[0])) ; i++) {
        cout << "Enter array_one[" << i << "] :- " ;
        cin >> array_one[i] ;
    }

    cout << "Enter The Elements Of Second Array :- " << endl ;

    for(int i=0 ; i < (sizeof(array_two)/ sizeof(array_two[0])) ; i++) {
        cout << "Enter array_two[" << i << "] :- "  ;
        cin >> array_two[i] ;
    }

    cout << "First Array :- " << endl ;

    for(int i=0 ; i < (sizeof(array_one)/ sizeof(array_one[0])) ; i++) {
        cout << array_one[i] << " " ;
    }
    cout << endl ;

    cout << "Second Array :- " << endl ;

    for(int i=0 ; i < (sizeof(array_two)/ sizeof(array_two[0])) ; i++) {
        cout << array_two[i] << " " ;
    }
    cout << endl ;

    
}
