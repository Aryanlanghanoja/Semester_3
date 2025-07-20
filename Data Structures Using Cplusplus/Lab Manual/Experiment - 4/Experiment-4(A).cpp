#include <iostream>
using namespace std;

class CircularQueue {
private:
    int size;
    int front;
    int rear;
    int* queue;

public:
    CircularQueue(int n) {
        size = n;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    bool isEmpty() {
        return front == -1;
    }

    bool isFull() {
        return (rear + 1) % size == front;
    }

    void enqueue(int num) {
        if (isFull()) {
            cout << "Queue Is Full." << endl;
            return;
        }
        else {
            if (isEmpty()) {
                front = rear = 0;
            }
            else {
                rear = (rear + 1) % size;
            }
            queue[rear] = num;
            cout << num << " Is Enqueued In Your Queue." << endl;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            cout << "Queue Is Empty." << endl;
            return;
        }
        else {
            int dequeued = queue[front];
            if (front == rear) {
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            cout << dequeued << " Is Dequeued From Your Queue." << endl;
        }
    }

    void display() {
        if (isEmpty()) {
            cout << "Queue is Empty." << endl;
        }
        else {
            cout << "Your Queue Is: ";
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    cout << queue[i] << " ";
                }
            }
            else {
                for (int i = front; i < size; i++) {
                    cout << queue[i] << " ";
                }
                for (int i = 0; i <= rear; i++) {
                    cout << queue[i] << " ";
                }
            }
            cout << endl;
        }
    }

    int getFront() {
        return queue[front];
    }

    int getRear() {
        return queue[rear];
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
                cout << "Queue is empty." << endl;
            }
            else {
                cout << "Queue is not empty." << endl;
            }
            break;
        }
        case 5: {
            if (circularqueue.isFull()) {
                cout << "Queue is full." << endl;
            }
            else {
                cout << "Queue is not full." << endl;
            }
            break;
        }
        case 6: {
            if (!circularqueue.isEmpty()) {
                cout << "Front element: " << circularqueue.getFront() << endl;
            }
            else {
                cout << "Queue is empty." << endl;
            }
            break;
        }
        case 7: {
            if (!circularqueue.isEmpty()) {
                cout << "Rear element: " << circularqueue.getRear() << endl;
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
