#include<iostream>
using namespace std;

class Queue {

    private:
        static const int size = 5 ;
        int quearray[size];
        int head = -1 ;
        int tail = -1 ;

    public :
        Queue() {
            cout << "Queue Is Initialized." << endl;
        }

        void enque(int data) {
            if(tail == size - 1) {
                cout << "Queue Is Full." << endl;
                return;
            }

            cout << data << " Is Enqueued In Queue." << endl;
            quearray[++tail] = data ;

            if(head == -1) {
                head++;
            }
        }

        int deque() {
            int data;
            if(head == -1 || tail == -1) {
                cout << "Queue Is Empty." << endl;
            }

            else {
                if(head == tail) {
                    data = quearray[head];
                    head = -1 ;
                    tail = -1 ;

                    cout << data << " Is Dequeued From Queue." <<endl;
                }

                else {
                    data = quearray[head];
                    head++;
                    cout << data << " Is Dequeued From Queue." <<endl;
                }
            }
        }

        void display() {

            cout << "Your Queue Is - " << endl ;
            for(int i = head; i<= tail;i++) {
                cout << quearray[i]  << " ";
            }
        }
    
};

int main() {
    Queue q ;
    // q.enque(5);
    // q.enque(6);
    // q.deque();
    // q.enque(7);
    q.deque();
    q.enque(8);
    q.enque(10);
    q.deque();
    q.deque();
    // q.enque(12);
    q.display();
}