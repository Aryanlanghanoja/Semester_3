#include<iostream>
using namespace std ;

class Stack {
    public :
    int arr[10];
    int top = -1 ;

    bool isEmpty() {
        return top==-1 ;
    }

    bool isFull() {
        return top == 9 ;
    }

    void push(int data) {
        if(isFull() == true) {
            cout << "Stack Overflow Condition." <<endl ;
        } 
        
        else {
            arr[++top] = data ;
            cout << "Pushed " << data << " Into Stack." << endl ;
        }
        cout << endl ;
    }

    void pop() {
        if(isEmpty() == true) {
            cout << "STack Underflow Condition." << endl ;
        }

        else {
            cout<< "Poped " << arr[top--] << " From Stack." ;
        }
        cout<< endl ;
    }

    void disply() {

        if(top == -1){
            for(int i=0 ;i < top;i++) {
                cout << arr[i] << " " ;
            }
            cout << endl ;
    }
    }

};
    int main() {
        Stack stack;
        int choice;

        while(choice != 6) {
            cout << "Enter The CHoice To Perform The Operation On Stack." << endl ;
            cout << "1) Push\n2) Pop\n3)Check If Stack Is Empty Or Not\n4)Check If Stack Is Full Or Not.\n5)Dislay The Stack.\n6)Quit The Programm.";
            cout<< "Enter The Choice :- ";
            cin >> choice ;

            switch(choice) {
                case 1 : 
                    int data ;
                    cout << "Enter The Value To Push Into Stack."<<endl;
                    cin >> data ;
                    stack.push(data);
                    break;

                case 2 :
                    stack.pop();
                    break;
                
                case 3 :
                    if(stack.isEmpty()) {
                        cout << "The Stack Is Empty." << endl ; 
                    }

                    else {
                        cout << "The Stack Is Not Empty." << endl ;
                    }

                    break;

                case 4 :

                    if(stack.isFull()) {
                        cout << "The Stack Is Full." << endl ; 
                    }

                    else {
                        cout << "The Stack Is Not Full." << endl ;
                    }

                    break;

                case 5 :
                    stack.disply();
                    break;
            }
        }
    }
