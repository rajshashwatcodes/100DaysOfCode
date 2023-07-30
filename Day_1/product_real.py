def product_of_real_numbers(numbers):
    result = 1

    for num in numbers:
        result *= num

    return result

# Example usage:
real_numbers_set = {1.5, 2.5, 3.0, 4.2, 5.1}
product = product_of_real_numbers(real_numbers_set)
print("Product of the real numbers:", product)
