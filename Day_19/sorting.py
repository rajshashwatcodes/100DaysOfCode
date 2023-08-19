def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# defining an array
array = [5, 2, 8, 12, 1, 6]
bubble_sort(array)
print(array) 
