def mergeSortedArrays(arr1, arr2):
    merged = []
    i = j = 0

    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            merged.append(arr1[i])
            i += 1
        else:
            merged.append(arr2[j])
            j += 1

    # Append remaining elements from arr1 (if any)
    while i < len(arr1):
        merged.append(arr1[i])
        i += 1

    # Append remaining elements from arr2 (if any)
    while j < len(arr2):
        merged.append(arr2[j])
        j += 1

    return merged
