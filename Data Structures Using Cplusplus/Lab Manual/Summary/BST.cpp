#include<iostream>
using namespace std;

class Node {

public:
    int data;
    Node* Left;
    Node* Right;

    Node(int val) {
        data = val;
        Left = NULL;
        Right = NULL;
    }
};

class Tree {

public:
    Node* Root;

    Tree() {
        Root = NULL;
    }

    void InsertNode(Node*& Root, int val) {

        Node* newNode = new Node(val);

        if (Root == NULL) {
            Root = newNode;
            return;
        }

        if (val > Root->data) {
            InsertNode(Root->Right, val);
            return;
        }

        else {
            InsertNode(Root->Left, val);
            return;
        }
    }

    void Display(Node* Root) {

        if (Root == NULL) {
            return;
        }

        Display(Root->Left);
        cout << Root->data << " ";
        Display(Root->Right);

    }

    bool Search(Node*& Root, int val) {

        if (Root == NULL) {
            return false;
        }

        if (val == Root->data) {
            return true;
        }

        if (val > Root->data) {
            return Search(Root->Right, val);
        }

        else {
            return Search(Root->Left, val);
        }
    }

    void Delete(Node*& Root, int val) {
        if (Root == NULL) {
            return;
        }

        if (val < Root->data) {
            Delete(Root->Left, val);
        }
        else if (val > Root->data) {
            Delete(Root->Right, val);
        }
        else {
            if (Root->Left == NULL) {
                Node* temp = Root->Right;
                delete Root;
                Root = temp;
            }
            else if (Root->Right == NULL) {
                Node* temp = Root->Left;
                delete Root;
                Root = temp;
            }
            else {
                Node* temp = FindMin(Root->Right);
                Root->data = temp->data;
                Delete(Root->Right, temp->data);
            }
        }
    }

    Node* FindMin(Node* node) {
        while (node->Left != NULL) {
            node = node->Left;
        }
        return node;
    }

    void PreOrder(Node* &Root) {

        if (Root == NULL) {
            return;
        }

        cout << Root->data << " ";
        PreOrder(Root->Left);
        PreOrder(Root->Right);
        cout << endl;
    }

    void InOrder(Node* &Root) {

        if (Root == NULL) {
            return;
        }

        InOrder(Root->Left);
        cout << Root->data << " ";
        InOrder(Root->Right);
        cout << endl;
    }

    void PostOrder(Node* &Root) {

        if (Root == NULL) {
            return;
        }

        PostOrder(Root->Left);
        PostOrder(Root->Right);
        cout << Root->data << " ";
        cout << endl;
    }
};


int main() {
    Tree T;
    int choice, value;

    do {
        cout << "Binary Search Tree Menu:" << endl;
        cout << "1. Insert a Node" << endl;
        cout << "2. Search for a Node" << endl;
        cout << "3. Delete a Node" << endl;
        cout << "4. Pre-Order Traversal " << endl;
        cout << "5. In-Order Traversal" << endl;
        cout << "6. Post-Order Traversal" << endl;
        cout << "7. Exiting The Proramm" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter the value to insert: ";
            cin >> value;
            T.InsertNode(T.Root, value);
            break;

        case 2:
            cout << "Enter the value to search for: ";
            cin >> value;
            if (T.Search(T.Root, value)) {
                cout << "Value found in the tree." << endl;
            }
            else {
                cout << "Value not found in the tree." << endl;
            }
            break;

        case 3:
            cout << "Enter the value to delete: ";
            cin >> value;
            T.Delete(T.Root, value);
            break;

        case 4:
            cout << "Pre - Order Traversal : ";
            T.PreOrder(T.Root);
            break;

        case 5:
            cout << "In - Order Traversal : ";
            T.InOrder(T.Root);
            break;

        case 6:
            cout << "Post - Order Traversal : ";
            T.PostOrder(T.Root);
            break;

        case 7:
            cout << "Exiting the program." << endl;
            break;

        default:
            cout << "Invalid choice. Please try again." << endl;
        }

    } while (choice != 7);

    return 0;
}