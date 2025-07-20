//linked list
#include<iostream>
using namespace std;
class Node {
	public:
		double	data;		// data
		Node*	next;		// pointer to next
};
class List {
	public:
		List(void) { head = NULL; }	// constructor
		~List(void);				// destructor

		bool IsEmpty() { return head == NULL; }
		Node* InsertNode(int index, double x);	
		int FindNode(double x);	
		int DeleteNode(double x);
		void DisplayList(void);
		void Reverse(void);
	private:
		Node* head;
};
Node* List::InsertNode(int index, double x) {
	if (index < 0) return NULL;	
	
	int currIndex	=	1;
	Node* currNode	=	head;
	while (currNode && index > currIndex) {
		currNode	=	currNode->next;
		currIndex++;
	}
	if (index > 0 && currNode == NULL) return NULL;
	
	Node* newNode	=	new	Node;
	newNode->data	=	x;	
	if (index == 0) {
		newNode->next	=	head;
		head		=	newNode;
	}
	else {
		newNode->next	=	currNode->next;
		currNode->next	=	newNode;
	}
	return newNode;
}
int List::FindNode(double x) {
	Node* currNode	=	head;
	int currIndex	=	1;
	while (currNode && currNode->data != x) {
		currNode	=	currNode->next;
		currIndex++;
	}
	if (currNode) return currIndex;
	return 0;
}
int List::DeleteNode(double x) {
	Node* prevNode	=	NULL;
	Node* currNode	=	head;
	int currIndex	=	1;
	while (currNode && currNode->data != x) {
		prevNode	=	currNode;
		currNode	=	currNode->next;
		currIndex++;
	}
	if (currNode) {
		if (prevNode) {
			prevNode->next	=	currNode->next;
			delete currNode;
		}
		else {
			head		=	currNode->next;
			delete currNode;
		}
		return currIndex;
	}
	return 0;
}
void List::Reverse()
{
	Node* current = head;
    Node* prev = NULL, *next = NULL;
 
    while (current != NULL) {
        // Store next
        next = current->next;
        // Reverse current node's pointer
        current->next = prev;
        // Move pointers one position ahead.
        prev = current;
        current = next;
    }
    head = prev;
}
void List::DisplayList()
{
   int num		=	0;
   Node* currNode	=	head;
   while (currNode != NULL){
	cout << currNode->data << endl;
	currNode	=	currNode->next;
	num++;
   }
   cout << "Number of nodes in the list: " << num << endl;
}
List::~List(void) {
   Node* currNode = head, *nextNode = NULL;
   while (currNode != NULL)
   {
	nextNode	=	currNode->next;
	// destroy the current node
	delete currNode;	
	currNode	=	nextNode;
   }
}

int main(){
	List list;
	int choice = 0;
	int i = 0,k=1;
	double data =0.0;
	
	while(k>0){
		cout<<"Linked List \n"<<"1. Insert\n"<<"2. Find\n"<<"3. Delete\n"<<"4. Display List\n" << "5. Reverse\n"<<"6. Exit\n";
		cin>>choice;
	
		switch(choice){
			case 1: 			
				cout<<"Enter index and data to create a new node\n";
				cin>>i>>data;
				list.InsertNode(i, data);
				break;
			case 2: 			
				cout<<"Enter data to find from list\n";
				cin>>data;
				list.FindNode(data);
				break;
			case 3: 			
				cout<<"Enter data to delete from list\n";
				cin>>data;
				list.DeleteNode(data);
				break;
			case 4: 			
				list.DisplayList();
				break;
			case 5:
				list.Reverse();
				break;
			case 6: 
			    cout << "Exit";			
				break;
			default:
				cout<<"Invalid choice";
				break;
		}
		
		if(choice==5)
			break;
		k++;
	}
	return 0;
}