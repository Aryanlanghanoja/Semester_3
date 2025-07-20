# tup1 = (1,3,'5',[6,'7',8,True],8)
# print(tup1[3][1])

# dic1 = {'A' : 65,'B' : {'A' : 35 , 'B' : 54} ,'C' : 67}
# print(dic1['A'])
# print(dic1['B']['B'])

# fruit = {'Apple':20,'Mango' : 23}
# fruit1 = {'Grpares' :25 , 'Banana' : 35}
# mix = fruit.update(fruit1)
# print(fruit)
# fruit.pop('Banana')
# print(fruit)

# set1 = {1,1,3,"4",5,6}
# print(set1)

# s1 = {1,2,3,4,5,6}
# s2 = {1,2,4,6,7,9}
# print(s1.union(s2))
# print(s1.intersection(s2))
# print(0x12)
# print(0o13)
# print(0b1111)

# tup2 = ("I" , "C", "T")
# print(''.join(tup2))

# # Arethematic Operator

# X = 5
# Y = 2

# print(X + Y)
# print(X - Y)
# print(X*Y)
# print(X / Y) # Floating Division
# print(X//Y) # Floor Division
# print(X%Y)
# print(X**Y)

# # Logical Operator

# X = 56
# Y = 43

# print(X > 50 and Y < 50)
# print(X > 50 or Y > 50)
# print(not(X < 50))

# # Identity Operator

# A = [1,2,3]
# B = [1,2,3]
# C = A

# print(A is B)
# print(A is C)

# # Member Operator

# A = 2
# B = [1,2,3]

# print(A in B)
# print(A not in B)

# # Task - 1

# tup3 = ("A" , "R", "Y","A","N")
# print(''.join(tup3))

# # Task - 2

# tuple1 = (11,22)
# tuple2 = (99,88)
# tuple3 = tuple1
# tuple1 = tuple2
# tuple2 = tuple3

# print(tuple1)
# print(tuple2)

# # Task - 3

# tuple3 =  ("Orange" , [10,20,30],(5,15,25))
# print(tuple3[1][1])

# # Task - 4

# tuple4 = (11,[22,33],44,55)
# tuple4[1][0] = 222
# print(tuple4)

# # Task - 5

# for i in range(1, 11):
#     print(10, " ", i, " ", i * 10)
    
# # Task - 6

for i in range(1,6):
    
    for j in range(1 , 5-i) :
        print(" ",end="")
        
    for j in range(1,i) :
        print(" * ",end="")

    print("\n")
    
# # Conditional Statement

# A = 3

# if A < 3 :
#     print(f'{A} Is Greater Than 5')

# else :
#     print(f'{A} Is Less Than 5')
    

# B = 15 
 
# if B > 10 :
#     print("%d Is Greater Than 10" % B)
    
# elif B > 5 :
#     print("%d Is Greater Than 5" % B)
    
# else :
#     print("%d Is Not Greater Than 5"% B)


