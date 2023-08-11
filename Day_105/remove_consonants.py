def remove_consonants(input_str):
    vowels = "aeiouAEIOU"
    result = ""
    for char in input_str:
        if char in vowels or char.isspace():
            result += char
    return result

input_string = "Hello, hai have a good day for you"
new_string = remove_consonants(input_string)
print(new_string)
