# BMI = Body Mass Index - calculates the body weight as per the height- whether the person is under/overweighed or has right weight

weight = float(input("Enter your weight in kg: "))
height = float(input("Enter your height in m: "))

BMI = weight / height ** 2
if BMI < 18.5:
    print(f"Your BMI is {BMI}, you are underweight.")
elif BMI < 25:
    print(f"Your BMI is {BMI}, you have a normal weight.")
elif BMI < 30:
    print(f"Your BMI is {BMI}, you are slightly overweight.")
elif BMI < 35:
    print(f"Your BMI is {BMI}, you are an obese.")
else:
    print(f"Your BMI is {BMI}, you are clinically obese.")
    
