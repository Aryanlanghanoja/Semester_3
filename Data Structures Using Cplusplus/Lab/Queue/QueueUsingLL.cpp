#include<iostream>
using namespace std;

class node {
public:
    char data;
    node* next;

    node(char value) {
        data = value;
        next = NULL;
    }

    void enque(int val , node* &head) {
    node* n = new node(val);
    if (head == NULL) {
        node* n = new node(val);
        n->next = head;  // Update the next pointer of the new node
        head = n;
        return;
    }

    node* temp = head;

    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = n;
    }

void deletehead(node* &head) {

    if(head == NULL) {
        cout << "Queue Is Empty." << endl;
    }

    
    node* temp = head;
    head= head->next ;
    temp->next = NULL;
    delete temp ;
    return ;
}
};

