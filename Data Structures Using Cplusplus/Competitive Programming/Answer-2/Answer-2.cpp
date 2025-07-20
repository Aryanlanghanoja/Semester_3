#include<iostream>
#include<string>
using namespace std;

string Reverse(string input) {

    cout << input << endl;
    for(int i=0;i<input.length() / 2;i++) {
        char temp = input[i] ;
        input[i] = input[input.length() - i- 1];
        input[input.length() - i- 1] = temp ;
    }
    cout << input << endl;
    return input;
}

bool Balanced(string input) {
    string output = "";
    for(int i=0;i<input.length() ;i++) {
        if(!isalpha(input[i])) {
            if(input[i] == ')') {
                output += '(' ;
            }

            else if(input[i] == '}') {
                output += '{' ;
            }

            else if(input[i] == ']') {
                output += '[' ;
            }

            else {
                output += input[i] ;
            }
        } 
    }

    if(output.length() % 2 != 0) {
        return false;
    }

    if(output.length() == 0) {
        return true;
    }

    return output == Reverse(output) ;
}



int main() {
    string input ;
     
    cout << "Enter The Input String :- " ;
    cin >> input ;

    if(Balanced(input)) {
        cout << input << " Is Balanced String." << endl ;
    }

    else {
        cout << input << " Is Not Balanced String." << endl ;
    }

}

