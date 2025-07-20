#include<iostream>
#include <cmath>
using namespace std ;

int main() {
    double initial_amount ;
    double final_amount;
    double CAGR;
    double time_period ;

    cout << "Enter Your Intial Amount Of Investments :- " ;
    cin >> initial_amount ;

    cout <<  "Enter The Final Amount Of Investment :- " ;
    cin >> final_amount ;

    cout << "Enter The Time Period(in years) :-" ;
    cin >> time_period ;

    CAGR = pow((final_amount / initial_amount),((1 / time_period) - 1)) * 100;

    cout << "Your CAGR Is :- " << CAGR << " %" << endl ; 

}
