#include <iostream>
using namespace std;

class Node {
public:
    int Priority;
    int age;
    string person;
    Node* Next;
    int start_time;
    int arrival_time;
    int end_time;
    int wait_time;

    Node(string person_name, int time, int person_age) {
        person = person_name;
        age = person_age;
        arrival_time = time;
    }
};

class PriorityQueue {
public:
    Node* head;
    PriorityQueue() {
        head = NULL;
    }

    void insertElement(string person_name, int person_age, int time) {
        Node* newPerson = new Node(person_name, person_age, time);

        if (newPerson->age > 61) {
            newPerson->Priority = 3;
        } else if (newPerson->age > 21 && newPerson->age < 60) {
            newPerson->Priority = 2;
        } else {
            newPerson->Priority = 1;
        }

        if (head == NULL) {
            head = newPerson;
            return;
        }

        Node* temp = head;

        if (newPerson->Priority > head->Priority) {
            newPerson->Next = head;
            head = newPerson;
            newPerson->start_time = newPerson->arrival_time;
            newPerson->end_time = newPerson->start_time + 5;
            newPerson->wait_time = newPerson->start_time - newPerson->arrival_time;
        } 
        
        else {
            while (temp->Next != NULL && newPerson->Priority <= temp->Next->Priority) {
                temp = temp->Next;
            }

            newPerson->Next = temp->Next;
            newPerson->start_time = temp->end_time;
            newPerson->end_time = newPerson->start_time + 5;
            newPerson->wait_time = newPerson->start_time - newPerson->arrival_time;
            temp->Next = newPerson;
        }
    }

    void display() {
        Node* temp = head;
        cout << "Person\tStart time\tEnd Time\tArrival Time\tWait Time" << endl;

        while (temp != NULL) {
            cout << temp->person << "\t\t" << temp->start_time << "\t\t" << temp->end_time << "\t\t" << temp->arrival_time << "\t\t" << temp->wait_time << endl;
            temp = temp->Next;
        }
    }
};

int main() {
    PriorityQueue priorityQueue;
    priorityQueue.insertElement("p1", 0, 25);
    priorityQueue.insertElement("p2", 2, 55);
    priorityQueue.insertElement("p3", 5, 45);
    priorityQueue.insertElement("p4", 6, 35);
    priorityQueue.insertElement("p5", 10, 75);
    priorityQueue.insertElement("p6", 15, 15);
    priorityQueue.display();
}

