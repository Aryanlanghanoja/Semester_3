#include<iostream>
using namespace std;

// Function to swap two integer values
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

// Function implementing Bubble Sort algorithm to sort an array
void Bubble_Sort(int array[], int size) {
	for (int i = 0; i < size - 1; i++) {
		bool Is_Swapped = false;
		for (int j = 0; j < size - i - 1; j++) {
			if (array[j] > array[j + 1]) {
				Swap_Values(&array[j], &array[j + 1]); // Swap if elements are out of order
				Is_Swapped = true;
			}
		}

		if (!Is_Swapped)
			break; // If no swaps occur in an iteration, the array is sorted
	}
}

int main() {
	// Array initialization
	int Array[] = { 45, 89, 23, 65, 21 };
	int size = sizeof(Array) / sizeof(Array[0]); // Calculating array size

	// Display original array
	cout << "Original Array: ";
	Print_Array(Array, size);

	// Sort the array using Bubble Sort algorithm
	Bubble_Sort(Array, size);

	// Display sorted array
	cout << "Sorted Array: ";
	Print_Array(Array, size);

	return 0;
}
