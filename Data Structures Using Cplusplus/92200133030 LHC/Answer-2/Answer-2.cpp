#include<iostream>
using namespace std;

class Node {
    public:
        int data;
        Node* next;

    Node(int val) {
        data = val ;
        next = NULL ;
    }
};

class Stack {

    public:
        Node* Top ;

        Stack() {
            Top = NULL ;
        }

        void Push(int val) {

            if (Top == NULL) {
                Node* newNode = new Node(val);
                newNode->next = Top;  
                Top = newNode;
                return;
            }

            Node* temp = Top;
            Node* newNode = new Node(val);

            while (temp->next != NULL) {
                temp = temp->next;
            }

            temp->next = newNode;
            return;

        }

        void Pop() {
            if (Top == NULL) {
                cout << "Stack Is Empty." << endl;
                return;
            }

            if (Top->next == NULL) {
                delete Top;
                Top = NULL;
            } 
            
            else {
                Node* temp = Top;

                while (temp->next->next != NULL) {
                    temp = temp->next;
                }

                Node* todelete = temp->next;
                temp->next = NULL;
                delete todelete;
            }
        }

        int getTop() {
            
            if(Top == NULL) {
                return -1 ;
            }

            Node* temp = Top;

            while(temp->next != NULL) {
                temp = temp->next ;
            }

            return temp->data;
        }

    bool isEmpty() {
        return getTop() == -1;
    }

    void Display() {
        Node* temp = Top;

        while (temp != NULL) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }

        cout << " NULL " << endl;
    }
};

class QueueUsingStack {
    public:
        Stack stack1;
        Stack stack2;
        Node* Front;
        Node* Rear ;

        QueueUsingStack() {
            cout << "Queue Is Created ." << endl ;
            Front = NULL ;
            Rear = NULL ;
        }

        void Enque(int val){
            stack1.Push(val);
            cout << val << " Is Enqueed In Your Queue." << endl ;
            cout << "Stack - 1 :- " << endl;
            stack1.Display();
            cout << "Stack - 2 :- " << endl;
            stack2.Display();
            return;
        }

        void Dequeue() {
            while(!stack1.isEmpty()) {
                stack2.Push(stack1.getTop());
                stack1.Pop();
                stack2.Pop();
            }

            cout << stack2.getTop() << " Is Dequued From Your Queue." << endl ;
            cout << "Stack - 1 :- " << endl;
            stack1.Display();
            cout << "Stack - 2 :- " << endl;
            stack2.Display();
            return;
        }

        void Display() {
            cout << "Your Queue Is :- " << endl ;
            while(!stack1.isEmpty()){
                stack2.Push(stack1.getTop());
                stack1.Pop();
            }

            stack2.Display();
            return;
        }
};

int main() {

    cout << "Implementaion Of Queue Using Stack\nThere Are 2 Stacks Are Needed To Implement A Queue." << endl ;
    int val;
    int choice;
    QueueUsingStack Queue;

    do
    {
        cout << "Operation You Can Perform On Queue :- " << endl ;
        cout <<"1) Enque In Queue\n2) Dequeue From Queue\n3) Display Your Queue.\n4) Exit" << endl ;
        cout << "Enter Your Choice To Perfom Operation On Queue." << endl;
        cin >> choice;

        switch (choice)
        {
            case 1:
                cout << "Enter The Integer you Want To Enque In Your Queue :- " << endl ;
                cin >> val;
                Queue.Enque(val);
                break;
        
            case 2 :
                Queue.Dequeue();
                break;

            case 3 : 
                Queue.Display();
                break;

            case 4 :
                cout << "Exiting The Programm." << endl ;
                break;

            default:
                cout << "Enter Valid Choice." << endl;
                break;
        } 
    } while (choice != 4);
    return 0;
}