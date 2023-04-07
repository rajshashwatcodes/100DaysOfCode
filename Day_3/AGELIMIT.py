# cook your dish here

T = int(input())

X , Y , A = map(int, input().split())

for i in range(T):
    if A >= X and A < Y:
        print("YES")
        
    else:
        print("NO")
