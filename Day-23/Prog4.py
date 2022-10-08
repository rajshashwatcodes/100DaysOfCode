n = int(input())
for i in range(n):
    a = input()
    y = ""
    if a[0].islower():
        print(a.lower())
    else:
        print(a.upper())