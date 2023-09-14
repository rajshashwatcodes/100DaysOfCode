class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"My name is {self.name} and I am {self.age} years old.")

# Create instances of the Person class
person1 = Person("Alice", 30)
person2 = Person("Bob", 25)

# Call the introduce method on the instances
person1.introduce()
person2.introduce()
