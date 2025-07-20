import numpy as np

# Pre Lab - 
# 1
'''
rows = int(input("Enter The Number Of Rows :-"))
columns = int(input("Enter The Number Of Columns:-"))

mat1 = np.zeros((rows,columns))

for i in range(0,rows) :
    for j in range(0,columns) :
        mat1[i][j] = int(input(f"Enter The Integer At [{i+1}][{j+1}] :- "))
        
print(f"Your Matrix Is {mat1}")

find = int(input("Enter The Number You Want To Find In Matrix :-"))

if(find in mat1) :
    print(f"The {find} Is In The Matrix")
else :
    print(f"The {find} Is Not In The Matrix")
'''
#2
'''
rows1 = int(input("Enter The Number Of Rows :-"))
columns1 = int(input("Enter The Number Of Columns:-"))

mat2 = np.zeros((rows1,columns1))
inputnum = 0
for i in range(0,rows1) :
    for j in range(0,columns1) :
        mat2[i][j] = int(input(f"Enter The Integer At [{i+1}][{j+1}] :- "))
        
print(f"Your Matrix Is {mat2}")

list1 = mat2.flatten()
list2 = list(list1)
    
print(list2)
print(max(set(list2),key =list2.count))
'''

#3
'''
rows2 = int(input("Enter The Number Of Rows :-"))
columns2 = int(input("Enter The Number Of Columns:-"))
mat3 = np.zeros((rows2,columns2))

inputnum1 = 0
for i in range(0,rows2) :
    for j in range(0,columns2) :
        mat3[i][j] = int(input(f"Enter The Integer At [{i+1}][{j+1}] :- "))
        
print("Your Matrix Is :-")
print(mat3)

list5 = list(mat3[::-1,::-1])
print("Reversed Array Is :-")
print(np.array(list5))
'''
#4
'''
mat4 = np.identity(3)
print(mat4)
value = 1
for i in range(0,3) :
    for j in range(0,3) :

        if(i != j) :
            value += 1
            mat4[i][j] = value
print(mat4)
'''

# Lab

File = np.loadtxt("Matrix.txt",dtype=int)
print(File)

#F2 = np.loadtxt("Name.txt",skiprows=1,dtype=str)
#print(F2)

#F3 = np.loadtxt("Marks.txt",dtype=str,usecols=2,skiprows=1)
#print(F3)

# for i in F3:
#     print(i)

#F4 = np.genfromtxt("Alphabet.txt",dtype=str,encoding = None,delimiter = ',')
#print(F4)

F5 = np.genfromtxt("Report.txt",dtype=str,encoding = None,skip_footer=1)
print(F5)

# Post Lab

#1
'''
dim = int(input("Enter The Dimmension Of A Identity Matrix:-"))
mat4 = np.identity(dim)
list5 = mat4.flatten()
boollist = []

for i in range(0,len(list5)) :
    boollist.append(bool(list5[i]))
'''
