#include<iostream>
using namespace std;

class B; // Forward declaration for class B

class A {
private:
    int num1;

public:
    A(int ip1) {
        num1 = ip1;
    }

    friend int sum(A, B);
};

class B {
private:
    int num2;

public:
    B(int ip1) {
        num2 = ip1;
    }

    friend int sum(A, B);
};

int sum(A a, B b) {
    return a.num1 + b.num2;
}

int main() {
    A a(3); // Create an object of class A
    B b(4); // Create an object of class B
    cout << sum(a, b);
    return 0; // Add return statement to main
}
