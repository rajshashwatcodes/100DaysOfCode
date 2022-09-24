# Solved by Shashwat Raj
"""
Write a program which will find all such numbers which are divisible by 3 and 5 but are not a multiple of 7,
between 7700 and 15899 (both included).
The numbers obtained should be printed in a comma-separated sequence on a single line.
"""

n=[]
u=7700
v=15900
for i in range(u , v):
    if i % 3 == 0 and i % 5 == 0 and i % 7 != 0 :
        n.append(str(i))
print (','.join(n))
