
rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''
import random

user_choice = int(input("Which number do you want to choose? Type 0 for Rock, 1 for Paper , 2 for Scissors\n"))
if user_choice > 2 or user_choice < 0: 
  print("You typed an invalid number, you lose!")

image = [rock , paper, scissors]
print(image[user_choice])

computer_choice = random.randint(0,2)
print(computer_choice)

print(image[computer_choice])

if computer_choice == user_choice:
    print("It is a tie!")
elif computer_choice == 1 and user_choice == 0:
    print("Computer wins!")
elif computer_choice == 2 and user_choice == 1:
    print("Computer wins!")
elif computer_choice == 0 and user_choice == 2:
    print("Computer wins!")
else:
    print("User wins!")
