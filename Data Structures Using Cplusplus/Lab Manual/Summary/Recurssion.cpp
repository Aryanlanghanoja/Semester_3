#include<iostream>
using namespace std;

int Sum(int n) {
    if(n == 1) {
        return n;
    }

    else {
        return n + Sum(n-1);
    }
}

int Factorial(int n) {
    if(n == 1 || n == 0) {
        return 1 ;
    }

    else {
        return n*Factorial(n-1) ;
    }
}

int main() {
    int N ;
    int ans ;
    int choice ;

    cout << "1) Sum Of First N Natural Number " << endl ;
    cout << "2) Find A Factorial Of N" << endl;
    cout << "Enter Your Choice How You Want to Demonstrate The Recursion :- " ;
    cin >> choice ;

    if ( choice == 1) {
        cout << "Enter A The Value Of N :- " << " " ;
        cin >> N ;

        ans = Sum(N);
        cout << "The Sum Of First " << N << " Number Is " << ans << endl ;
    }

    else {
        cout << "Enter A The Value Of N :- " << " " ;
        cin >> N ;

        ans = Factorial(N);
        cout << "The Factorial Of " << N << " Is " << ans << endl ;
    }



} 
