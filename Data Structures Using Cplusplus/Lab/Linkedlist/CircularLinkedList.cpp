#include<iostream>
using namespace std;

class node {
public:
    int data;
    node* next;

    node(int val) {
        data = val;
        next = NULL;
    }
};

void insertAtHead(node* &head, int val) {
    node* n = new node(val);
    if (head == NULL) {
        n->next = n; // Circular link to itself for the first node.
    }
    else {
        node* temp = head;
        while (temp->next != head) {
            temp = temp->next;
        }
        temp->next = n;
        n->next = head;
    }
    head = n;
}

void insertAtTail(node* &head, int val) {
    node* n = new node(val);
    if (head == NULL) {
        n->next = n; // Circular link to itself for the first node.
        head = n;
    }
    else {
        node* temp = head;
        while (temp->next != head) {
            temp = temp->next;
        }
        temp->next = n;
        n->next = head;
    }
}

void display(node* &head) {
    if (head == NULL) {
        cout << "Empty list" << endl;
        return;
    }
    node* temp = head;
    do {
        cout << temp->data << " -> ";
        temp = temp->next;
    } while (temp != head);
    cout << " head" << endl;
}

int main() {
    node* head = NULL;

    for (int i = 5; i >= 1; i--) {
        insertAtHead(head, i);
    }

    for (int i = 6; i <= 10; i++) {
        insertAtTail(head, i);
    }

    display(head);
}
