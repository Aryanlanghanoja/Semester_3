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

void insertAtHead(char val, node*& head) {
    node* n = new node(val);
    n->next = head;  // Update the next pointer of the new node
    head = n;
}

void insertAtTail(char val, node*& head) {

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

void insertInBetweenData(node*& head, char datain, char val) {
    node* temp = head;

    while (temp != NULL && temp->data != datain) {  // Check for NULL before accessing temp->data
        temp = temp->next;
    }

    if (temp == NULL) {
        cout << "The Node With Data " << datain << " Is Not Available :- " << endl;
        return;
    }

    node* n = new node(val);
    n->next = temp->next;
    temp->next = n;
}

void insertInBetweenIndex(node*& head, int index, char val) {
    if (index == 0) {
        insertAtHead(val, head);
        return;
    }

    node* temp = head;
    int tempindex = 0;

    while (temp != NULL && tempindex < index - 1) {
        temp = temp->next;
        tempindex++;
    }

    if (temp == NULL) {
        cout << "Index Out Of The Bound." << endl;
        return;
    }

    node* n = new node(val);
    n->next = temp->next;
    temp->next = n;
}

void display(node* head) {
    while (head != NULL) {
        cout << head->data << " -> ";
        head = head->next;
    }
    cout << " NULL " << endl;
}

bool checkbydata(node* head, char datain, int length) {
    for (int i = 0; i < length; i++) {
        if (head->data == datain) {
            return true;
        }
        head = head->next;
    }
    return false;
}

int lengthofLL(node* head) {
    int length = 0;  // Start the length from 0
    node* temp = head;

    while (temp != NULL) {
        length++;
        temp = temp->next;
    }
    return length;
}

void deletehead(node*& head) {
    node* temp = head;
    head = head->next;
    temp->next = NULL;
    delete temp;
    return;
}

void deletebydata(node*& head, char datain) {

    if (head == NULL) {
        cout << "LinkedList Is Empty." << endl;
    }

    if (head->next == NULL) {
        deletehead(head);
    }
    node* temp = head;

    while (temp->next->data != datain) {
        if (temp->next == NULL) {
            cout << "Not Found The Node With Data " << datain << endl;
        }
        temp = temp->next;
    }

    node* todelete = temp->next;
    temp->next = todelete->next;
    delete todelete;
}

void deletebyindex(node*& head, int index) {
    if (index < lengthofLL(head)) {
        int tempindex = 0;
        node* temp = head;
        while (tempindex < index - 1) {
            temp = temp->next;
            tempindex++;
        }

        node* todelete = temp->next;
        temp->next = todelete->next;
        delete todelete;
        return;
    }

    else {
        cout << index << " Is Not Exist In LinkedList." << endl;
        return;
    }
}

bool checkbyindex(int length, int index) {
    return index < length;
}

void reverseLL(node*& head) {
    node* current = head;
    node* prev = NULL;
    node* next = NULL;

    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}

int main() {
    node* head = NULL;
    int choice;

    while (choice != 13) {
        cout << "Enter The Choice As Per The List Given Below :-\n1)Insert The Element At Head\n2)Insert The Element At Tail\n3)Insert After Data\n4)Insert On Index\n5)Display The List\n6)Check Node With Data Is Present\n7)Check Index Is Present Or Not\n8)Find The Length Of LinkedList\n9)Delete Head\n10)Delete Node With Given Data\n11)Delete Node With Given Index\n12)Reverse The Linked List.\n13)Exit" << endl;
        cout << "Enter Your Choice :- ";
        cin >> choice;

        switch (choice)
        {
        case 1: {
            char val;
            cout << "Enter The Data To Insert At Head Of Your LinkedList :- ";
            cin >> val;
            insertAtHead(val, head);
            break;
        }

        case 2: {
            char val;
            cout << "Enter The Data To Insert At Tail Of Your LinkedList :- ";
            cin >> val;
            insertAtTail(val, head);
            break;
        }

        case 3: {
            char val, ref;
            cout << "Enter The Data of Node After Which You Want To Insert A Node :- ";
            cin >> ref;

            cout << "Enter The Data of Your New Node :- ";
            cin >> val;

            insertInBetweenData(head, ref, val);
            break;
        }

        case 4: {
            char val;
            int index;

            cout << "Enter The Index After Which You Want to Insert A NOde :- ";
            cin >> index;

            cout << "Enter The Data Of Your New Node :- ";
            cin >> val;

            insertInBetweenIndex(head, index, val);
            break;
        }

        case 5: {
            cout << "Your Linked List Is :- " << endl;
            display(head);
            break;
        }

        case 6: {
            char val;
            cout << "Enter The Data of Node Which Presence You Want To Check :- ";
            cin >> val;
            checkbydata(head, val, lengthofLL(head));
            break;
        }

        case 7: {
            int index;
            cout << "Enter The Index Which Presence You Want To Check :- ";
            cin >> index;
            checkbyindex(lengthofLL(head), index);
            break;
        }

        case 8: {
            char val;
            cout << "The Length of Your LinkedList Is :- ";
            lengthofLL(head);
            break;
        }

        case 9: {
            cout << "Your Head Of Your LinkedList Is Deleted.";
            break;
        }

        case 10: {
            char val;
            cout << "Enter The Data of Node Which You Want to Delete :- ";
            cin >> val;
            deletebydata(head, val);
            break;
        }

        case 11: {
            int index;
            cout << "Enter The Index of Node Which You Want To Delete From Your LinkedList :- ";
            cin >> index;
            deletebyindex(head, index);
            break;
        }

        case 12: {
            cout << "Your Linkedlist Is Reversed." << endl;
            reverseLL(head);
            break;
        }

        case 13: {
            cout << "Programm Ends." << endl;
            break;
        }

        default: {
            cout << "Enter A Valid Choice." << endl;
            break;
        }
        }

        if (choice == 13) {
            break;
        }
    }





    return 0;
}
