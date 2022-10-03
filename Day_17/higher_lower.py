

import random
from day14_art import logo
from day14_art import vs
from day14_game_data import data
print(logo)

print("Guess Who Has More Followers!!!")


score = 0

wants_exit = False
while not wants_exit:

    A = random.choice(data) 
    
    name_a = A["name"]
    description_a = A["description"]
    country_a = A["country"]
    followers_A = A["follower_count"]

    B = random.choice(data)

    name_b = B["name"]
    description_b = B["description"]
    country_b = B["country"]
    followers_B = B["follower_count"]

    print(f"A =\nname: {name_a}\ndescription = {description_a}\ncountry = {country_a}")
    # print(A)

    print(vs)

    print(f"B =\nname: {name_b}\ndescription = {description_b}\ncountry = {country_b}")
    # print(B)
    chosen_option = input('which option do you choose "A" or "B"? ').upper()

    if chosen_option == "A":
        print(f"{name_a} has {followers_A} number of followers.\n{name_b} has {followers_B} number of followers.")
        if followers_A > followers_B:
            print("You chose a correct option! You Win!")
            # print(f"{name_a} has {followers_A} number of followers.\n{name_b} has {followers_B} number of followers.")
            score += 1
            print(f"Score = {score}")
        else:
            print("It's a wrong option!")
            # print(f"{name_a} has {followers_A} number of followers.\n{name_b} has {followers_B} number of followers.")

    if chosen_option == "B":
        print(f"{name_b} has {followers_B} number of followers.\n{name_a} has {followers_A} number of followers.")
        if followers_B > followers_A:
            print("You chose a correct option! You Win!")
            # print(f"{name_b} has {followers_B} number of followers.\n{name_a} has {followers_A} number of followers.")
            score += 1
            print(f"Score = {score}")
        else:
            print("It's a wrong option!")
            # print(f"{name_b} has {followers_B} number of followers.\n{name_a} has {followers_A} number of followers.")

    wants_continue = input("To continue playing type 'yes' and to exit type 'no': ").lower()

    if wants_continue == "yes":
        wants_exit = False

    else:
        print("The game ends here!")
        wants_exit = True
        # break
        
# wants_exit = False       
