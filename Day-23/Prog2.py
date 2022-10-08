n = int(input())
for i in range(n):
    x = int(input())
    r = 0
    while x != 0:
        d = x % 10
        r = r * 10 + d
        x = x//10
    print(r)