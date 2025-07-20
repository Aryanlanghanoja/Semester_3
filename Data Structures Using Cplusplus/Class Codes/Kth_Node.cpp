#include<iostream>
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

class LinkedList {

public:
    Node* head;
    LinkedList() {
        head = NULL;
    }

    void insertAtTail(int data) {
        Node* newNode = new Node(data);

        if (head == NULL) {
            head = newNode;
            return;
        }

        Node* temp = head;

        while (temp->next != NULL) {
            temp = temp->next;
        }

        temp->next = newNode;
        return;
    }

    void Display() {
        Node* temp = head;

        while (temp != NULL) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << " NULL " << endl;
    }

    Node* FindKthNode(int k) {
        int index = 0;
        Node* Traverse = head;
        Node* Find = head;

        while (Traverse != NULL) {
            index++;
            Traverse = Traverse->next;
        }

        for (int i = 0; i < index - k; i++) {
            Find = Find->next;
        }

        return Find;
    }
};

int main() {
    LinkedList LL;

    for (int i = 1; i <= 5; i++) {
        LL.insertAtTail(i);
    }

    LL.Display();

    Node* K_th = LL.FindKthNode(2);

    cout << K_th->data << endl ;
}
