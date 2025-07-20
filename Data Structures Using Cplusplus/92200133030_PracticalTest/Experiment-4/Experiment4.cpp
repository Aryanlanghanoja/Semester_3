#include<iostream>
using namespace std;

class Queue {
    int front;
    int rear;
    int size;
    int* Array;

public:
    Queue(int n) {
        front = rear = -1;
        size = n;
        Array = new int[size];
    }

    bool isFull() {
        return (rear + 1) % size == front;
    }

    bool isEmpty() {
        return front == -1;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return Array[front];
    }

    int getRear() {
        return Array[rear];
    }

    void Enque(int num) {
        if (isFull()) {
            cout << num << " Is Not Enquued Beacause Queue Overflow Occured." << endl;
            return;
        }

        else {
            if (isEmpty()) {
                front = rear = 0;
            }

            else {
                rear = (rear + 1) % size;
            }
        }

        cout << num << " Is Enquued In Your Queue." << endl;
        Array[rear] = num;

    }

    void Deque() {
        if (isEmpty()) {
            cout << "Cannot Dequued Because Queue Underflow Occured." << endl;
            return;
        }

        else {
            int dequeued = Array[front];

            if (front == rear) {
                front = rear = -1;
            }

            else {
                front = (front + 1) % size;
            }
            cout << dequeued << " Is Dequeued From Your Queue." << endl;
        }
    }

    void Display() {
        if (front < rear) {
            for (int i = front;i <= rear;i++) {
                cout << Array[i] << " ";
            }
            cout << endl;
            return;
        }

        else {
            for (int i = front; i < size; i++) {
                cout << Array[i] << " ";
            }

            for (int i = 0; i <= rear; i++) {
                cout << Array[i] << " ";
            }

            cout << endl;
            return;
        }
    }

};


int main() {
    int size;
    int num;

    cout << "Implementation Of Circular Queue " << endl;
    cout << "Enter The Size Of Your Queue:-" << endl;
    cin >> size;

    Queue queue(size);
    int choice;

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
            queue.Enque(num);
            break;
        }
        case 2: {
            queue.Deque();
            break;
        }
        case 3: {
            cout << "Your Queue Is :- ";
            queue.Display();
            break;
        }
        case 4: {
            if (queue.isEmpty()) {
                cout << "Queue is empty." << endl;
            }
            else {
                cout << "Queue is not empty." << endl;
            }
            break;
        }
        case 5: {
            if (queue.isFull()) {
                cout << "Queue is full." << endl;
            }
            else {
                cout << "Queue is not full." << endl;
            }
            break;
        }
        case 6: {
            if (!queue.isEmpty()) {
                cout << "Front element: " << queue.getFront() << endl;
            }
            else {
                cout << "Queue is empty." << endl;
            }
            break;
        }
        case 7: {
            if (!queue.isEmpty()) {
                cout << "Rear element: " << queue.getRear() << endl;
            }
            else {
                cout << "Queue is empty." << endl;
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