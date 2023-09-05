def merge_three_sorted_arrays(arr1, arr2, arr3):
    result = []
    i = j = k = 0

    while i < len(arr1) and j < len(arr2) and k < len(arr3):
        min_val = min(arr1[i], arr2[j], arr3[k])
        result.append(min_val)

        if min_val == arr1[i]:
            i += 1
        elif min_val == arr2[j]:
            j += 1
        else:
            k += 1

    # Append any remaining elements from the three arrays
    while i < len(arr1):
        result.append(arr1[i])
        i += 1
    while j < len(arr2):
        result.append(arr2[j])
        j += 1
    while k < len(arr3):
        result.append(arr3[k])
        k += 1

    return result

# Test the function
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]
arr3 = [0, 9, 10, 11]

merged_array = merge_three_sorted_arrays(arr1, arr2, arr3)
print(merged_array)
