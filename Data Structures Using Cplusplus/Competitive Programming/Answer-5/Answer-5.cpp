#include <iostream>
#include<algorithm>
using namespace std;

int Binary_Search(int arr[],int key,int index) {
    int currmiddle = (sizeof(arr)/sizeof(arr[0]) + 1)/ 2 ;

    if(key == arr[currmiddle]) {
        return index + currmiddle ;
    }

    if(currmiddle == sizeof(arr) {
        return -1;
    }

    if(key > arr[currmiddle]) {
        int newArray[sizeof(arr)/sizeof(arr[0]) / 2];
        copy(arr + currmiddle , arr + sizeof(arr)/sizeof(arr[0]) - 1 , newArray);
        return Binary_Search(newArray,key,currmiddle);
    }

    else {
        int newArray[sizeof(arr)/sizeof(arr[0]) / 2];
        copy(arr , arr + currmiddle - 1 , newArray);
        return Binary_Search(newArray,key,currmiddle);
    }
}

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

    for(int i=0;i<size;i++) {
        int swapnum = 0 ;
        for(int j=0;j<size-i;j++) {
            if(Array[j] > Array[j+1]){
                swap(Array[j],Array[j+1]);
            }
        }

        if(swapnum == 0) {
            break;
        }
    }

    int key;

    cout << "Enter The Number You Want To Find :- " ;
    cin >> key ;

    int index = Binary_Search(Array,key,0);

    if(index == -1) {
        cout << key << " Is Not Found In Array." << endl ;
    }

    else {
        cout << "The " << key << " Is Founded On " << index << " th Index In Sorted Array."<<endl;
    }

    delete[] Array;

    return 0;
}
