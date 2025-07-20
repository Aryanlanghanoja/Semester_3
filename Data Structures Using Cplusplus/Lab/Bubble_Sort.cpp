#include<iostream>
using namespace std;

int main() {
	int a[10];
	int count = 0;

	cout << "Enter The 10 Integer For An Array :- \n";

	for (int i = 0;i < 10;i++) {
		cout << "Enter The Intege At " << i << " th Index :- \n";
		cin >> a[i];
	}

	cout << " Before Sorting :- \n";

	for (int i = 0; i < 10;i++) {
		cout << a[i] << "\n";
	}

	cout << "Bubble Sort Is Performed .....\n";

	for (int i = 0;i < 9;i++) {
		int swap = 0;
		for (int j = 0; j < 9 - i;j++) {
			count++;
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				swap++;
			}
		}

		if (swap == 0) {
			break;
		}
	}

	cout << "After Sorting :- \n";

	for (int i = 0; i < 10;i++) {
		cout << a[i] << "\n";
	}

}