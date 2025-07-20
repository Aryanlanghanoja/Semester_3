# # Implementing While Loop

# i = 1 

# while i <= 5 :
#     print(i)
#     i = i + 1
    
# # Implementing While Loop with If-else condition and continue statement

# i = 0 

# while i < 9 :
    
#     i += 1
#     if i == 3 :
#         continue
#     print(i)
    
 
# # Implementing While Loop with If-else condition and break statement
   
# i = 0 

# while i < 9 :

#     if i == 3 :
#         break
#     print(i)
#     i += 1
    
# # Implementing While Loop with If-else pass statement
   
# i = 0 

# while i < 9 :
#     i += 1
#     if i == 3 :
#         pass
#     print(i)


# # User Define Function

# def AryanLAnghanoja() :
#     print("Hii Aryan Langhanoja")
    
# AryanLAnghanoja()

# def Greet(name) :
#     print(f"Greetings : {name}")
    
# Greet("Aryan Langhanoja")

# def Square(num) :
#     return(num**2)
# num = int(input("Enter The Number:-"))
# print(Square(num))

# # Value inside the function

# def Aryan() :
#     a = 5 
#     print(a)
    
# a = 10 
# Aryan()
# print(a)

# # Function Inside Function 

# def Out() :
#     print("Outer Function.")
    
#     def In() :
#         print("Inside Function.")
        
#     In()
# Out()

# # Lambda Function

# Lambda  = lambda x:x*3 
# print(Lambda(5))

# Extercise

# 1

# for i in range(1,9) :
#     for j in range(1,9) :
#         print(' #',end=' ')
#     print('\n')
    
# #2

# even = 0
# odd = 0

# for i in range(0,101) :
#     if(i % 2 == 0) :
#         even = even + i
    
#     else :
#         odd = odd + i
        
# print(f"The Sum of All Even Numbers Is {even} and The Sum of All Odd Number Is {odd} Between 1 to 100")

# #3

# for i in range(10,301,10) :
#         print(i,end=" ")
# print('\n')
        
# #4 

# i = 105 
# while(i > 0) :
#     print(i,end=' ')
#     i = i - 7 

# print("\n")

# #5

# num = int(input("Enter The Number :- "))
# div = 0
# for i in range(2,num) :
#     if (num % i == 0) :
#         div += 1
#         break
    
# if( div > 0 ) :
#     print(f"{num} Is Not A Prime Number.")

# else :
#     print(f"{num} Is A Prime Number.")

# #6

# num1 = input("Enter The Number:-")
# print(f"The Reverse Of {num1} Is {num1[::-1]}")

# #7

# num = input("Enter The Binary Number:-")
# legth = len(num)
# numint = int(num)
# ans = 0

# for i in range(0,legth) :
#     digit = numint % 10 
#     ans = ans + (digit * (2**i))
#     numint = numint / 10 
    
# print(f"The Decimal Equvivalent Of Binary Number {num} Is {int(ans)}")

##8

# num8 = int(input("Enter A Number :- ")) 
# temp = num8 
# rev = 0 
# while(temp != 0) :
#     rev = rev*10 + temp%10
#     temp = int(temp  / 10) 

# if (num8 == rev) :
#     print(f"{num8} Is A Palindrome Number.")

# else :
#     print(f"{num8} Is Not A Palindrome Number.")
   
    
# #9

# list9 = []
# num = 0 

# while (num < 10) :
#     temp = int(input(f"Enter A Number - {num+1} :- "))
#     list9.append(temp)
#     num += 1 
    
# print(f"Largest And Smallest Number Of {list9} Is {max(list9)} and {min(list9)}")

# #10

# for i in range(100,501) :
#     if (i % 13 == 0 and i % 3 != 0) :
#         print(i,end=" ")
        
##11

# user_numbers = []
# while True:
#     num = input("Enter a number (or 'done' to finish): ")
#     if num.lower() == 'done':
#         break
#     num = int(num) 
#     if num % 2 != 0:
#         user_numbers.append(num)
# print("Odd numbers in the list:")
# for odd_num in user_numbers:
#     print(odd_num,end=" ")
    
# #12

# result = []

# for num in range(1500, 2701):
#     if num % 7 == 0 and num % 5 == 0:
#         result.append(num)

# print("Numbers divisible by 7 and multiples of 5 between 1500 and 2700:")
# print(result)

# #13

def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

while True:
    print("Choose an option:")
    print("1. Celsius to Fahrenheit")
    print("2. Fahrenheit to Celsius")
    print("3. Quit")

    choice = input("Enter your choice (1/2/3): ")

    if choice == '1':
        celsius = float(input("Enter temperature in Celsius: "))
        fahrenheit = celsius_to_fahrenheit(celsius)
        print(f"{celsius} Celsius is equal to {fahrenheit:.2f} Fahrenheit")
    elif choice == '2':
        fahrenheit = float(input("Enter temperature in Fahrenheit: "))
        celsius = fahrenheit_to_celsius(fahrenheit)
        print(f"{fahrenheit} Fahrenheit is equal to {celsius:.2f} Celsius")
    elif choice == '3':
        print("Exiting the program.")
        break
    else:
        print("Invalid choice. Please enter 1, 2, or 3.")





