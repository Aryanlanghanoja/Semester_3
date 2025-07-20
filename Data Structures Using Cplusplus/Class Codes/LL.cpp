#include<iostream>
using namespace std;

class node {

    public :
        int data;
        node* next ;

        node(int val) {
            data = val ;
            next = NULL ;
        }
};

void display (node* head) {
    while(head != NULL) {
        cout << head->data << " -> " ;
        head = head->next;
    }

    cout << "NULL " << endl ;
}

void insertAtHead (node* &head,int val) {
    node* n = new node(val);
    n->next = head;
    head = n ;
}

void insertAtTail (node* &head,int val) {
    node* temp = head ;
    node* n = new node(val);

    while(temp->next != NULL) {
        temp = temp->next ;
    }
    temp->next = n ;
}

int main() {
    node* head = NULL ;
    insertAtHead(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    display(head);
}