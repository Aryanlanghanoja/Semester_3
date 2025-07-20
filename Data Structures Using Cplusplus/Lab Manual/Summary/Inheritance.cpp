#include<iostream>
using namespace std;

class A {
    public :
        void Function() {
            cout << "Hii From A " << endl ;
        }
};

class B : public A {
    public :
        void Function1() {
            cout<< "Hii From B" << endl ;
        }
};

int main() {
    B b ;
    b.Function();
    b.Function1();

}
