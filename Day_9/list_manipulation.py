#Created by Shashwat Raj
#Program for list manipulation
N=[int(x) for x in input().split()]
print(N[:5])

inpt = "1 2 3 4 5 6 7 8 9"
temp = inpt.split()
print(temp)

for x in temp:
    if int(x) <= 5:
        print(x)
        
for i in range(1,11,2):
    print(i)
