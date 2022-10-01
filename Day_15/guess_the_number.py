#Number Guessing Game Objectives:

# Include an ASCII art logo.
# Allow the player to submit a guess for a number between 1 and 100.
# Check user's guess against actual answer. Print "Too high." or "Too low." depending on the user's answer. 
# If they got the answer correct, show the actual answer to the player.
# Track the number of turns remaining.
# If they run out of turns, provide feedback to the player. 
# Include two different difficulty levels (e.g., 10 guesses in easy mode, only 5 guesses in hard mode).


import random 
from day12_1_art import Logo
print(Logo)

print('Welcome to game "Guess The Number!"')

random_number = random.randint(1, 100)

level = input('Choose a level "easy" or "hard": ').lower()
if level == "easy":
    chances = 9
    print("You have 10 chances to guess the number.")
else:
    chances = 4
    print("You have 5 chances.")

# print(random_number)

for chance in range(chances, -1 , -1):
    guess = int(input("Guess a number between 1 to 100: "))

    if guess == random_number:
        print(f"You Win! The correct number is {random_number}!")
        break

    if guess > random_number:
        print("Too high!")
        print(f"You have {chance} chances left.")

    if guess < random_number:
        print("Too low!")
        print(f"You have {chance} chances left.")

    if chance == 0:
        print("You lose! You lost all chances!")
        print(f"The correct number is {random_number} ")
