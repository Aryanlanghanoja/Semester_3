#include<iostream>
using namespace std;

// Function to swap values using pointers
void Swap_Values(int* val1, int* val2) {
    int temp = *val1;
    *val1 = *val2;
    *val2 = temp;
}

// Function to print the elements of an array
void Print_Array(int array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

// Function to perform selection sort on an array
void Selection_Sort(int array[], int size) {
    int min_Index;

    // Loop through the array
    for (int i = 0; i < size - 1; i++) {
        min_Index = i;

        // Find the index of the minimum element
        for (int j = i + 1; j < size; j++) {
            if (array[j] < array[min_Index]) {
                min_Index = j;
            }
        }

        // Swap the found minimum element with the first element
        Swap_Values(&array[i], &array[min_Index]);
    }
}

int main() {
    int Array[5] = { 12, 54, 2, 3, 9 };
    int size = sizeof(Array) / sizeof(Array[0]);

    // Display the original array
    cout << "Original Array: ";
    Print_Array(Array, size);

    // Sort the array using selection sort
    Selection_Sort(Array, size);

    // Display the sorted array
    cout << "Sorted Array: ";
    Print_Array(Array, size);

    return 0;
}
