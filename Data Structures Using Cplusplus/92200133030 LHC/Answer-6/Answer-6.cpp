#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    string name;
    unsigned long Enrollment_no;
    int age;
    Student* Next;

    Student(string student_name, unsigned long student_roll_no, int student_age) {
        name = student_name;
        Enrollment_no = student_roll_no;
        age = student_age;
        Next = NULL;
    }
};

class Student_List {
public:
    Student* First_Student;

    Student_List() {
        First_Student = NULL;
    }

    void InsertStudent(string student_name, unsigned long student_roll_no, int student_age) {
        Student* newStudent = new Student(student_name, student_roll_no, student_age);

        if (First_Student == NULL) {
            First_Student = newStudent;
            return;
        }

        Student* temp = First_Student;

        while (temp->Next != NULL) {
            temp = temp->Next;
        }

        temp->Next = newStudent;
    }

    void DeleteStudent(unsigned long Student_roll_no) {
        if (First_Student == NULL) {
            cout << "There Is No Student In Your Class." << endl;
            return;
        }

        if (First_Student->Enrollment_no == Student_roll_no) {
            Student* todelete = First_Student;
            First_Student = First_Student->Next;
            delete todelete;
            return;
        }

        Student* temp = First_Student;
        while (temp->Next != NULL && temp->Next->Enrollment_no != Student_roll_no) {
            temp = temp->Next;
        }

        if (temp->Next == NULL) {
            cout << "There Is No Student Exist Having Enrollment No: " << Student_roll_no << endl;
        } else {
            Student* todelete = temp->Next;
            temp->Next = temp->Next->Next;
            delete todelete;
        }
    }

    void Display_Detail() {
        Student* temp = First_Student;
        int i = 1;
        while (temp != NULL) {
            cout << "Student - " << i << " :- " << endl;
            cout << "Name :- " << temp->name << endl;
            cout << "Enrollment No :- " << temp->Enrollment_no << endl;
            cout << "Age :- " << temp->age << endl;
            cout << "________________________________________________" << endl;
            i++;
            temp = temp->Next;
        }
    }

    void SortBasedonAge() {
        if (First_Student == NULL) {
            cout << "No students to sort. The list is empty." << endl;
            return;
        }

        Student* current = First_Student;

        while (current != NULL) {
            Student* next = current->Next;

            while (next != NULL) {
                if (current->age > next->age) {
                    swap(current, next);
                }
                next = next->Next;
            }
            current = current->Next;
        }

        Display_Detail();
    }
};

int main() {
    Student_List student_list;
    int choice;
    string name;
    int age;
    unsigned long enrollment_no;

    do {
        cout << "You Can Perform Following Operations :- " << endl;
        cout << "1) Add New Student." << endl;
        cout << "2) Delete Student Based on Enrollment No." << endl;
        cout << "3) Display Students Information." << endl;
        cout << "4) Sort The Student Base On Age." << endl;
        cout << "5) Exit." << endl;
        cout << "Enter Your Choice To Perform The Task: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter The Name Of Student: ";
                cin >> name;

                cout << "Enter The Roll Number Of A Student: ";
                cin >> enrollment_no;

                cout << "Enter The Age Of A Student: ";
                cin >> age;

                student_list.InsertStudent(name, enrollment_no, age);
                break;

            case 2:
                cout << "Enter The Roll Number Of A Student Which You Want to Delete: ";
                cin >> enrollment_no;
                student_list.DeleteStudent(enrollment_no);
                break;

            case 3:
                student_list.Display_Detail();
                break;

            case 4:
                student_list.SortBasedonAge();
                break;

            case 5:
                cout << "Exiting the code." << endl;
                break;

            default:
                cout << "Invalid Choice. Enter a Valid Choice." << endl;
                break;
        }
    } while (choice != 5);

    return 0;
}
