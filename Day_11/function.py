# defining function 1
def func_1(a):
    return a * a

# defining function 2
def func_2(a):
    # calling function 1
    return func_1(a) * func_1(a)

# printing function 2
print(func_2(2))
