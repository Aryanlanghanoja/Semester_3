#include<iostream>
#include<vector>
using namespace std;

class Node {
  public:
      int data;
      Node* left;
      Node* right;

      Node(int val) {
        data = val;
        left = NULL ;
        right = NULL ;
      }
};

class BST {

  public :
    Node* Root;
    vector<int> InorderSequence;
    int no_of_nodes=0;


    BST() {
      Root = NULL ;
    }

        void insertInBST(Node* &Root , int val) {

            Node* newNode = new Node(val);

            if(Root == NULL) {
                Root = newNode ;
                return ;
            }

            if(val > Root->data) {
                insertInBST(Root->right,val);
                no_of_nodes++;
                return;
            }

            else {
                insertInBST(Root->left , val);
                no_of_nodes++;
                return;
            }
        }

    void InorderTraversal(Node* Root) {
      if(Root == NULL) {
        return;
      }

      InorderTraversal(Root->left);
      InorderSequence.push_back(Root->data);
      InorderTraversal(Root->right);
      return;
    }
};

int main() {

  BST bst;

  cout << "Enter -1 To Stop Insertion In Your BST :- " << endl ;
  int num;
  int k;

  do
  {
    cin >> num;
    bst.insertInBST(bst.Root,num);
  } while (num != -1);
  
  bst.InorderTraversal(bst.Root);

  cout << "Enter The Value Of K :- " << endl;
  cin >> k;

  if(k >= bst.InorderSequence.size()) {
    cout << "kth element not found as there are only" << bst.no_of_nodes << "elements are available" << endl ;
  }

  else {
    cout << "Your " << k << " th Minimum Element Is " << bst.InorderSequence[k] << endl;
  }
  
  

  return 0;  
} 
