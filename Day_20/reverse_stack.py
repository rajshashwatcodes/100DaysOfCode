def reverse_string(input_str):
    # Create an empty list to represent the stack
    stack = []  
    for char in input_str:
        stack.append(char)
    
    reversed_str = ""
    while stack:
        reversed_str += stack.pop()
    
    return reversed_str

# taking input from the user
input_string = input("Enter a string: ")
reversed_result = reverse_string(input_string)
# print the reversed string
print(reversed_result)  
