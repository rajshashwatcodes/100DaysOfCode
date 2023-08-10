def search_word(input_str, word):
    if word in input_str:
        return f"{word} exists in string"
    else:
        return f"{word} does not exist in string"

input_string = input("Enter a String: ")
search_word_input = input("Enter a word to search: ")

result = search_word(input_string, search_word_input)
print(result)
