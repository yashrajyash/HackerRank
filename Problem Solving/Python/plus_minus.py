if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    plus = minus = zero = 0
    for i in arr:
        if i < 0:
            minus += 1
        elif i > 0:
            plus += 1
        else:
            zero += 1

    print('{:.6f}\n{:.6f}\n{:.6f}'.format((plus/n), (minus/n), (zero/n)))