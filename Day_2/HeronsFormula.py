side1 = float(input("Enter the first side of the triangle: "))
side2 = float(input("enter the second side of the triangle: "))
side3 = float(input("Enter the third side of the triangle: "))

sp = (side1 + side2 + side3) / 2
area = (sp * (sp - side1) * (sp - side2) * (sp - side3)) ** (1/2)

print("Area ofnthe triangle =", area)