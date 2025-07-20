#include <iostream>
using namespace std;

int main() {
    int size;
    int* Array;
    int temp;

    cout << "Enter the size of an array: " << endl;
    cin >> size;

    Array = new int[size];

    for (int i = 0; i < size; i++) {
        cout << "Enter the value of Array[" << i << "]: ";
        cin >> temp;
        Array[i] = temp;
    }

    cout << "Before Reversal :- " << endl ;

    for ( int i = 0 ; i < size ; i++) {
        cout << Array[i] << " " ;
    }

    for (int i = 0 ; i < size/2 ; i++) {
        int temp = Array[i] ;
        Array[i] = Array[size - i - 1];
        Array[size - i - 1] = temp ;
    }

    cout << "\nAfter Reversal :- " << endl ;

    for ( int i = 0 ; i < size ; i++) {
        cout << Array[i] << " " ;
    }

    delete[] Array;

    return 0;
}
