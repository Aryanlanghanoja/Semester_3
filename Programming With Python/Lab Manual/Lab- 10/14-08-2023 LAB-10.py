import numpy as np

# # Implementing the ndim functions
# a = np.array(0)
# b = np.array([1,2,3])
# c = np.array([[1,2,3],[4,5,6]])
d = np.array([[[1,2,3],[4,5,6]],[[1,2,3],[4,5,6]]])
# e = np.array([[[[1,2],[3,4],[5,6]],[[1,2],[3,4],[5,6]]],[[[1,2],[3,4],[5,6]],[[1,2],[3,4],[5,6]]]])
# print(a.ndim)
# print(b.ndim)
# print(c.ndim)
# print(d.ndim)
# print(e.ndim)
# print("\n")

# # Implementing the itemsize function
# print(d.itemsize)

# # Implementing the dtype function
# a = np.array([[1,1+2j],[3,4]])
# print(a.itemsize)

# a = np.array([[1,2],[3,4]])
# print(a.dtype)

# a = np.array([[1,2.0],[3,4]])
# print(a.dtype)

# a = np.array([[1,2],[3,4+3j]])
# print(a.dtype)

# a = np.array([[1,2,3],[4,5,6]])
# print(a[1,1])
# print(a[1][1])

# a = np.random.rand(3, 2)
# print(a)

# a = np.array([[1,2],[3,4]])
# b = np.mean(a,axis=0)
# c = np.mean(a,axis=1)
# print(a)
# print(b)
# print(c)

# a = np.array([[1,2],[3,4]])
# b = np.array([[7,6],[8,9]])
# c = np.append(a, b)
# print(c)

# a = np.array([[1,2],[3,4],[5,6]])
# print(np.insert(a, 2,[5,9],axis= 0))

# # axis = 0 Row wise and axis = 1 Column Wise

# # Arethematic Operation On Matrix

# x = np.array([[1,2],[3,4]],dtype = np.float64)
# y = np.array([[5,6],[7,8]],dtype = np.float64)
# print(x + y)
# print(np.add(x,y))
# print("\n")
# print(x - y)
# print(np.subtract(x,y))
# print("\n")
# print(x * y)
# print(np.multiply(x,y))
# print(np.dot(x, y))
# print("\n")
# print(x/y)
# print(np.divide(x,y))
# print("\n")

arr1 = np.array([1,2,3])
arr2 = np.array([[1],[2],[3]])
sum = arr1 + arr2
print(sum)