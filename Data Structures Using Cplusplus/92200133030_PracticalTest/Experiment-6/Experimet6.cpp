#include<iostream>
using namespace std;

void Swapbyvalue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

void SwapbyReference(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int a, b;

    cout << "Enter The First Number :- ";
    cin >> a;

    cout << "Enter The Second Number :- ";
    cin >> b;

    cout << "Before Swapping :- Number - 1 :- " << a << " and Number - 2 :- " << b << endl;

    Swapbyvalue(a, b);

    cout << "After Swapping By Value :- Number - 1 :- " << a << " and Number - 2 :- " << b << endl;

    SwapbyReference(&a, &b);

    cout << "After Swapping By Reference :-  Number - 1 :- " << a << " and Number - 2 :- " << b << endl;

    return 0;
}