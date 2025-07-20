// TOtal Amount , Percentage

#include<iostream>
using namespace std;

int main() {
    double Totalamount;
    double Percentage;

    cout << "Enter The Total Amount :- ";
    cin >> Totalamount ;

    cout << "Enter The GST Percentage :- " ;
    cin >> Percentage ;

    double Amount = (100 * Totalamount) / (100 + Percentage ) ;

    cout << "The Amount Without GST Is " << Amount ;
}