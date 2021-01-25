alice = list(map(int, input().split()))
bob = list(map(int, input().split()))
a = b = 0
for k in range(3):
    if alice[k] > bob[k]:
        a += 1
    if alice[k] < bob[k]:
        b += 1
print(a,b)