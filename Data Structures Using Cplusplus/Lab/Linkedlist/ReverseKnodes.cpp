#include<iostream>
using namespace std;

class node {

    public:
        int data;
        node* next;

        node(int val) {
            data = val;
            next = NULL ;
        }
};

void insertAtTail(node* &head,int val) {
    if(head == NULL) {
        node* n = new node(val);
        n->next = head ;
        head = n ;
        return ;
    }

    node* temp = head;
    node* n = new node(val);

    while(temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = n ;
    return;
}

void display(node* head) {

    while(head != NULL) {
        cout << head->data << " -> " ;
        head = head->next;
    }

    cout << " NULL "  << endl ;
}

node* ReverseKnodes(node* &head,int k){
    node* prev = NULL ;
    node* curr = head ;
    node* next;

    int count = 0 ;

    while(curr != NULL && count < k) {
        next = curr->next ;
        curr->next = prev;
        prev = curr;
        curr = next ;
        count++;
    }

    if(next != NULL) {
        head->next = ReverseKnodes(next , k);
    }
    return prev ;
}

int main() {
    node* head = NULL ;

    for(int i=1;i<=6;i++) {
        insertAtTail(head,i);
    }

    display(head);
    display(ReverseKnodes(head,2));
}