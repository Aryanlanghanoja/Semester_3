#include <iostream>
using namespace std;

class Stack {
    private:
        static const int MAX_SIZE = 100;
        int arr[MAX_SIZE];
        int top;

    public:
        Stack() {
            top = -1;
        }

        bool isEmpty() {
            return top == -1;
        }

        bool isFull() {
            return top == MAX_SIZE - 1;
        }

        void push(int value) {
            if (isFull()) {
                cout << "Stack is full. Cannot push more elements." << endl;
            } else {
                arr[++top] = value;
                cout << "Pushed " << value << " onto the stack." << endl;
            }
        }

        void pop() {
            if (isEmpty()) {
                cout << "Stack is empty. Cannot pop elements." << endl;
            } else {
                cout << "Popped " << arr[top--] << " from the stack." << endl;
            }
        }

        void display() {
            if (isEmpty()) {
                cout << "Stack is empty." << endl;
            } else {
                cout << "Stack elements: ";
                for (int i = 0; i <= top; ++i) {
                    cout << arr[i] << " ";
                }
                cout << endl;
            }
        }
};

int main() {
    Stack stack;
    int choice, value ,size;

    cout<< "Choose The Number To Perform Various Operartion On Your Stack :- " << endl;

    do {
        cout << "Stack Menu:" << endl;
        cout << "1. Push" << endl;
        cout << "2. Pop" << endl;
        cout << "3. Check Underflow" <<endl ;
        cout << "4. Check Overflow" << endl ;
        cout << "5. Display" << endl;
        cout << "6. Quit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter value to push: ";
                cin >> value;
                stack.push(value);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.isEmpty();
                break;
            case 4:
                stack.isFull();
                break;
            case 5:
                stack.display();
                break;
            case 6:
                cout << "Exiting program." << endl;
                break;
            default:
                cout << "Invalid choice. Please select a valid option." << endl;
                break;
        }
    } while (choice != 4);

    return 0;
}


