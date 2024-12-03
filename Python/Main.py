while True:
    try:
        l = float(input("Length: "))
        if l <= 0:
            print("Please input a number>0.")
            continue
        break
    except ValueError:
        print("Invalid input. Please enter a valid input.")
while True:
    try:
        b = float(input("Breadth: "))
        if b <= 0:
            print("Please input a number>0.")
            continue
        break
    except ValueError:
        print("Invalid input. Please enter a valid input.")
a = l * b
print("The area of a rectangle with length", l, "units and breadth", b, "units is", a, "unit².")