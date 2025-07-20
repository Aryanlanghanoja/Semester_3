# # Task-1

# for i in range(1,6) :
#     for j in range(1,i+1) :
#         print(f" {j}",end=" ")
#     print()
    
# # End

# # Task - 2

# num = int(input("Enter A Number:- "))
# sum = 0
# for i in range(1,num+1):
#     sum = sum + i
# print(f"The Sum Of All Digits till {num} Is {sum}")

# # End

# # Task - 3

# num1 = int(input("Enter A Number:- "))
# num2 = num1
# ans = 0
# while(num1 != 0) :
#     ans = ans + num1%10
#     num1 = int(num1/10)

# print(f"The Sum Of All Digits of {num2} Is {ans}")

# # End

# # Task - 4

# for i in range(0,5) :
#     for j in range(0,5-i) :
#         print(f" {5-i-j}",end=" ")
#     print()
    
# # End

# # Task - 5

# list1 = [10,20,30,40,50]

# for i in range(0,len(list1)) :
#     print(list1[len(list1) - 1 - i])

# # End

# # Task - 6

# anslist = []

# for i in range(4,31) :
#     if(i%2 == 0) :
#         anslist.append(i)
        
# print(anslist)

# # End

# # Task - 7

# list1 = [4, 6, 8, 24, 12, 2]
# max = list1[0]

# for i in list1 :
#     if(i > max) :
#         max = i 
        
# print(f"The Greatest Element Of {list1} Is {max}")

# # End