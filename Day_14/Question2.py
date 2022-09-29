'''
Write a program that accepts a sentence and calculate the number of letters and digits.
Suppose the following input is supplied to the program:
hello world! 123
Then, the output should be:
LETTERS 10
DIGITS 3
'''

#Solved by Shahswat Raj

String=input()
Count={"Letters":0, "Digits":0}
for i in String:
    if i.isalpha():
        Count["Letters"]+=1
    elif i.isdigit():
        Count["Digits"]+=1
print("LETTERS ",Count["Letters"])
print("DIGITS ",Count["Digits"])
