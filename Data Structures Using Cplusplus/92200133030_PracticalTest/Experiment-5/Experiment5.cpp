#include<iostream>
#include<string>
using namespace std;

class GetEmployeeName {
public:
    string Name;

    void set_name(string n) {
        Name = n;
    }

    string get_name() {
        return Name;
    }
};

class GetEmployeePost {
public:
    string Post;

    void set_post(string p) {
        Post = p;
    }

    string get_post() {
        return Post;
    }
};

class GetEmployeeSalary {
public:
    double Salary;

    void set_salary(double s) {
        Salary = s;
    }

    double get_Salary() {
        return Salary;
    }
};

class GetEmployeeAge {
public:
    int age;

    void set_age(int a) {
        age = a;
    }

    int get_age() {
        return age;
    }
};

class Employee : public GetEmployeeName, public GetEmployeePost, public GetEmployeeSalary, public GetEmployeeAge {
public:
    void Dispaly() {
        cout << "Employee Details :- \nName :- " << get_name() << "\nPost :- " << get_post() << "\nSalary :- " << get_Salary() << "\nAge :- " << get_age() << endl;
    }
};

int main() {

    string name;
    string post;
    double salary;
    int age;
    Employee E;

    cout << "Enter The Name Of A Employee :- ";
    cin >> name;

    cout << "Enter The Post Of A Employee :- ";
    cin >> post;

    cout << "Enter The Salary Of A Employee :- ";
    cin >> salary;

    cout << "Enter The Age Of A Employee :- ";
    cin >> age;

    E.set_name(name);
    E.set_post(post);
    E.set_salary(salary);
    E.set_age(age);
    E.Dispaly();

    return 0;
}