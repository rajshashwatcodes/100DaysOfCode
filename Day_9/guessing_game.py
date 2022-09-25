#Created by Shashwat Raj
#Program to guess a number
import random
n = random.randint(1,10)
while True:
    try:
        g = int(input('Guess: '))
        if not 10 >= g > 0:
            print('It\'s in between 0 and 10')
    except ValueError:
        print('Enter an integer')
        continue
    if g == n:
        print('CONGRATULATION')
        break
    elif g < n:
        print('Greater')
    else:
        print('Smaller')
