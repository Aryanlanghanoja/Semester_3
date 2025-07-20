#include<iostream>
using namespace std;

int Sum_of_Factors(int n, int m) {
    if (m == 0) {
        return 0; 
    }
    
    if (n % m == 0) {
        return m + Sum_of_Factors(n, m - 1);
    } else {
        return Sum_of_Factors(n, m - 1);
    }
}

int main() {
    int num ;

    cout << "Enter The Number :- " ;
    cin >> num ;

    int ans = Sum_of_Factors(num, num);
    cout << "The Additition Of All The Factors of " << num << " Is " << ans << endl;
    return 0;
}
