# File not found

# Try statement must have at least one except or finally clause or else it will show an error

try:
    file = open("file_name.txt")
    dictionary_name = {"key" : "value"}
    print(dictionary_name["fghfgh"])

# # If any specific error is not mention with except statement the code will not show any error

# except:
#     file = open("file_name.txt" , "w")
#     file.write("Something")

except FileNotFoundError:
    file = open("file_name.txt" , "w")
    file.write("Something")

# More than one except statement can be used
# To catch hold where the error lies we can refer the error as something, here --> "as error_message"
except KeyError as error_message:
    print(f"The key {error_message} does not exist")

# else statement is used when we try something and no error or exception is found then it directly jumps to else statement
# what else is to be done next

else:
    content = file.read()
    print(content)

# since there are exceptions in the try statement the code did not jump to the else statement
