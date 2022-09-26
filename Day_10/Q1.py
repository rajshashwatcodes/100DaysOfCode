'''
Question
Write a program that accepts sequence of lines as input and prints the lines after making all characters in the sentence capitalized.
Suppose the following input is supplied to the program:
Hello world
Practice makes perfect
Then, the output should be:
HELLO WORLD
PRACTICE MAKES PERFECT
'''

#Solved by Shashwat Raj

Line=[]
sentence=input()
while sentence:
    Line.append(sentence.upper())
    sentence=input()
print ("".join(Line))
