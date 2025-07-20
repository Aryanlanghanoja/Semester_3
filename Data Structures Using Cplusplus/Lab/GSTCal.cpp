#include<iostream>
using namespace std ;

int main() {
    double amount;
    double percentage;

    cout << "Enter The Amount :- ";
    cin >> amount ;

    cout << "Enter The Percentage :- ";
    cin >> percentage ;
    
    double IGST = (amount * percentage * 0.01) ;
    double CGST = (amount * percentage * 0.01) /2;
    double SGST = (amount * percentage * 0.01) /2;
    double amountgst = amount + (amount * percentage * 0.01);

    cout << "Amount :- " << amount << endl ;
    cout << "Percentage :- " << percentage << endl ;
    cout << "IGST :- " << IGST << endl ;
    cout << "CGST :- " << CGST << endl ;
    cout << "SGST :- " << SGST << endl ;
    cout << "Amount After GSt :- " << amountgst << endl ;


}