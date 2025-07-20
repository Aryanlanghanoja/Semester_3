# assigning the same value to a different variable at a time

x = y = z = 99 
print(x,y,z)
print(x)
print(y)
print(z)

# assiging the different valueto a different variablr at a time
a,b,c = 5,6,7
print(a,b,c)
print(a)
print(b)
print(c)

# adding two numbers
X = 10
Y = 20
print(X+Y)

#concadinating two strings
P = "Hello"
Q = "World"
print(P + " " + Q)

# printing the string in different ays using indexing
R = P + " " +  Q
print(R[:5])
print(R[::-1])

# implemet different operators on strings
H = "Aryan Langhanoja"
print(H[2:5])
print(H[:5])
print(H[2:])
print(H[::-1])
print(H[-1::])
print(H[::1])
print(H[1::])
print(H[::2])
print(H[-5:-2])
print('A' in H)
print('M' in H)
print(H*2)

T = "Aryan Langhanoja"
Q = "Aryan Patel"

print(T == Q)

print('A' in T)
print('A' not in Q)

# printing strings on appopriate place
name = "Aryan" 
age = 19 
marks = 20.39

string1 = 'Hey %s' % (name)
string2 = 'My Age Is %d' % (age)
string3 = 'Hello , My Name Is %s , My Age Is %d , And My Mark Is %f' %(name,age,marks)

print(string1)
print(string2)
print(string3)

# # Task - 1 

T = "Aryan Langhanoja"
Q = "Aryan Patel"

print(T == Q)

# Task - 2 

Result = "I Am " + T + " Also Known As " + Q
print(Result)

Result = 'I Am %s Also Known As %s' % (T,Q)
print(Result)

# Task Ends


# implementing string methods
x = "Aryan Langhanoja"
count = x.count('a')
title = x.title()
lower = x.lower()
upper = x.upper()

print(count)
print(title)
print(lower)
print(upper)