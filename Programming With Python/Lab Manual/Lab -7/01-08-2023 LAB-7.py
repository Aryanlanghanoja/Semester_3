# # Task-1 - Abstract Character From String Using For Loop

# A = "Aryan Langhanoja"

# for var in A :
#     print(var,end="")

# print("")
# for i in range(0,len(A)) :
#     print(A[i],end="")

# # End

# # Task-2 - Print Character USing end 

# A = "Aryan Langhanoja"
# for i in range(0,len(A)) :
#     print(A[i],end = " * ")  
# print("\n")

# # End 

# # Task-3 -  Using Loops In A List

# list1 = ["A","R","Y","A","N"]

# print("\n")
# for i in list1 :
#     print(i)
    
# print("\n")

# # End

# # Task-4 -  Find The Average of numbers in a List

# list2 = [1,6,7,8,34,56,78,4346,3432987]

# for i in range(0,len(list2)) :
#     sum = 0
#     sum = sum + list2[i]
    
# print(f"Avergae of {list2} is {sum/len(list2)}")

# # End

# # Task-5 - Use Loop In Tuple

# tuple1 = (1,2,345464,74543566,255456,89435) 

# for i in range(0,len(tuple1)) :
#     sum = 0
#     sum = sum + tuple1[i]
    
# print(f"Avergae of {tuple1} is {sum/len(tuple1)}")

# # End

# # Task-6 - Use range in for loop

# for i in range(0,11) :
#     print(i)
    
# # End

# # Task-7 - Factorial

# num = int(input("Enter A Number:-"))
# ans = 1
# for i in range(1,num + 1) :
#     ans = ans * i 
    
# print(f"The Factorial of {num} Is {ans}")

# # End

# # Task-8 - Table Using Loops

# table = int(input("ENter The Number:-"))

# for i in range(1,11) :
#     print(f"{table} X {i} = {table*i}")
    
# # End

# # Task-9 - List Using Range

# list1 = ["A","R","Y","A","N"]

# for i in range(0,len(list1)) :
#     print(list1[i])

# # End

# # Task-10 - Nested For Loops

# list3 = ["Meta","Apple","Amazon","Netflix","Google"]

# for i in range(0,len(list3)) :
#     print(f"The Letters of {list3[i]} Is :-")
    
#     for j in range(0,len(list3[i])) :
#         print(list3[i][j])
        
# # End
        
# # Task-11 : for loop using else

# for i in range(0,10,1) :
#     if(i >= 0) :
#         print(i)
        
#     else :
#         print("Loop Is Terminated")
        
# # End

# Task-12 : for loop using break

# for i in range(0,10,1) :
#     if(i > 5) :
#         print(i)
#         break

# End

# # Task-13 : for loop using continue
        
# for i in range(0,10,1) :
#     if(i > 5) :
#         continue
    
#     else :
#         print(i)
        
# End

# Pst Lab

# # TAsk-1

# num = int(input("Enter A Number:-"))
# ans = 1
# for i in range(1,num + 1) :
#     ans = ans * i 
    
# print(f"The Factorial of {num} Is {ans}")

# # TASk-2

# list4 = [2,4,6,8]
# square = []

# for i in list4 :
#     square.append(i**2)
    
# print(square)

# # TAsk-3

# list5 = [9,-5,4,-83,45,78,-45,-345,342345,-54,-224552]
# pos = []
# neg = []

# for i in list5 :
    
#     if i >= 0 :
#         pos.append(i)

#     else :
#         neg.append(i)
        
# print(pos)
# print(neg)

# # Task-4

# list6 = range(1,101) 
# even = []
# odd = []

# for i in list6 :
#     if i % 2 == 0 :
#         even.append(i)
        
#     else :
#         odd.append(i)
        
# print(even)
# print(odd)

# # Task -5

# range1 = int(input("Enter The Ending Number Of Range:-"))

# list7 = range(0,range1+1) 
# evenlist = []

# for i in list7 :
    
#     if i % 2 == 0 :
#         evenlist.append(i) 
        
# print(evenlist)

# # TAsk - 6

# addrange = int(input("Enter The Ending Number Of Range:-"))
# sum = 0

# for i in range(1,addrange+1) :
#     sum = sum + i
    
# print(f"The Addition Of All Numbers of {range(0,addrange+1)} Is {sum}")

# # Task -7 

# oddrange = int(input("Enter The Ending Number Of Range:-"))

# list7 = range(0,oddrange+1) 
# oddlist = []
# oddsum = 0

# for i in list7 :
    
#     if i % 2 != 0 :
#         oddlist.append(i)
#         oddsum = oddsum + i
        
# print(f"The Addition Of All Numbers of {oddlist} Is {oddsum}")

# # TAsk - 8

# table2 = int(input("ENter The Number:-"))

# for i in range(1,11) :
#     print(f"{table2} X {i} = {table2*i}")
    
# # Task - 9

# number = input("Enter A Number :- ")
# print(f"There Are {len(number)} Digits In A {number}")

# # Task -10

# string = input("Enter A String:-")
# revstring = string[::-1]
# if(string == revstring) :
#     print(f"{string} Is Palindrome")
    
# else :
#     print(f"{string} Is Not Palindrome")
    

# # TAsk - 11

# string = input("Enter A Number:-")
# digit = char = 0

# for i in string :
#     if i.isdigit() :
#         digit += 1 
    
#     elif i.isalpha() :
#         char += 1
        
#     else :
#         continue
    

# print(f"The Number Of Digits Is {digit} And Characters Is {char} In The String {string}")

# Task -12

for i in range(0,5) :
    
    for j in range(0,i+1) :
        print("* ",end=" ")
        
    for j in range(i,6) :
        print(" ",end=" ")

    print("\n")

for i in range(0,4) :
    
    for j in range(0,4-i) :
        print("* ",end=" ")   
        
    for j in range(0,i) :
        print(" ",end=" ")    
        
    print("\n")