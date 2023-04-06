# input three numbers and print the largest number

T=int(input())  # number of test cases
for i in range(T):
    A,B,C=map(int,input().split())
    if A>B and A>C:
        print(A)
    elif B>A and B>C:
        print(B)
    else:
        print(C)

