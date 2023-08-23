def count_characters(input_str):
    lower_count = 0
    upper_count = 0
    numeric_count = 0
    special_count = 0

    for char in input_str:
        if char.islower():
            lower_count += 1
        elif char.isupper():
            upper_count += 1
        elif char.isnumeric():
            numeric_count += 1
        else:
            special_count += 1

    return lower_count, upper_count, numeric_count, special_count

input_string = input("Enter a string: ") 
lower, upper, numeric, special = count_characters(input_string)

print(f"Lowercase counts: {lower}")
print(f"Uppercase counts: {upper}")
print(f"Numeric counts: {numeric}")
print(f"Special counts: {special}")
