# # Task - 1 :- Ploting a Sine Wave

# import numpy as np
# import matplotlib.pyplot as plt
# from scipy import signal as sg

# freq = 200000
# amp = 5
# t = np.linspace(0, 10, 1000)
# sig_sine = amp*np.sin(2*np.pi*freq*t)
# plt.figure(figsize=(10, 8))
# plt.title('Sine Wave', fontsize=20)
# plt.plot(t, sig_sine, linewidth=3, label='x(t) = sin(wt)')
# plt.xlabel('time', fontsize=15, )
# plt.ylabel('Amplitude', fontsize=15)
# plt.legend(loc="upper right")
# plt.grid()
# plt.show()


# # Task - 2 :- Ploting a Square Wave

# import numpy as np
# import matplotlib.pyplot as plt
# from scipy import signal as sg

# freq = 2
# amp = 5
# t = np.linspace(0, 2, 1000)
# sig_square = amp*sg.square(2*np.pi*freq*t, duty=0.5)
# plt.figure(figsize=(10, 8))
# plt.title('Square Wave', fontsize=20)
# plt.plot(t, sig_square, linewidth=3, label='x(t) = Square Wave')
# plt.xlabel('time', fontsize=15, )
# plt.ylabel('Amplitude', fontsize=15)
# plt.legend(loc="upper right")
# plt.grid()
# plt.show()

# # Task - 3 :- Ploting a Triangle Wave

# import numpy as np
# import matplotlib.pyplot as plt
# from scipy import signal as sg

# freq = 2
# amp = 5
# t = np.linspace(0, 2, 1000)
# sig_triangle = amp*sg.sawtooth(2*np.pi*freq*t, width=0.5)
# plt.figure(figsize=(10, 4))
# plt.title('Triangle Wave', fontsize=20)
# plt.plot(t, sig_triangle, linewidth=3, label='x(t) = Tri(wt)')
# plt.xlabel('time', fontsize=15, )
# plt.ylabel('Amplitude', fontsize=15)
# plt.legend(loc="upper right")
# plt.grid()
# plt.show()

# # Task - 4 :- Ploting a Sinc Functions

# import numpy as np
# import matplotlib.pyplot as plt
# from scipy import signal as sg

# freq = 200000
# amp = 5
# t = np.linspace(-10, 10, 1000)
# sig_sine = amp*np.sinc(t)
# plt.figure(figsize=(10, 8))
# plt.title('Sine Wave', fontsize=20)
# plt.plot(t, sig_sine, linewidth=3, label='x(t) = sin(wt)')
# plt.xlabel('time', fontsize=15, )
# plt.ylabel('Amplitude', fontsize=15)
# plt.legend(loc="upper right")
# plt.grid()
# plt.show()

# # Without Functions

# freq = 200
# amp = 5
# t = np.linspace(-10, 10, 1000)
# sig_sine = np.sin(2*np.pi*freq*t) / (2*np.pi*freq*t)
# plt.figure(figsize=(10, 8))
# plt.title('Sine Wave', fontsize=20)
# plt.plot(t, sig_sine, linewidth=3, label='x(t) = sin(wt)')
# plt.xlabel('time', fontsize=15)
# plt.ylabel('Amplitude', fontsize=15)
# plt.legend(loc="upper right")
# plt.grid()
# plt.show()

# # Task - 5 :- Plot Standard Signals

# import numpy as np
# import matplotlib.pyplot as plt
# from scipy import signal as sg


# def p(t):
#     '''Basic Rectangular Pulse'''
#     return 1 * (abs(t) < 0.5)


# def pt(t):
#     """Basic Triangular Pulse"""
#     return (1 - abs(t)) * (abs(t) < t)


# def sgn(t):
#     """Sign Function"""
#     return 1 * (t >= 0) - 1 * (t < 0)


# def u(t):
#     """Unit Step Signal"""
#     return 1 * (t >= 0)


# functions = [p, pt, sgn, u]
# t = np.linspace(-2, 2, 1000)

# plt.figure()

# for i, function in enumerate(functions, start=1):
#     plt.subplot(2, 2, i)
#     plt.plot(t, function(t), '-b')
#     plt.ylim((-1.1, 1.1))
#     plt.title(function.__doc__)
# plt.tight_layout()
# plt.show()

import numpy as np
import matplotlib.pyplot as plt

# Create a range of discrete time values
n = np.arange(-10, 11)  # Values from -10 to 10

# Create a discrete-time ramp signal
ramp_signal = n

# Plot the discrete-time ramp signal
plt.stem(n, ramp_signal, use_line_collection=True)
plt.title('Discrete-Time Ramp Signal')
plt.xlabel('n (Time)')
plt.ylabel('Amplitude')
plt.grid(True)

plt.show()

