#include<iostream>
#include<stack>
#include<string>
using namespace std;

bool CheckPelindromeUsingStack(string inputstring) {
    stack<char> charstack;
    string Reverse;

    for(int i=0;i<inputstring.length();i++){
        charstack.push(inputstring[i]);
    }

    while(!charstack.empty()){
        Reverse += charstack.top();
        charstack.pop();
    }

    return inputstring == Reverse;

}


int main() {
    string inputstring;

    cout << "Enter A String To Check It Is A Palindrome Or Not : -" << endl;
    cin >> inputstring ;

    if(CheckPelindromeUsingStack(inputstring)) {
        cout << inputstring << " Is Palindrome. "  << endl ;
    }

    else {
        cout << inputstring << " Is  Not Palindrome. "  << endl ;
    }
}