#Created by Shashwat Raj
#Program to find out factorial
num=int(input("Enter a number: "))
print("Factor: ",end='')
for i in range(1,num):
    if num % i == 0:
        print(i,end='  ')
