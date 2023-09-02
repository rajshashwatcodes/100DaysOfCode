my_list = []

my_list.append(2)


print("Original List:", my_list)

my_list.insert(1, 4)

print("After insert(1, 4):", my_list)

my_list.remove(2)

print("After remove(2):", my_list)

popped_element = my_list.pop(4)

print(f"Popped element: {popped_element}")
print("After pop(0):", my_list)

my_list.clear()

print("After clear():", my_list)
