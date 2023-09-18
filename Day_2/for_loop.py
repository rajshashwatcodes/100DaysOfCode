# Define a list of numbers
numbers = [5, -3, 0, 10, -8, 2]

# Loop through each number in the list
for number in numbers:
    if number > 0:
        print(f"{number} is positive.")
    elif number < 0:
        print(f"{number} is negative.")
    else:
        print(f"{number} is zero.")
