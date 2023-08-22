def swap_case(input_str):
    swapped_str = ""
    for char in input_str:
        if char.isupper():
            swapped_str += char.lower()
        else:
            swapped_str += char.upper()
    return swapped_str

input_string = "PyThOn PrOgRaMM"
result = swap_case(input_string)
print(result)
