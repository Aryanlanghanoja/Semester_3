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
};

void insertAtHead(char val, node* &head) {
    node* n = new node(val);
    head = n;
}

void insertAtTail(char val, node* &head) {
    if (head == NULL) {
        insertAtHead(val, head);
        return;
    }

    node* n = new node(val);
    node* temp = head;

    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = n;
    return ;
}

void insertInBetweenData(node* &head,char datain,char val) {
    node* temp = head;

    while(temp->data != datain) {
        if(temp->next == NULL) {
            cout << "The Node With Data " << datain << "Is Not Available :- " << endl ;
            return;
        }
        temp = temp->next;
    }

    node* n = new node(val) ;
    n->next = temp->next ;
    temp->next = n ;
    return ;
}

void insertInBetweenIndex(node* &head,int index,char val) {
    node* temp = head ;
    int tempindex = 0;

    while(tempindex < index - 1) {
        if(temp == NULL) {
            cout << "Index Out Of The Bound." << endl ;
            return ;
        }
        temp = temp->next ;
        tempindex ++ ;
    }

    node* n = new node(val) ;
    n->next = temp->next ;
    temp->next = n ;
    return ;
}

void display(node* head) {
    while (head != NULL) {
        cout << head->data << " -> ";
        head = head->next;
    }
    cout << " NULL " << endl;
    return;
}

bool checkbydata(node* &head,char datain,int length) {
    for(int i=0;i<length;i++) {
        if(head->data == datain) {
            return true;
        }
        head = head->next;
    }
    return false ;
}

int lengthofLL(node* &head) {
    int length = 1;
    node* temp = head;

    while(temp->next != NULL) {
        length++;
        temp = temp->next ;
    }
    return length ;
}

bool checkbyindex(int length,int index) {
    return index < length ;
}

int main() {
    node* head = NULL;
    cout << "Linkedlist :- ";
    insertAtHead('A', head);
    insertAtTail('B', head);
    insertAtTail('C', head);
    insertAtTail('E', head);
    insertInBetweenData(head,'E','F');
    insertInBetweenIndex(head,3,'D');
    display(head);
    cout<<lengthofLL(head) << endl;
    cout<<checkbydata(head,'E',lengthofLL(head)) << endl;
    cout<<checkbyindex(lengthofLL(head),4) << endl ;
    return 0;
}
