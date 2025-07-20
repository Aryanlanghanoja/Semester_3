#include<iostream>
using namespace std;

class Stack {
    int top;
    int size;
    int* Array;

public:
    Stack(int n) {
        size = n;
        top = -1;
        Array = new int[size];
    }

    void Push(int num) {

        if (top == size - 1) {
            cout << "Cannot Push " << num << " Because Stack Overflow Occured." << endl;
            return;
        }

        Array[++top] = num;
        cout << num << " Is Pushed In Your Stack." << endl;
    }

    void Pop() {

        if (top == -1) {
            cout << "Cannot Popped From Stack. Because Stack Underflow Occured." << endl;
            return;
        }

        --top;
        return;
    }

    int GetTop() {
        return Array[top];
    }

    bool isFull() {
        return top == size - 1;
    }

    bool isEmpty() {
        return top == -1;
    }

    void Display() {
        for (int i = 0;i <= top;i++) {
            cout << Array[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    int choice, value, size;

    cout << "Enter The Size Of A Stack :- ";
    cin >> size;

    Stack stack(size);

    cout << "Choose The Number To Perform Various Operartion On Your Stack :- " << endl;

    do {
        cout << "Stack Menu:" << endl;
        cout << "1. Push" << endl;
        cout << "2. Pop" << endl;
        cout << "3. Check Underflow" << endl;
        cout << "4. Check Overflow" << endl;
        cout << "5. Get Top " << endl;
        cout << "6. Display" << endl;
        cout << "7. Quit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter value to push: ";
            cin >> value;
            stack.Push(value);
            break;
        case 2:
            stack.Pop();
            break;
        case 3:
            if (stack.isEmpty())
                cout << "Stack Underflow Occured." << endl;
            else
                cout << "Stack Underflow Is Not Occured." << endl;
            break;
        case 4:
            if (stack.isFull())
                cout << "Stack Overflow Occured." << endl;
            else
                cout << "Stack Overflow Is Not Occured." << endl;
            break;
        case 5:
            value = stack.GetTop();
            cout << "The Top Of The Stack Is " << value << endl;
            break;
        case 6:
            cout << "Your Stack Is :- ";
            stack.Display();
            break;
        case 7:
            cout << "Exiting program." << endl;
            break;
        default:
            cout << "Invalid choice. Please select a valid option." << endl;
            break;
        }
    } while (choice != 7);

    return 0;
}