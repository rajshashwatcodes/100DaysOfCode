# Creating a list of squares
numbers = [1, 2, 3, 4, 5]
squares = [x ** 2 for x in numbers]
print(squares) 

# Creating a list of even numbers
even_numbers = [x for x in numbers if x % 2 == 0]
print(even_numbers)  

# Creating a list of strings with their lengths
words = ["apple", "banana", "cherry"]
word_lengths = [len(word) for word in words]
print(word_lengths) 

# Creating a list of uppercase letters from a string
text = "Hello, World!"
uppercase_letters = [char for char in text if char.isupper()]
print(uppercase_letters)  

# ]Creating a list of tuples
x_values = [1, 2, 3]
y_values = [10, 20, 30]
coordinates = [(x, y) for x in x_values for y in y_values]
print(coordinates)

