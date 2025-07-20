#include<iostream>
using namespace std;

class node {

    public:
        int data;
        node* next ;
        node* prev ;

        node (int val) {
            data = val ;
            next = NULL ;
            prev = NULL ;
        }
};

void insertAtHead(node* &head, int val) {
    node* n = new node(val);
    n->next = head;
    if (head != NULL) {
        head->prev = n;
    }
    head = n;
}

void insertAtTail(node* &head, int val) {

    if (head == NULL) {
        insertAtHead(head, val);
        return ;
    }

    node* n = new node(val);
    node* temp = head ;

    while(temp->next != NULL) {
        temp = temp->next ;
    }

    temp->next = n ;
    n->prev = temp ;
}

void deleteAtHead(node* &head) {

    if (head == NULL) {
        return;
    }

    node* todelete = head ;

    if (head->next != NULL) {
        head->next->prev = NULL;
    }

    head = head->next ;

    delete todelete ;
}


void Delete(node* &head, int index) {
    int count = 1 ;
    node* temp = head ;

    if(index == 1) {
        deleteAtHead(head);
        return ;
    }

    while(temp != NULL && count != index) {
        temp = temp->next ;
        count++;
    }

    if(temp == NULL) {
        // Invalid index, element not found
        return;
    }

    if(temp->prev != NULL) {
        temp->prev->next = temp->next ;
    }

    if(temp->next != NULL) {
        temp->next->prev = temp->prev ;
    }

    delete temp ;
}

void display(node* &head) {
    node* temp = head ;

    while(temp != NULL) {
        cout << temp->data << " <--> " ;
        temp = temp->next ;
    }

    cout << "NULL " << endl ; 
}

int main() {
    node* head = NULL ;

    for(int i = 6 ; i >= 1 ; i--) {
        insertAtHead(head, i);
    }

    for(int i = 7 ; i <= 12 ; i++) {
        insertAtTail(head, i);
    }

    display(head);

    for(int i=1;i<=5;i++) {
        deleteAtHead(head);
    }

    display(head);

    for (int i = 1; i <= 4; i++) {
        Delete(head, 1); // Always delete the first element
    }

    display(head);
}
