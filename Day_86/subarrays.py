n = int(input())
for i in range(n):
    n = int(input())
    arr = list(map(int,input().split()))
    for i in range(n):
        for j in range(i,n):
            for k in range(i,j+1):
                print(arr[k], end=' ')
            print()
