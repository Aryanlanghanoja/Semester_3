import numpy as np
import matplotlib.pyplot as plt
'''
# Plot Line
plt.plot([1,2,3], [1,2,3])
plt.plot([2,3,4], [4,5,6])

x = np.arange(10)
y = 2*x + 4 
plt.title("Line")
plt.xlabel("X Lable")
plt.ylabel("Y Lable")
plt.plot(x,y)
plt.figure(figsize=(300,200))


#Subplot

plt.subplot(1,2,1)
plt.plot([1,2,3], [3,2,1])
plt.title("First Plot")
plt.subplot(1,2,2)
plt.plot([2,4,6], [1,2,3],"r")
plt.title("Second Part")
plt.show()

# Bar Plot

plot = plt.figure()
chars = ['A' , 'B' , 'C']
values = [7,9,3]
plt.bar(chars,values)
plt.show()

# Histogram

x = [20,40,60,90,50,20,70,20,20,10,90]
nums = 4 
plt.hist(x, nums)

# Scatter Plot

list1 = [44,56,73,89,45,31]
list2 = [10,20,30,50,40,30]
fig = plt.figure()
plt.scatter(list1,list2, color = "y")
'''
#Sine Plot

wave = np.arange(0,2*np.pi,0.2)
g = np.sin(wave)
plt.title("Sine Wave")
plt.plot(wave,g,color = 'r')
plt.show()

g_sin = np.sin(wave)
g_cos = np.cos(wave)
plt.subplot(2,1,1)
plt.title("Sine Wave")
plt.plot(wave,g_sin, color = "Green")
plt.subplot(2,1,2)
plt.title("Cos Wave")
plt.plot(wave,g_cos,color = "red",linestyle = ":")