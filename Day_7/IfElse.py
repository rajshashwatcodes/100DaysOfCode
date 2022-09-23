if __name__ == '__main__':
    n = int(input("Enter a number: ").strip())
    if n % 2 == 1:
        print("Weird")
    else:
        if n >= 1 and n <= 5:
            print("Not Weird")
        elif n >= 6 and n <= 20:
            print("Weird")
        else:
            print("Not Weird")