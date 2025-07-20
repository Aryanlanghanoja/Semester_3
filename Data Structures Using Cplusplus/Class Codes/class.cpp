#include<iostream>
using namespace std;

class A {
    private:
        int marks;

    public : 
        void setMarks(int num) {
            marks = num ;
        }

        int getMarks(){
            return marks ;
        }

        friend int Addmeter(A);
};

int Addmeter(A a) {
    return a.marks;
}

int main() {
    A a ;
    a.setMarks(34);
    cout << a.getMarks() << endl;
    cout << Addmeter(a);

}