# import numpy as np
# a = np.array([1,2,3,4,5])
# print(a)


# import numpy as np
# a = np.array([[1,2,3,4,5],[6,1,2,3,4]])
# print(a[1][0])


# import numpy as np
# a = np.array([1,2,3,4,5])
# print(a)
# print(type(a))


# import numpy as np
# a = np.zeros((1,20))
# print(a)


# import numpy as np
# a = np.zeros((5,5))
# print(a)


# import numpy as np
# a = np.ones((5,5))
# print(a)


# import numpy as np
# a = np.full((5,5),6)
# print(a)


# import numpy as np
# a = np.ones((5,5))
# # b = np.zeros((5,5))
# b = np.full((5,5),6)
# c = a * b
# print(c)


# import numpy as np
# a = np.arange(10,20)
# b = np.arange(0,101,5)
# print(a)
# print(b)


# import numpy as np
# a = np.random.randint(1,100,999999999)
# print(a)


# import numpy as np
# a = np.array([[1,2,3,4,5],[10,9,8,7,6]])
# print(a)
# print(a.shape)
# a.shape = (5,2)
# print(a)


# import numpy as np
# a = np.array([[1,2,"B",4,5],[10,9,8,7,6]])
# b = np.array([["A",9,8,7,6],[1,2,3,4,5]])
# print(a)
# print(b)
# print(np.hstack((a,b)))
# print(np.vstack((a,b)))
# print(np.column_stack((a,b)))

# array union and intersection
# import numpy as np
# a = np.array([[1,2,3,4,5],[10,9,8,7,6]])
# b = np.array([[10,9,8,66,6],[1,2,3,4,5]])
# print(np.intersect1d(a,b))
# print(np.setdiff1d(a,b))
# print(np.setdiff1d(b,a))


# import numpy as np
# a = np.array([[1,2,3,4,5],[10,9,8,7,6]])
# b = np.array([[10,9,8,66,6],[1,2,3,4,5]])
# print(a)
# print(b)
# print(a+b)


# import numpy as np
# a = np.array([10,20])
# b = np.array([30,40])
# print(np.sum([a,b]))
# print(np.sum([a,b],axis=1))
# print(np.sum([a,b],axis=0))



# import numpy as np
# a = np.array([10,20])
# print(a+1)
# print(a*2)
# print(a-1)
# print(a/2)
# print(a**2)