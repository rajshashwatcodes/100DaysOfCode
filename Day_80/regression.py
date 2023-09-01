# Import necessary libraries
import numpy as np
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

# Generate synthetic data
np.random.seed(0)
X = 2 * np.random.rand(100, 1)  # Generate 100 random values between 0 and 2
y = 4 + 3 * X + np.random.randn(100, 1)  # Linear relationship with some noise

# Create a Linear Regression model
model = LinearRegression()

# Fit the model to the data
model.fit(X, y)

# Predictions
X_new = np.array([[0], [2]])  # New data points to make predictions
y_pred = model.predict(X_new)

# Plot the data and regression line
plt.scatter(X, y, label='Data Points')
plt.plot(X_new, y_pred, 'r-', label='Regression Line')
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.legend()
plt.show()

# Output the model parameters
print(f'Intercept (theta0): {model.intercept_}')
print(f'Coefficient (theta1): {model.coef_}')
