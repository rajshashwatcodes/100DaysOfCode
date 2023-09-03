def interchange(l):
  fe = l[0]
  le = l[-1]
  l[0] = le
  l[-1] = fe
  return l

l = list(map(int,input().split()))
X = interchange(l)
print(X)
