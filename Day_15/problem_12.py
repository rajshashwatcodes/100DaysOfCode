#Solved By Shashwat Raj
#Project Euler Problem 12
import math
j = 1
y = True
n = 0
while y:
    n=n+j
    c = 0
    i = 1
    while i <= math.sqrt(n): 
        if (n % i == 0) : 
            if (n / i == i) : 
                c+=1
            else :
                c+=2
        i = i + 1
    j=j+1
    if c >= 500:
        print(n)
        y=False
