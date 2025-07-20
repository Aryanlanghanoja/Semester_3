#include<iostream>
using namespace std ;

class node {
    public :
        int data ;
        node* left;
        node* right;

        node(int val) {
            data = val ;
            left = NULL ;
            right = NULL ;
        }
};

class Tree {

    public:
    node* root;

        Tree() {

        }

        void insert(node* &root,int data) {

            if(root == NULL) {
                root = new node(data);
                return;
            }

            node* n = new node(data);     
            node* temp = root;

            if(temp->data >= data) {

                if(temp->left == NULL) {
                    temp->left = n ;
                }

                else {
                    insert(temp->left,data);
                }
            }

            else if(temp->data < data ){
                if(temp->right == NULL) {
                    temp->right = n ;
                    return;
                }

                else {
                    insert(temp->right,data);
                }
            }
        }

        void display(node* &root) {
//             // node* temp = root;
//             // cout << "Data :- " << temp->data << endl ;
//             // cout << "Right Child :- " << temp->

            if(root == NULL) {
                cout << "No Further Element ." ;
                return;
            }

            node* temp = root ;
            cout << "Data :-  " << temp->data;
            
            if(temp->left != NULL && temp->right != NULL) {
                cout << "Left :- " << temp->left->data ;
                cout << "Right :- " << temp->right->data;
                display(temp->left);
                display(temp->right);
                return;
            }

            else if(temp->left == NULL) {
                display(temp->right);
                return;
            }

            else if(temp->right == NULL) {
                display(temp->left);
                return;
            }
        }

        bool search(int data) {
            if(root == NULL) {
                cout << "Empty Tree." ;
            }

            else {
                node* temp = root;
                bool isFound = false;

                while(!isFound) {
                    if(temp == NULL) {
                        return false;
                    }

                    else if(temp->data == data) {
                        isFound = true;
                        return true;
                    }

                    else if(temp->data < data) {
                        temp = temp->right ;
                    }

                    else {
                        temp = temp->left ;
                    }
                }
            }

        }
};

int main() {
    Tree t;

    int insertdata[] = {15,4,2,3,78,5,4,9,8,12,34,67,98};
    t.root == NULL;
    for(int i = 0 ;i < sizeof(insertdata) / sizeof(insertdata[0]) ; i++ ) {
        t.insert(t.root , insertdata[i]);
    }
    t.display(t.root);
}