'''
Question:
Write a program which can compute the factorial of a given numbers.
Suppose the following input is supplied to the program:
8
Then, the output should be:
40320
'''

#Solved by Shashwat Raj

n=int(input())
f=1
for i in range(1,n+1):
    f=f*i
print(f)
