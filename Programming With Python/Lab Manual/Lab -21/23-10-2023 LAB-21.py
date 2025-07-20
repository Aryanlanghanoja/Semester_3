# # Object Orianted Programming In Python
# # Creating A Phone Class

# class Phone:

#     def make_call(self):
#         print("Make Phone Call")

#     def play_game(self):
#         print("Play Game")

# # Creating A Object


# phone = Phone()

# # Calling A Method

# phone.make_call()
# phone.play_game()

# Second Approach

# # #settiing and returing the attriute values

# class Phone:

#     def set_color(self, color):
#         self.color = color

#     def set_cost(self, cost):
#         self.cost = cost

#     def show_color(self):
#         return self.color

#     def show_cost(self):
#         return self.cost

#     def make_call(self):
#         print("Make Phone Call")

#     def play_game(self):
#         print("Play Game")


# phone_1 = Phone()

# phone_1.set_color('Titanium Grey')
# phone_1.set_cost('150000')

# print(phone_1.show_color())
# print(phone_1.show_cost())
# phone_1.make_call()
# phone_1.play_game()

# # Thire Approach - Constructor

# class Employee :

#     def __init__(self , name , age , salary , gender) :
#         self.name = name
#         self.age = age
#         self.salary = salary
#         self.gender = gender

#     def show_Employee_Detail(self) :
#         print(f"Name :- {self.name}\nAge:- {self.age}\nSalary :- {self.salary}\nGender :- {self.gender}")

# employee  = Employee("Elon Musk",53,1,"Male")
# employee.show_Employee_Detail()

# # Inheritance In Python

# # Baae Class


# class Vehicle:

#     def __init__(self, milage, cost):
#         self.milage = milage
#         self.cost = cost

#     def show_details(self):
#         print(f"Vehicle\nMilage :- {self.milage}\nCost :- {self.cost}")


# vehicle = Vehicle(65, 85000)
# vehicle.show_details()

# # Creating A Child Class


# class Car(Vehicle):

#     def __init__(self, milage, cost, types, horse_power):
#         super().__init__(milage, cost)
#         self.types = types
#         self.horse_power = horse_power

#     def show_car(self):
#         super().show_details()
#         print(
#             f"Number Of Types :- {self.types}\nValue Of Horse Power :- {self.horse_power}")


# car = Car(20, 2000000, 4, 200)
# car.show_car()

# # Post - Lab - 1

# class Person:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age

#     def introduce(self):
#         print(f"My name is {self.name}, and I am {self.age} years old.")


# person1 = Person("Larry Fink", 60)

# print(f"Name: {person1.name}")
# print(f"Age: {person1.age}")
# person1.introduce()

# Post Lab  -2


# class Animal:
#     def __init__(self, name):
#         self.name = name

#     def speak(self):
#         pass


# class Dog(Animal):
#     def speak(self):
#         return f"{self.name} says Woof!"


# class Cat(Animal):
#     def speak(self):
#         return f"{self.name} says Meow!"


# dog = Dog("Buddy")
# cat = Cat("Whiskers")

# print(dog.speak())
# print(cat.speak())

# # Post Lab - 3

# class Employee:
#     def __init__(self, name, salary):
#         self.__name = name
#         self._salary = salary

#     def get_name(self):
#         return self.__name

#     def set_name(self, name):
#         if len(name) > 0:
#             self.__name = name

#     def get_salary(self):
#         return self._salary

#     def set_salary(self, salary):
#         if salary >= 0:
#             self._salary = salary


# employee = Employee("John Doe", 50000)

# print("Employee Name:", employee.get_name())
# print("Employee Salary:", employee.get_salary())

# employee.set_name("Jane Doe")
# employee.set_salary(55000)

# print("Updated Employee Name:", employee.get_name())
# print("Updated Employee Salary:", employee.get_salary())


# Post Lab - 4

class Animal:
    def speak(self):
        pass


class Dog(Animal):
    def speak(self):
        return "Woof!"


class Cat(Animal):
    def speak(self):
        return "Meow!"


class Bird(Animal):
    def speak(self):
        return "Tweet!"


animals = [Dog(), Cat(), Bird()]

for animal in animals:
    print(animal.speak())
