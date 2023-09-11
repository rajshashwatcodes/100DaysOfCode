try:
    num1 = int(input("Enter a numerator: "))
    num2 = int(input("Enter a denominator: "))
    result = num1 / num2

except ZeroDivisionError:
    print("Error: Division by zero!")

except ValueError:
    print("Error: Invalid input. Please enter valid integers.")

else:
    print(f"Result of division: {result}")

finally:
    print("Execution completed.")

print("Program continues after exception handling.")
