def insert_element(arr, position, element):
    arr.insert(position, element)

def delete_element(arr, position):
    if 0 <= position < len(arr):
        del arr[position]

# defining an array
array = [1, 2, 3, 4, 5]
insert_element(array, 2, 10)
print(array)  

# defining an array
array = [1, 2, 3, 4, 5]
delete_element(array, 2)
print(array)  

