#include<iostream>
using namespace std;

void Least_prime_Factor(int n) {

    for(int i = 1 ; i <= n ; i++) {
        if(i==1 || i==2 || i==3) {
            cout << "Least Prime Factor Of " << i << " : " << i << endl ;
            continue;
        }

        for(int j = 2 ; j <= i ; j++) {
            if(i%j == 0) { 
                cout << "Least Prime Factor Of " << i << " : " << j << endl ;
                break;
            }
        }
    }

}

int main() {

    int n ;

    cout << "Enter The VAlue Of n :- " ;
    cin >> n ;

    Least_prime_Factor(n);
}