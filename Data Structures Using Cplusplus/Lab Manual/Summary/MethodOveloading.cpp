#include<iostream>
using namespace std;

class Base {
public:
    virtual void print() {
        cout << "This Is Base Class Print Method." << endl;
    }

    void display() {
        cout << "This Is Base Class Display Methos." << endl;
    }
};

class Derrived : public Base {
public:
    void print() {
        cout << "This Is Derrived Class Print Method." << endl;
    }

    void display() {
        cout << "This Is Derrived Class Display Methos." << endl;
    }

};

int main() {

    Base* baseptr;
    Derrived d;
    baseptr = &d;

    baseptr->print();
    baseptr->display();

    return 0;
}