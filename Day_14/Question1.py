'''
Question:
Write a program, which will find all such numbers between 1000 and 3000 (both included) such that each digit of the number is an even number.
The numbers obtained should be printed in a comma-separated sequence on a single line.
'''

#Solved ny Shashwat Raj

Value=[]
for i in range(1000,3000+1):
    st=str(i)
    if (int(st[0]) % 2 == 0) and (int(st[1]) % 2 == 0) and (int(st[2]) % 2 == 0) and (int(st[3]) % 2 == 0) :
        Value.append(i)
print (",".join(Value))
