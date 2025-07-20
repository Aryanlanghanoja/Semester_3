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

# #settiing and returing the attriute values

# class Phone :
    
#     def set_color(self,color) :
#         self.color = color
        
#     def set_cost(self,cost) :
#         self.cost = cost 
        
#     def show_color(self) :
#         return self.color
    
#     def show_cost(self) :
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

# Inheritance In Python

# Baae Class

class Vehicle :
    
    def __init__(self , milage , cost) :
        self.milage = milage 
        self.cost = cost 
        
    def show_details(self) :
        print(f"Vehicle\nMilage :- {self.milage}\nCost :- {self.cost}")
        
vehicle = Vehicle(65,85000)
vehicle.show_details()

# Creating A Child Class

class Car(Vehicle) :
    
    def __init__(self, milage, cost , types,horse_power):
        super().__init__(milage, cost)
        self.types = types 
        self.horse_power = horse_power
        
    def show_car(self) :
        super().show_details()
        print(f"Number Of Types :- {self.types}\nValue Of Horse Power :- {self.horse_power}")
                
car = Car(20,2000000 , 4 , 200)
car.show_car()

