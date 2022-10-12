stack = []
 
stack.append(input("Enter 1st element: "))
stack.append(input("Enter 2nd element: "))
stack.append(input("Enter 3rd element: "))
 
print('Initial stack')
print(stack)
 
print('Elements popped from stack:')
print(stack.pop())
print(stack.pop())
print(stack.pop())
 
print('Stack after elements are popped:')
print(stack)