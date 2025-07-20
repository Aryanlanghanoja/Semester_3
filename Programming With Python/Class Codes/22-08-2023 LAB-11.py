import numpy as np

# Adding The Two Different Dimmennsiion Matrix if and only if the row of 1 matrix should be equal to the column of other matrix
# Broadcasting
mat1 = np.array([1,2,3])
mat2 = np.array([[1],[2],[3]])
sum = mat1 + mat2 
print(sum)

# 2x2 matrix

mat2x2 = np.array([[1,2],[3,4]])
print("2 x 2 Matrix Is ",mat2x2)

# 3x3 matrix

mat3x3 = np.array([[1,2,3],[4,5,6],[7,8,9]])
print("3 x 3 MAtrix Is ",mat3x3)


# Matrix Dot Multiplication 

matmul1 = np.array([[1,2],[3,4]])
matmul2 = np.array([[5,6],[7,8]])
resultmul = np.dot(matmul1, matmul2)
print(resultmul)

# Transpose Of A Matrix

A = np.array([[1,2,3],[4,5,6],[7,18,9]]) # We can use shape function 
#also

print(np.transpose(A))
print(np.shape(A))

# Determinant Of A Matrix

print(np.linalg.det(A))

# Inverse Of A Matrix

print(np.linalg.inv(A))

# Converting matrix in a single row

print(A.flatten())

# Numpy Array Itteration

Mat = np.array([[1,2,3],[4,5,6]])

for i in Mat :
    for j in Mat[i] :
        print(Mat[i][j])
    print("\n")
Mat1d = np.array([1,2,3])

for i in Mat1d :
    print(i)
    
# Post Lab

    


