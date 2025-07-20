#include<iostream>
using namespace std;

// Function to print the elements of an array
void Print_Array(int Array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << Array[i] << " ";
    }
    cout << endl;
}

// Function implementing Insertion Sort algorithm to sort an array
void Insertion_Sort(int Array[], int size) {
    int key;
    int j;

    // Iterate through each element of the array starting from the second element
    for (int i = 1; i < size; i++) {
        key = Array[i]; // Select the current element to be inserted at the right position
        j = i - 1;

        // Move elements of Array[0..i-1], that are greater than key, to one position ahead of their current position
        while (j >= 0 && key < Array[j]) {
            Array[j + 1] = Array[j];
            j--;
        }

        Array[j + 1] = key; // Place the key at its correct position
    }
}

// Main function
int main() {
    int Array[] = { 90, 150, 1, 45, 63 };
    int size = (sizeof(Array) / sizeof(Array[0])); // Calculate the size of the array

    // Print the original array
    cout << "Original Array: ";
    Print_Array(Array, size);

    // Sort the array using Insertion Sort algorithm
    Insertion_Sort(Array, size);

    // Print the sorted array
    cout << "Sorted Array: ";
    Print_Array(Array, size);

    return 0;
}
