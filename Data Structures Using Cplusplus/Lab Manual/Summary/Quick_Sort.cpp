#include<iostream>
using namespace std;

// Function to swap two elements in an array
void Swap_Elements(int* Element_1, int* Element_2) {
    int temp = *Element_1;
    *Element_1 = *Element_2;
    *Element_2 = temp;
}

// Function to print elements of an array
void Print_Array(int Array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << Array[i] << " ";
    }
    cout << endl;
}

// Function to partition the array for Quick Sort
int Partition(int Array[], int low, int high) {
    int Pivot = Array[high]; // Selecting the pivot element
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (Array[j] <= Pivot) { // Comparing elements with the pivot
            i++;
            Swap_Elements(&Array[i], &Array[j]); // Swapping elements if necessary
        }
    }

    Swap_Elements(&Array[i + 1], &Array[high]); // Placing the pivot element in its correct position
    return i + 1; // Returning the position of the pivot element
}

// Function to perform Quick Sort recursively
void Quick_Sort(int Array[], int low, int high) {
    if (low < high) {
        int Pivot = Partition(Array, low, high); // Partitioning the array

        // Sorting elements before and after the pivot recursively
        Quick_Sort(Array, low, Pivot - 1);
        Quick_Sort(Array, Pivot + 1, high);
    }
}

int main() {
    int Array[] = { 8, 7, 6, 1, 0, 9, 2 };
    int size = sizeof(Array) / sizeof(Array[0]);

    cout << "Original Array: ";
    Print_Array(Array, size);

    Quick_Sort(Array, 0, size - 1); // Sorting the array using Quick Sort

    cout << "Sorted Array: ";
    Print_Array(Array, size);

    return 0;
}
