#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};

class CircularQueue {
private:
    Node* front;
    Node* rear;
    int size;
    int no_of_elements = 0;

public:
    CircularQueue(int num) { // Added public access specifier
        front = NULL;
        rear = NULL;
        size = num;
    }

    bool isEmpty() {
        return front == NULL;
    }

    bool isFull() {
        return no_of_elements == size;
    }

    void enqueue(int num) {
        if (isFull()) {
            cout << "Queue Is Full." << endl;
            return;
        }

        Node* n = new Node(num);

        if (isEmpty()) {
            front = n;
        } else {
            rear->next = n;
        }

        rear = n;
        rear->next = front;
        no_of_elements++; // Increment the number of elements
        cout << num << " Is Enqueued In Your Queue." << endl;
    }

    void dequeue() {
        if (isEmpty()) {
            cout << "Queue Is Empty." << endl;
        } else {
            int remove = front->data;

            if (front == rear) {
                delete front;
                front = rear = NULL;
            } else {
                Node* todelete = front;
                front = front->next;
                rear->next = front;
                delete todelete;
            }

            no_of_elements--; // Decrement the number of elements
            cout << remove << " Is Dequeued From Your Queue." << endl;
        }
    }

    void display() {
        if (isEmpty()) {
            cout << "Queue Is Empty." << endl;
        } else {
            Node* temp = front;
            cout << "Your Queue Is: ";
            do {
                cout << temp->data << " ";
                temp = temp->next;
            } while (temp != front);
            cout << endl;
        }
    }

    int getFront() {
        return front->data;
    }

    int getRear() {
        return rear->data;
    }
};

int main() {
    int size;
    int num;

    cout << "Implementation Of Circular Queue " << endl;
    cout << "Enter The Size Of Your Queue:-" << endl;
    cin >> size;

    CircularQueue circularqueue(size);
    int choice = -1;

    do {
        cout << "Circular Queue Menu:- " << endl;
        cout << "1) Enqueue" << endl;
        cout << "2) Dequeue" << endl;
        cout << "3) Display Queue" << endl;
        cout << "4) Check if Empty" << endl;
        cout << "5) Check if Full" << endl;
        cout << "6) Get Front Element" << endl;
        cout << "7) Get Rear Element" << endl;
        cout << "8) Quit" << endl;
        cout << "Enter Your Choice To Perform The Operation On Queue:- ";
        cin >> choice;

        switch (choice) {
            case 1: {
                cout << "Enter The Number To Enqueue In Your Queue:- ";
                cin >> num;
                circularqueue.enqueue(num);
                break;
            }
            case 2: {
                circularqueue.dequeue();
                break;
            }
            case 3: {
                circularqueue.display();
                break;
            }
            case 4: {
                if (circularqueue.isEmpty()) {
                    cout << "Queue is Empty." << endl;
                } else {
                    cout << "Queue is not Empty." << endl;
                }
                break;
            }
            case 5: {
                if (circularqueue.isFull()) {
                    cout << "Queue is Full." << endl;
                } else {
                    cout << "Queue is not Full." << endl;
                }
                break;
            }
            case 6: {
                if (!circularqueue.isEmpty()) {
                    cout << "Front Element: " << circularqueue.getFront() << endl;
                } else {
                    cout << "Queue is Empty." << endl;
                }
                break;
            }
            case 7: {
                if (!circularqueue.isEmpty()) {
                    cout << "Rear Element: " << circularqueue.getRear() << endl;
                } else {
                    cout << "Queue is Empty." << endl;
                }
                break;
            }
            case 8: {
                cout << "Program Ends!" << endl;
                return 0;
            }
            default: {
                cout << "Enter a valid choice." << endl;
                break;
            }
        }
    } while (choice != 8);

    return 0;
}
