#include<iostream>
using namespace std;

// Function implementing Binary Search algorithm
// Returns the index of the key if found, else -1
int Binary_Search(int Array[], int key, int low, int high) {
    // Base case: key not found
    if (low > high) {
        return -1;
    }

    else {
        int mid = (low + high) / 2; // Calculate middle index

        if (key == Array[mid]) // Check if key is at the middle index
            return mid;

        else if (key < Array[mid]) // If key is smaller, search in the left sub-array
            return Binary_Search(Array, key, low, mid - 1);

        else // If key is larger, search in the right sub-array
            return Binary_Search(Array, key, mid + 1, high);
    }
}

int main() {
    int Array[] = { 3, 4, 5, 6, 7, 8, 9 };
    int key = 2;
    int size = (sizeof(Array) / sizeof(Array[0]));
    int result = Binary_Search(Array, key, 0, size - 1); // Perform binary search

    // Display search result
    if (result != -1)
        cout << key << " Is Found At Index  " << result << endl;
    else
        cout << "Key Is Not Found." << endl;

    return 0;
}
