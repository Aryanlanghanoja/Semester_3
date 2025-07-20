// #include<iostream>
// using namespace std;

// class node {
//     public:
//         int data;
//         node* next;

//         node(int val) {
//             data = val;
//             next = NULL ;
//         }
// };

// void insertAtTAil(node* &head,int val) {
//     if (head == NULL) {
//         node* n = new node(val);
//         n->next = head ;
//         head = n ;
//         return;
//     }

//     node* temp = head;
//     node* n = new node(val) ;

//     while(temp->next != NULL) {
//         temp = temp->next ;
//     }
//     temp->next = n ;
//     return;
// }

// void makeCycle(node* &head,int pos) {
//     node* temp = head;
//     node* startnode;

//     int count = 1 ;
//     while(temp->next != NULL) {
//         if(count == pos) {
//             startnode = temp ;
//         }
//         temp = temp->next;
//         count++;
//     }

//     temp->next = startnode ;
// }

// void display(node* &head) {
//     node* temp = head;

//     while(temp != NULL) {
//         cout << temp->data << " -> " ;
//         temp = temp->next ;
//     }
//     cout << " NULL " << endl ;
// }

// bool detectCycle(node* &head) {
//     node* slow = head ;
//     node* fast = head ;

//     while(fast != NULL && fast->next != NULL) {
//         slow = slow->next ;
//         fast = fast->next->next ;

//         if(fast == slow) {
//             return true ;
//         }
//     }

//     return false ;
// }

// void RemoveCycle(node* &head) {
//     node* slow = head ;
//     node* fast  = head ;

//     do {
//         slow = slow->next ;
//         fast = fast->next->next ;
//     } while (slow == fast) ;

//     fast = head ;

//     while (slow->next != fast->next) {
//         slow = slow->next;
//         fast = fast->next ;
//     }

//     slow->next = NULL ;
    
// }

// int main() {
//     node* head = NULL ;

//     for(int i=1;i<=6;i++) {
//         insertAtTAil(head,i);
//     }

//     makeCycle(head,3);
//     cout << detectCycle(head) << endl ;
//     RemoveCycle(head);
//     cout << detectCycle(head) << endl ;
//     display(head);
// }

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

void insertAtTail(node* &head, int val) {
    if (head == NULL) {
        node* n = new node(val);
        head = n;
        return;
    }

    node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }

    node* n = new node(val);
    temp->next = n;
}

void makeCycle(node* &head, int pos) {
    node* temp = head;
    node* startnode = NULL;

    int count = 1;
    while (temp->next != NULL) {
        if (count == pos) {
            startnode = temp;
        }
        temp = temp->next;
        count++;
    }

    if (startnode != NULL) {
        temp->next = startnode;
    }
}

void display(node* head) {
    node* temp = head;

    while (temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

bool detectCycle(node* head) {
    node* slow = head;
    node* fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (fast == slow) {
            return true;
        }
    }

    return false;
}

void removeCycle(node* &head) {
    node* slow = head;
    node* fast = head;

    while (slow != NULL && fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast) {
            break;
        }
    }

    if (slow == fast) {
        fast = head;
        while (fast->next != slow->next) {
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = NULL;
    }
}

int main() {
    node* head = NULL;

    for (int i = 1; i <= 6; i++) {
        insertAtTail(head, i);
    }

    makeCycle(head, 3);
    cout << "Cycle detected: " << detectCycle(head) << endl;
    removeCycle(head);
    cout << "Cycle removed: " << detectCycle(head) << endl;
    display(head);

    return 0;
}
