#include<iostream>
using namespace std;

int Sum(int num) {
    int ans = 0 ;
    while(num != 0) {
        ans = ans + num% 10 ;
        num = num / 10 ;
    }

    return ans;
}

// int Sum(int num) {
//     int ans;

//     string strnum = string(num);
//     int start = 0 ;
//     int end = strnum.length();

//     if(end % 2 == 0) {
//         while(start != end) {
//             ans = int(strnum[start] - '0') + int(strnum[end] - '0');
//             start++;
//             end--;
//         }

//         return ans + int(strnum[start] - '0') + int(strnum[end] - '0');
//     }

//     else {
//         while(end != start + 1) {
//             ans = int(strnum[start] - '0') + int(strnum[end] - '0');
//             start++;
//             end--;
//         }
//         return ans + int(strnum[start] - '0') + int(strnum[end] - '0');
//     }

// }

int main() {
    int input;

    cout << "Enter The Number :- " ;
    cin >> input ;

    int output = Sum(input) ;

    cout << "The Sum Of All Digits Of " << input << " Is " << output << endl ;

}