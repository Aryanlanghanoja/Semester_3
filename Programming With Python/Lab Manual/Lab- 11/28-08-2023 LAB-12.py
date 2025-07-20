import numpy as np

# Pre - Lab

#1
'''
#mat1 = np.array([np.arange(2,5),np.arange(5,8),np.arange(8,11)])
mat4 = np.array([np.arange(2,11)])
#print(mat1)
mat4.shape = (3,3)
print(mat4)

#2

mat2 = np.full((1,10), 0)
print(mat2)
num = int(input("Enter The Number You Want To Enter :-"))
index = int(input("Enter At Which Index You Want Change :-"))

if (index <= 9) :
    mat2[0][index-1] = num
else :
    print("Index Doesn't Exist")
print(mat2)


#3

mat3 = np.array([[0,1,0,1],[0,1,0,1],[0,1,0,1],[0,1,0,1]])
print(mat3)

#4

arr1 = np.array([1,2,3,4,2,2,3,4])
list1 = [1,2,3,4,2,2,3,4]
listrep = []
uniquecount = []

for i in range(0,len(list1)) :
    isunique = True 
    
    for j in range(i,len(list1)) :
        if(list1[i] == list1[j]) :
            isunique = False 
            
    if(isunique) :
        listrep.append(list1[i])
    
for i in range(0,len(listrep)) :
    temp = 0
    
    for j in range(0,len(list1)) :
        if(listrep[i] == list1[j]) :
            temp += 1 
    
    uniquecount.append(temp)
    
maxcount = uniquecount[0]

for i in uniquecount :
    if i > max :
        maxcount = i 
        
print(f"The Maximum Count Of Repetation Is {maxcount}")
'''
# Lab 

# # Task - 1 :- Print The ELement Of Matrix With only one for - loop

# arr= np.array([[[1,2],[3,4]],[[5,6],[7,8]]])
# arr1 = np.array([[1,2],[5,6]])

# for x in np.nditer(arr) :
#     print(x,end=" ")
    
# print()
# for x in np.nditer(arr1) :
#     print(x,end=" ")

# print()

# # Task - 2 :- Split Matrix The Matrix

# arr2 = np.array([1,2,3,4,5,6])
# newarr = np.array_split(arr2,2)
# print(newarr,"\n")

# # Searching In Array. 
# #Find Where The Value is 4

# arr3 = np.array([1,2,3,4,5,4,4])
# x = np.where(arr3 == 4)
# print(x,"\n")

# # Sorting Array

# arr5 = np.array([3,2,0,1])
# print(np.sort(arr5))

# arr6 = np.array(['Banana','Cheery','Apple'])
# print(np.sort(arr6))

# # Numpy : Save and Load Arrays As Binary File.(npy,npz)

# # Save Numpy Array as file

# # Creating The File
# arr4 = np.array([[[11,12,13,14],[15,16,17,18]],[[18,19,20,21],[22,23,24,25]]])
# file = open("arr","wb")
# np.save(file, arr4)
# file.close()

# # Reading The File
# file = open("arr","rb")
# arr7 = np.load(file)
# print(arr7)
# file.close()



