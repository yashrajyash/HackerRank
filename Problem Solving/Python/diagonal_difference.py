if __name__ == '__main__':
    n = int(input())
    l = r = 0
    for i in range(n):
        arr = list(map(int, input().split()))
        l += arr[i]
        r += arr[n-i-1]
    print(abs(l-r))