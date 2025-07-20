#include<iostream>
using namespace std;

class node {
public :
    int data;
    node* next;

    node(int val) {
        data = val ;
    }
};

class stack {
    public:
        node* top ;

        stack() {
            top = NULL ;
        }

        void push(node* &top,int val) {
            node* n = new node(val);
            n->next = top;
            top = n;
            return;
        }

        void deletehead(node* &top) {
            node* temp = top;
            top= top->next ;
            temp->next = NULL;
            delete temp ;
            return ;
        }
};



void display(node* &head) {
    node* temp = head ;

    while(temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next ;
    }
    cout<<endl;
    return;
}

int main() {
//     node* head = NULL ;
//     push(head,4);
//     push(head,3);
//     push(head,2);
//     push(head,1);
//     display(head);
}
