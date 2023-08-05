class Square:
    def __init__(self, side):
        self.side = side

    def area(self):
        return self.side ** 2

    def perimeter(self):
        return 4 * self.side

# calling the class Square
square1 = Square(5)
print("Area:", square1.area())
print("Perimeter:", square1.perimeter())
