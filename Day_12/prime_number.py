#Created by Shashwat Raj
#Program to check prime no
flag=1
num=int(input("Enter a number: "))
for i in range(2,num):
    if num % i == 0:
        flag=0
        break
if flag != 0:
    print ("Prime No")
else:
    print("Not a Prime No.")
