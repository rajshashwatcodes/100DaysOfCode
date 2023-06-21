import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

# Create the matrix M
M = np.matrix([[86, 137.8],
                [43, 69],
                [61, 97.8],
                [43, 69],
                [67, 107._pl4],
                [8, 13],
                [51, 81.8],
                [100, 160.2],
                [19, 30.6],
                [78, 125]])

# Define the function hypo(t0,t1, X)
def hypo(t0, t1, X):
  return t0 + t1 * X

# Plot a graph with M1 on x-axis and Yp on y-axis
plt.plot(M[:, 0], hypo(0, 0.1, M[:, 0]))
plt.xlabel('M1')
plt.ylabel('Yp')
plt.show()
