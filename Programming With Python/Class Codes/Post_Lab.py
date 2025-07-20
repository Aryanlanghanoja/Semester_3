import math

#1

list1 = ["ICT","Department","ICT Deparment"]
max = len(list1[0]) 
for i in range(0,len(list1)) :
    if(len(list1[i]) > max) :
        max = i
    
print(f"The Longest Word In A List Is {list1[max]}")

#2

l2 = [25,36]
sum = 0
for i in range(0,len(l2)) :
    sum = sum + (l2[i]%10)
    
print(f"The Sum Of All The Unit Digits Is {sum}")

#3

max = 0
def max(a,b,c) :
    if(a>b) :
        if(a>c) :
            max = a 
        else :
            max = c
    else :
        if(b>c) :
            max = b 
        else :
            max = c 
     
    return max    

ans = max(345,567,434) 

print(f"The Maximum Is {ans}")   

#4

def Sum(list1) :
    sum = 0
    for i in range(0,len(list1)) :
        sum = sum + list1[i] 
    
    return sum

list2 = [12,23,34,45,56,67,78,89]
listsum = sum(list2)
print(f"The Sum Of All Element In {list2} Is {listsum}")

# 5

def Mul(list1) :
    mul = 1
    for i in range(0,len(list1)) :
        mul = mul * list1[i] 
    
    return mul

list3 = [98,87,76,65,54,43,32,21]
listmul = Mul(list3)
print(f"The Sum Of All Element In {list3} Is {listmul}")

#6

string = input("Enter A String :- ")
print(string[::-1])

#7

def fact(num) :
    ans = 1 
    
    for i in range(1,num+1) :
        ans = ans * i
    
    return ans

num = int(input("Enter A Number :- "))
ans = fact(num) 

if(num>=0) :
    print(f"The Factorial Of {num} Is {ans}") 
else :
    print("Enter The Non-negative Integer")

#8

list2 = [1,4,5,6,7,9,14,17,20]
listmis = [] 

for i in range(1,len(list2)) :
    for j in range(list2[i-1]+1,list2[i]) :
        listmis.append(j)
        
print(listmis)

#9

list1 = []

print("Enter 0 to Exit:- ")
print("Enter Arithmetic Progression :-")
while(True) :
    num = int(input())
    if(num == 0) :
        break
    list1.append(num)
    
def check(num,ref) :
    if(num == ref) :
        return True
    else :
        return False
    
power = math.log(list1[2],3)  
anslist = []
for i in range(1,len(list1)) :
    anslist.append(check(math.log(list1[i],i+1),power))
j=0
for i in anslist :
    if(not i) :
        j+=1
        break
    else :
        continue    

if(j == 0) :
    print("True")
else :
    print("False")

# 10

def isPalindrome(num) :
    s = str(num)
    for i in range(0,len(s)) :
        if(s[i] != s[len(s)-i-1]) :
            return False 
        else :
            continue
    return True
    
def isprime(num) :
    prime = True
    for i in range(1,num) :
        if (num % i == 0) :
            prime = False
            break
    return(prime) 

inlist = [121,132,454,111,147]
palindrome = []
prime = []

for i in inlist :
    palindrome.append(isPalindrome(i))
    
    if(isPalindrome(i)) :
        prime.append(isprime(i))
    else :
        prime.append(0)
    
print(palindrome)
print(prime)

#11

def revnum(list) :
    revnumlist = []
    for i in list :
        s = str(i)
        list = list[1:]
        rev = s[::-1]
        revnumlist.append(int(rev))
    
    return revnumlist
        
list = [2334,4885,7776,8969]
ans = revnum(list)
print(ans)

# 12

def func(list) :
    ans = 1 
    for i in list :
        ans = ans * i%10 
    return ans 

inputlist = [12,23]
ans = func(inputlist)
print(ans)

# 13

inputlist = [1,3,4,10,4,1,43]
for i in range(0,len(inputlist)) :
    for j in range(i + 1,len(inputlist)-1) :
        if(inputlist[i] == inputlist[j]) :
            del inputlist[j]
print(inputlist)


# 14

list2 = [1,2,3,4,5,6]
sum = 0

for i in range(0,len(list2)) :
    if(i%2 != 0 and list2[i]%2==0) :
        sum = sum + list2[i]
        
print(sum)
        
        
   


        
    

