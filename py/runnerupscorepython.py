if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    h = max(arr)
    while max(arr) == h:
        arr.remove(max(arr))
    print max(arr)
