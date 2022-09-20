num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

print("Number before swap")
print("First Number =", num1)
print("Second Number =", num2)

num1 = num1 + num2
num2 = num1 - num2
num1 = num1 - num2

print("Number after swap")
print("First Number =", num1)
print("Second Number =", num2)
