# Input array
arr = [64, 25, 12, 22, 11]

# Element to search for
element = 12

try:
    index = arr.index(element)
    print(f"{element} exists in the array at index {index}.")
except ValueError:
    print(f"{element} does not exist in the array.")
