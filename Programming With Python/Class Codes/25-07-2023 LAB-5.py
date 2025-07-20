# # # List Can be a elemnt of tuple and vicecersa also
# # # Tuple inside Tuple ans List Inside List is also possible

# # tuple1 = (2,'ABC',3+4j,[1,6.78,True],False)
# # tuple2 = (1,'def',[1,6.78,True],False)

# # print(tuple1 + tuple2)
# # print(tuple1[3] + tuple2[2])

# # list1 = [1,3.45,True,5+6j,1]
# # list1.remove(1)
# # list1.clear()
# # print(list1)

# # list2 = [1,2,3,'Aryan',True,3+5j,1,False]
# # print(list2.count(0))
# # # list3 = [1,2,(1,2),(1,2)]
# # # print(list3.count((1,2)))
# # list2.reverse()
# # print(list2)

# # list4 = [5,4,1,2,4]
# # list4.sort(reverse=True)
# # print(list4)
# # list4.sort()
# # print(list4)


# # Task-1

# tuple3 = (5,20,3,7,6,8)
# list3 = list(tuple3)
# list3.sort()
# anslist = [list3[0] , list3[len(list3)-1]]
# anstuple = tuple(anslist)
# print(anstuple)

# # Task - 2

# inputtuple = (2,4,5,6,2,3,4,4,7)
# inputlist = list(inputtuple)
# inputlist.sort()
# print(inputlist)

# freqlist = [inputlist.count(inputlist[0]),inputlist.count(inputlist[1]),inputlist.count(inputlist[2]),inputlist.count(inputlist[3]),inputlist.count(inputlist[4]),inputlist.count(inputlist[5]),inputlist.count(inputlist[6]),inputlist.count(inputlist[7]),inputlist.count(inputlist[8])]
# freqlist.sort()
# print(freqlist[len(freqlist) - 1])

# Dictionary

D1 = {'Mango' : 150 , 'Grapes' : 250}
print(D1)
print(D1.get('Mango'))
print(D1.keys()) 
print(D1.values())
print(D1.items())

# Set
# Allows Different Data types and it not have index it is unordred and allows only unique Members.

# set1 = {1,7,8,9,7,6,5,3,4,1,1,9,7,6}
# set1.add(0)
# print(set1)
    
    
    

    
 



