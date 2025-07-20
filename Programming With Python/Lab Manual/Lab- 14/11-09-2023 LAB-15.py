'''
from matplotlib import pyplot as plt
plt.plot([1,2,3],[4,5,1])
plt.show()
'''
'''
from matplotlib import pyplot as plt
 
x = [5,2,7]
y = [2,16,4]
plt.plot(x,y)
plt.title('Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')
plt.show()
'''
'''
from matplotlib import pyplot as plt
from matplotlib import style
 
style.use('ggplot')
x = [5,8,10]
y = [12,16,6]
x2 = [6,9,11]
y2 = [6,15,7]
plt.plot(x,y,'g',label='line one', linewidth=5)
plt.plot(x2,y2,'c',label='line two',linewidth=5)
plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')
plt.legend()
plt.grid(True,color='k')
plt.show()
'''

# GeeksforGeeks
# How to Add Title to Subplots in Matplotlib?
# (Using set_title() method)
# import numpy as np
# import matplotlib.pyplot as plt

# x = np.array([1, 2, 3, 4, 5])

# fig, ax = plt.subplots(2, 2)

# ax[0, 0].plot(x, x)
# ax[0, 1].plot(x, x*2)
# ax[1, 0].plot(x, x*x)
# ax[1, 1].plot(x, x*x*x)

# ax[0, 0].set_title("Linear")
# ax[0, 1].set_title("Double")
# ax[1, 0].set_title("Square")
# ax[1, 1].set_title("Cube")

# fig.tight_layout()
# plt.show()

# # (Using title.set_text() method)
# import numpy as np
# import matplotlib.pyplot as plt

# x=np.array([1, 2, 3, 4, 5])
# fig, ax = plt.subplots(2, 2)

# ax[0, 0].plot(x, x)
# ax[0, 1].plot(x, x*2)
# ax[1, 0].plot(x, x*x)
# ax[1, 1].plot(x, x*x*x)

# ax[0, 0].title.set_text("Linear")
# ax[0, 1].title.set_text("Double")
# ax[1, 0].title.set_text("Square")
# ax[1, 1].title.set_text("Cube")

# fig.tight_layout()
# plt.show()

# # (Using plt.gca().set_title() method)

# import numpy as np
# import matplotlib.pyplot as plt

# x=np.array([1, 2, 3, 4, 5])
# fig, ax = plt.subplots(2, 2)

# title = ["Linear", "Double", "Square", "Cube"]
# y = [x, x*2, x*x, x*x*x]

# for i in range(4):
# 	plt.subplot(2, 2, i+1)
# 	plt.plot(x, y[i])
# 	plt.gca().set_title(title[i])
# fig.tight_layout()
# plt.show()

# # (Using plt.gca().title.set_text() method)

# import numpy as np
# import matplotlib.pyplot as plt

# x=np.array([1, 2, 3, 4, 5])
# fig, ax = plt.subplots(2, 2)
# title = ["Linear","Double","Square","Cube"]
# y = [x, x*2, x*x, x*x*x]

# for i in range(4):
# 	plt.subplot(2, 2, i+1)
# 	plt.plot(x, y[i])
# 	plt.gca().title.set_text(title[i])
# fig.tight_layout()
# plt.show()

# # Setting a Single Title for All the Subplots
# # Example - 1
# import matplotlib.pyplot as plt
# import numpy as np

# fig, ax = plt.subplots(2, 2)

# ax[0][0].plot(np.random.randint(0, 5, 5), np.random.randint(0, 5, 5))
# ax[0][1].plot(np.random.randint(0, 5, 5), np.random.randint(0, 5, 5))
# ax[1][0].plot(np.random.randint(0, 5, 5), np.random.randint(0, 5, 5))
# ax[1][1].plot(np.random.randint(0, 5, 5), np.random.randint(0, 5, 5))
# fig.suptitle(' Set a Single Main Title for All the Subplots ', fontsize=30)
# plt.show()

# # Example - 2

# import matplotlib.pyplot as plt
# fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(12, 5))
# x1 = [1, 2, 3, 4, 5, 6]
# y1 = [45, 34, 30, 45, 50, 38]
# y2 = [36, 28, 30, 40, 38, 48]
# labels = ["student 1", "student 2"]
# fig.suptitle(' Student marks in different subjects ', fontsize=30)
# l1 = ax1.plot(x1, y1 , color = 'g')
# l2 = ax2.plot(x1, y2 , color = 'b') 
# fig.legend([l1, l2], labels=labels,
# 		loc="upper right")
# plt.subplots_adjust(right=0.9)
# plt.show()

# # How to Turn Off the Axes for Subplots in Matplotlib?

# # Using matplotlib.axes.Axes.axis()

# import matplotlib.pyplot as plt
# import matplotlib.tri as mtri
# import numpy as np
	
# x = np.asarray([0, 1, 2, 3, 0.5,
# 				1.5, 2.5, 1, 2,
# 				1.5])

# y = np.asarray([0, 0, 0, 0, 1.0,
# 				1.0, 1.0, 2, 2,
# 				3.0])

# triangles = [[0, 1, 4], [1, 5, 4],
# 			[2, 6, 5], [4, 5, 7],
# 			[5, 6, 8], [5, 8, 7],
# 			[7, 8, 9], [1, 2, 5],
# 			[2, 3, 6]]

# triang = mtri.Triangulation(x, y, triangles)
# z = np.cos(1.5 * x) * np.cos(1.5 * y)
# fig, axs = plt.subplots()
# axs.tricontourf(triang, z)
# axs.triplot(triang, 'go-', color ='white')
# axs.set_axis_off()
# axs.set_title('Triangle illustration')
# plt.show()

# # Using matplotlib.axes.Axes.set_axis_off()
# import matplotlib.pyplot as plt
# import numpy as np
# geeksx = np.array([24.40, 110.25, 20.05,
# 				22.00, 61.90, 7.80,
# 				15.00])
# geeksy = np.array([24.40, 110.25, 20.05,
# 				22.00, 61.90, 7.80,
# 				15.00])
# fig, ax = plt.subplots()
# ax.xcorr(geeksx, geeksy, maxlags = 6,
# 		color ="green")
# ax.set_axis_off()
# ax.set_title('Time series graph')
# plt.show()


# # Using matplotlib.pyplot.axis()
# import matplotlib.pyplot as plt

# x = [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5]
# y = []

# for i in range(len(x)):
# 	y.append(max(0, x[i]))
# ax = plt.plot(x, y, color='green')
# plt.axis('off')
# plt.title("ReLU function graph")
# plt.show()

# # How to Create Different Subplot Sizes in Matplotlib?
# # Create Different Subplot Sizes in Matplotlib using Gridspec

# import matplotlib.pyplot as plt
# from matplotlib import gridspec
# import numpy as np
# fig = plt.figure()
# fig.set_figheight(8)
# fig.set_figwidth(8)
# spec = gridspec.GridSpec(ncols=2, nrows=2,
# 						width_ratios=[2, 1], wspace=0.5,
# 						hspace=0.5, height_ratios=[1, 2])
# x = np.arange(0, 10, 0.1)
# y = np.cos(x)
# ax0 = fig.add_subplot(spec[0])
# ax0.plot(x, y)
# ax1 = fig.add_subplot(spec[1])
# ax1.plot(x, y)
# ax2 = fig.add_subplot(spec[2])
# ax2.plot(x, y)
# ax3 = fig.add_subplot(spec[3])
# ax3.plot(x, y)
# plt.show()


# # Create Different Subplot Sizes in Matplotlib gridspec_kw

# import matplotlib.pyplot as plt
# import numpy as np

# fig, ax = plt.subplots(nrows=2, ncols=2, figsize=(7, 7),
# 					gridspec_kw={
# 						'width_ratios': [3, 3],
# 						'height_ratios': [3, 3],
# 					'wspace': 0.4,
# 					'hspace': 0.4})
# x = np.arange(0, 10, 0.1)
# y = np.tan(x)
# ax[0][0].plot(x, y)
# ax[0][1].plot(x, y)
# ax[1][0].plot(x, y)
# ax[1][1].plot(x, y)
# plt.show()


# # Create Different Subplot Sizes in Matplotlib subplot2grid

# import matplotlib.pyplot as plt
# import numpy as np

# fig = plt.figure()
# fig.set_figheight(6)
# fig.set_figwidth(6)

# ax1 = plt.subplot2grid(shape=(3, 3), loc=(0, 0), colspan=3)
# ax2 = plt.subplot2grid(shape=(3, 3), loc=(1, 0), colspan=1)
# ax3 = plt.subplot2grid(shape=(3, 3), loc=(1, 2), rowspan=2)
# ax4 = plt.subplot2grid((3, 3), (2, 0))
# ax5 = plt.subplot2grid((3, 3), (2, 1), colspan=1)

# x = np.arange(0, 10, 0.1)
# y = np.cos(x)

# ax1.plot(x, y)
# ax1.set_title('ax1')
# ax2.plot(x, y)
# ax2.set_title('ax2')
# ax3.plot(x, y)
# ax3.set_title('ax3')
# ax4.plot(x, y)
# ax4.set_title('ax4')
# ax5.plot(x, y)
# ax5.set_title('ax5')
# plt.tight_layout()
# plt.show()


# # How to set the spacing between subplots in Matplotlib in Python?
# # Using tight_layout() method to set the spacing between subplots

# import numpy as np
# import matplotlib.pyplot as plt
# x=np.array([1, 2, 3, 4, 5])
# fig, ax = plt.subplots(2, 2)
# ax[0, 0].plot(x, x)
# ax[0, 1].plot(x, x*2)
# ax[1, 0].plot(x, x*x)
# ax[1, 1].plot(x, x*x*x)
# fig.tight_layout()
# plt.show()

# # Using pad

import numpy as np
import matplotlib.pyplot as plt
x=np.array([1, 2, 3, 4, 5])
fig, ax = plt.subplots(2, 2)
ax[0, 0].plot(x, x)
ax[0, 1].plot(x, x*2)
ax[1, 0].plot(x, x*x)
ax[1, 1].plot(x, x*x*x)
fig.tight_layout(pad=5.0)
plt.show()

