#include<iostream>
using namespace std;

class Area {
    double length;
    double breadth;

public:
    Area(double l, double b) {
        length = l;
        breadth = b;
    }

    double returnArea() {
        return length * breadth;
    }
};

int main() {

    double length, breadth;

    cout << "Enter The Length Of A Rectangle :- ";
    cin >> length;

    cout << "Enter The Breadth Of A Rectangle :- ";
    cin >> breadth;

    Area A(length, breadth);

    double Area = A.returnArea();

    cout << "The Area of Rectangle Haning Length :- " << length << " Unit and Having Breadth :- " << breadth << " Is " << Area << " Sq.Unit." << endl;

    return 0;
}