# X = min age , Y = max age , A = age of candidate

X , Y , A = map(int, input().split())

if A >= X and A < Y:
    print("YES")
    
else:
    print("NO")
