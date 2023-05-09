# create an empty list
my_list = []

# append items to the list
my_list.append(11)
my_list.append(12)
my_list.append(13)
my_list.append(14)
my_list.append(15)

# print the list
print("my list:" , my_list)

# extend the list
my_list.extend([16, 17, 18, 19, 25])

# print the list
print("my list after extension:" , my_list)

# delete the last item
del my_list[-1]

# append a new item
my_list.append(20)

# print the list
print("my list after deleting and adding another item:" , my_list)

