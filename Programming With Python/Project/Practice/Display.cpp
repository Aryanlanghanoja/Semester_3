#include <iostream>
#include <queue>

// Definition of a BST node
struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int value) : data(value), left(nullptr), right(nullptr) {}
};

// Function to display a BST using level-order traversal
void displayBSTLevelOrder(Node* root) {
    if (root == nullptr) {
        return;
    }

    std::queue<Node*> nodeQueue;
    nodeQueue.push(root);

    while (!nodeQueue.empty()) {
        Node* current = nodeQueue.front();
        nodeQueue.pop();

        // Print the current node's data
        std::cout << current->data << " ";

        // Enqueue left and right children (if they exist)
        if (current->left != nullptr) {
            nodeQueue.push(current->left);
        }
        if (current->right != nullptr) {
            nodeQueue.push(current->right);
        }
    }
}

int main() {
    // Create a BST
    Node* root = new Node(10);
    root->left = new Node(5);
    root->right = new Node(15);
    root->left->left = new Node(3);
    root->left->right = new Node(7);
    root->right->left = new Node(12);
    root->right->right = new Node(18);

    // Display the BST using level-order traversal
    std::cout << "Level-order traversal of the BST: ";
    displayBSTLevelOrder(root);
    std::cout << std::endl;

    // Clean up memory (free dynamically allocated nodes)
    // Your code might handle this differently depending on your use case
    delete root->right->right;
    delete root->right->left;
    delete root->right;
    delete root->left->right;
    delete root->left->left;
    delete root->left;
    delete root;

    return 0;
}
