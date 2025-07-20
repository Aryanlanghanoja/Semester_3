#include<iostream>
using namespace std;

// Function to print the elements of an array
void Print_Array(int Array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << Array[i] << " ";
    }
    cout << endl;
}

// Function to merge two subarrays of the main array
void Merge_Array(int Array[], int left, int middle, int right) {
    // Create temporary arrays to hold the two subarrays
    int subArray1[middle - left + 1];
    int subArray2[right - middle];

    // Copy data to the temporary arrays
    for (int i = 0; i < middle - left + 1; i++) {
        subArray1[i] = Array[left + i];
    }

    for (int j = 0; j < right - middle; j++) {
        subArray2[j] = Array[middle + 1 + j];
    }

    // Merge the two temporary arrays back into the main array
    int i = 0; // Initial index of the first subarray
    int j = 0; // Initial index of the second subarray
    int k = left; // Initial index of the merged array

    while (i < middle - left + 1 && j < right - middle) {
        if (subArray1[i] < subArray2[j]) {
            Array[k++] = subArray1[i++];
        }
        else {
            Array[k++] = subArray2[j++];
        }
    }

    // Copy the remaining elements of subArray1, if any
    while (i < middle - left + 1) {
        Array[k++] = subArray1[i++];
    }

    // Copy the remaining elements of subArray2, if any
    while (j < right - middle) {
        Array[k++] = subArray2[j++];
    }
}

// Function to implement Merge Sort algorithm
void Merge_Sort(int Array[], int left, int right) {
    // Base case: If left equals right, no further splitting is possible
    if (left == right) {
        return;
    }

    // Find the middle point to divide the array into two halves
    int middle = (left + right) / 2;

    // Recursively sort the two halves
    Merge_Sort(Array, left, middle);
    Merge_Sort(Array, middle + 1, right);

    // Merge the sorted halves
    Merge_Array(Array, left, middle, right);
}

int main() {
    // Initialize an array and determine its size
    int Array[] = { 10, 28, 24, 63, 4, 18, 38, 44 };
    int size = sizeof(Array) / sizeof(Array[0]);

    // Display the original array
    cout << "Original Array: ";
    Print_Array(Array, size);

    // Perform Merge Sort on the array
    Merge_Sort(Array, 0, size - 1);

    // Display the sorted array
    cout << "Sorted Array: ";
    Print_Array(Array, size);

    return 0;
}
