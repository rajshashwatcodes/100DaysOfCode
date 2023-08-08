def find_product(numbers):
    product = 1
    for num in numbers:
        product *= num
    return product

# call the function with the given list
real_numbers = [2.5, 3.7, 1.8, 4.2]
result = find_product(real_numbers)
print("Product of real numbers:", result)
