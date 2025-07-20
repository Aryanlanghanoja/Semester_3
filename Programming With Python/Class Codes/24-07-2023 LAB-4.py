# A = "{} Marwadi University , {}"
# print(A.format('ICT ','Rajkot'))

# # By default left bracket index is 0 and right braket index 1 but if we specify it

# B = "{1} Marwadi University , {0}"
# print(B.format('ICT ','Rajkot'))

# # You CAn LAble ALso
# C = "{UniversityName} University , {CityName}"
# print(C.format(UniversityName = "Marwadi",CityName = "Rajkot"))

# per = (500/500) * 100
# D = "Result = {r:4.2f} %".format(r = per)
# print(D)

# # Data Structures 

# #tuple 
# # Tuple is the collection of elements with any data type.and tupls are immutable
# tuple1 = ("A",1,1+2j,1.25)
# tuple2 = ("B",1.25,6,"C")
# print(tuple1)
# print(tuple1[0])
# print(tuple1[1])
# print(tuple1[2])
# print(tuple1[3])
# print(tuple1[0:4])
# print(len(tuple1))
# print(tuple1 + tuple2)
# print(len(tuple1 + tuple2))
# tuple3 = ('ABC',2.53,1+3j,2+4j,6)
# tuple4 = ('A','B','C',7+2j)
# tuple5 = tuple3[2:4] + tuple4[3:4]

# # if you extract single element than it can't be concated.
# print(tuple5)

# # List
# # LIst are Mutable and it is a collection of element with any data type,you can change any element wit any data atype
# list1 = ['A' , 2.5 , 2+3j , 6]
# list2 = [3.7 , 'B' , True , 6+4j]
# print(list1[0])
# list1[0] = 5
# print(list1 + list2)
# print(type(list(tuple1)))

tuple6 = ('6','7',1.25,2+3j)
list3 = [6,9.78,3+2j]
# op = (3+2j,6,'6','7')

#append- to add element at last
list9 = ["Aryan"]
list9.append("Langhanoja")
print(list9)

#insert - to add element at specific index

list9.insert(1,"Dilipbhai")
print(list9)

# extend used to add other data type(list or tuple)


list10 = ["Is Great"]
list9.extend(list10)
print(list9)

