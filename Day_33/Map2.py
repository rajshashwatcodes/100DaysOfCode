def product(x):
    return x*x

n = (1, 2, 3, 4)
result = map(product, n)
print(list(result))

#OUTPUT

'''
[1, 4, 9, 16]
'''