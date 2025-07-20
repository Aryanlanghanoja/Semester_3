import plotly as plt
import plotly.graph_objs as G
import numpy as np

# Task - 1 :- Using Numpy Library generate random values to be passed as input to the graph.

num  = 100 
x = np.random.random(num)
y = np.random.random(num)

follow = G.Scatter(
    x = x ,
    y = y ,
    mode = 'markers'
    )

output1 = [follow]
#plt.offline.plot(output1,filename='Task-1.html',auto_open=True)

# Task - 2 :- Represent Data Using Combination of line 


N = 20 
X = np.linspace(0,1,N)
y0 = np.random.randn(N) - 10
y1 = np.random.randn(N)
y2 = np.random.randn(N) + 10

plot0 = G.Scatter(
    x = x,
    y = y0,
    mode = 'markers'
    )

plot1 = G.Scatter(
    x = x,
    y = y1 ,
    mode = 'lines + markers'
    )

plot2 = G.Scatter(
    x = x ,
    y = y2 ,
    mode = 'lines'
    )

output2 = [plot0,plot1,plot2]
#plt.offline.plot(output2,filename='Task-2.html',auto_open=True)

# Task - 3 :- Bubble Scatter Plot

import plotly.graph_objs as go
import plotly.offline as plt

img = go.Figure(data=go.Scatter(
    x=[10, 20, 30, 40],
    y=[5, 10, 15, 20],
    mode='markers',
    marker=dict(
        size=[10, 20, 30, 40],
        color=[1, 2, 3, 4]
    )
))

output3 = [img]
#plt.plot(output3, filename='Task-3.html', auto_open=True)

# Task - 4 :- Box Plot

a = np.random.rand(100)
b = np.random.rand(100) + 10

output4 = G.Figure()
output4.add_trace(G.Box(y = a))
output4.add_trace(G.Box(y = b))

plt.offline.plot(output4,filename='Task-4.html',auto_open=True)

# Task - 5 :- Histogram 

x5 = np.random.randn(100)
 
output5 = G.Figure(data = [G.Histogram()])
#plt.offline.plot(output5,filename='Task-5.html',auto_open=True)

# Final
'''
import numpy as np
import plotly.graph_objs as go
import plotly.offline as plt

# Create arrays 'a' and 'b'
a = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],dtype = np.float64)
b = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10] + 10 ,dtype = np.float64)

# Create the first figure
output1 = go.Figure()
output1.add_trace(go.Box(y=a))
output1.add_trace(go.Box(y=b))

# Create random data for the second figure
x = np.random.random_integers(0,20,10)

# Create the second figure
output2 = go.Figure(data=[go.Histogram(x=x)])

finalop = [output1,output2]

# Save each figure as a separate HTML file
plt.plot(finalop, filename="Figure1.html", auto_open=True)
#plt.plot(output2, filename="Figure2.html", auto_open=True)

'''