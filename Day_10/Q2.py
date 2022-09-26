
'''
Question:
Write a program that accepts a sequence of whitespace separated words as input and prints the words after removing all duplicate words and sorting them alphabetically.
Suppose the following input is supplied to the program:
hello world and practice makes perfect and hello world again
Then, the output should be:
again and hello makes perfect practice world
'''

#Solved by Shashwat Raj

Words={x for x in (input().split())}
words=list(Words)
words.sort()
print (",".join(words))
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
