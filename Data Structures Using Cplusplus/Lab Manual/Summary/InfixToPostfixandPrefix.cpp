#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
using namespace std;

// Function to determine the precedence of operators
int Precedence(char c) {
    if (c == '^') {
        return 3;
    }
    else if (c == '*' || c == '/') {
        return 2;
    }
    else if (c == '+' || c == '-') {
        return 1;
    }
    else {
        return -1;
    }
}

// Function to convert an infix expression to a postfix expression
string infixToPostfix(string infixexpression) {
    stack<char> st;
    string postfixexpression;

    for (int i = 0; i < infixexpression.length(); i++) {
        if ((infixexpression[i] >= 'a' && infixexpression[i] <= 'z') || (infixexpression[i] >= 'A' && infixexpression[i] <= 'Z')) {
            postfixexpression += infixexpression[i]; // Append operands to the postfix expression
        }
        else if (infixexpression[i] == '(') {
            st.push(infixexpression[i]); // Push opening parenthesis onto the stack
        }
        else if (infixexpression[i] == ')') {
            // Pop and append operators until an opening parenthesis is encountered
            while (!st.empty() && st.top() != '(') {
                postfixexpression += st.top();
                st.pop();
            }
            if (!st.empty()) {
                st.pop(); // Discard the opening parenthesis
            }
        }
        else {
            // Pop operators with higher or equal precedence and append them
            while (!st.empty() && Precedence(st.top()) >= Precedence(infixexpression[i])) {
                postfixexpression += st.top();
                st.pop();
            }
            st.push(infixexpression[i]); // Push the current operator onto the stack
        }
    }

    // Append remaining operators from the stack to the postfix expression
    while (!st.empty()) {
        postfixexpression += st.top();
        st.pop();
    }
    return postfixexpression; // Return the final postfix expression
}

// Function to convert an infix expression to a prefix expression
string infixToPrefix(string infixexpression) {
    reverse(infixexpression.begin(), infixexpression.end()); // Reverse the infix expression

    stack<char> st;
    string prefixexpression;

    for (int i = 0; i < infixexpression.length(); i++) {
        if ((infixexpression[i] >= 'a' && infixexpression[i] <= 'z') || (infixexpression[i] >= 'A' && infixexpression[i] <= 'Z')) {
            prefixexpression += infixexpression[i]; // Append operands to the prefix expression
        }
        else if (infixexpression[i] == ')') {
            st.push(infixexpression[i]); // Push closing parenthesis onto the stack
        }
        else if (infixexpression[i] == '(') {
            // Pop and append operators until a closing parenthesis is encountered
            while (!st.empty() && st.top() != ')') {
                prefixexpression += st.top();
                st.pop();
            }
            if (!st.empty()) {
                st.pop(); // Discard the closing parenthesis
            }
        }
        else {
            // Pop operators with higher or equal precedence and append them
            while (!st.empty() && Precedence(st.top()) >= Precedence(infixexpression[i])) {
                prefixexpression += st.top();
                st.pop();
            }
            st.push(infixexpression[i]); // Push the current operator onto the stack
        }
    }
    // Append remaining operators from the stack to the prefix expression
    while (!st.empty()) {
        prefixexpression += st.top();
        st.pop();
    }
    reverse(prefixexpression.begin(), prefixexpression.end()); // Reverse the prefix expression
    return prefixexpression; // Return the final prefix expression
}

int main() {
    // Convert infix expression to postfix and display the result
    string Postfix = infixToPostfix("(a+b)*c");
    string Prefix = infixToPrefix("(a+b)*c");

    cout << "Postfix Expression :- " << Postfix << endl;
    cout << "Prefix Expression :- " << Prefix << endl;
    return 0;
}
