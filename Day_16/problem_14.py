#Solved By Shashwat Raj
#Project Euler Problem 14
y=True
i=1
maxz=0
while i <= 1000000:
    i=i+1
    c=0
    y=True
    n=i
    while y:
        if n % 2 == 0:
            n=n/2
        else :
            n=3 * n + 1
        c=c+1
        if c > maxz:
            maxz=c
            x=i
        if n == 1:
            y=False
print("max: ",maxz)
print("max no: ",x)
