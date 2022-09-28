#Created by Shashwat Raj
#Program to generate dice rolling concept
import random
con=True
while con:
    input("Press any key to role the dice: ")
    n = random.randint(1,6)
    if n == 6:
        con=True
    else:
        con=False
    print(n)
