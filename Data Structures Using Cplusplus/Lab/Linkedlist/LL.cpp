#include<iostream>
using namespace std ;

class node {
    public :
        int data;
        node* next ;

        node(int val) {
            data = val ;
            next = NULL ;
        }
};

void insertAtHead(node* &head ,int val) {
    node* n = new node(val) ;
    n->next = head ;
    head = n ;
}
void insertAtTail(node* &head , int val) {

    node* n = new node(val) ;
    if(head == NULL) {
        head = n ;
        return;
    }
    node* temp = head ;

    while (temp->next != NULL) {
        temp = temp->next ;
    }

    temp->next = n ; 
}

void display(node* head) {

    while (head != NULL) {
        cout<<head->data<<"->" ;
        head = head->next ;
    }
    cout<<"NULL"<< endl ;
}

bool search(node* head,int key) {
    while(head != NULL) {
        if(head->data == key) {
            return true ;
        }
        head = head->next ;
    }

    return false;
}

void deletion(node* &head , int val) {
    node* temp = head ;
    while(temp->next->data != val) {
        temp = temp->next ;
    }

    node* toDelete = temp->next ;
    temp->next = temp->next->next ;
    delete toDelete ;
}
int main() {
    node* head = NULL ;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,4);
    display(head);
    insertAtHead(head,5);
    display(head);
    cout<<search(head,6)<<endl;
    cout<<search(head,5)<<endl;
    deletion(head,4);
    display(head);
    return 0;
}
