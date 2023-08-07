class Students:
    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade

# calling the class Students
student1 = Students("John", 16, "10th")
print("Name:", student1.name)
print("Age:", student1.age)
print("Grade:", student1.grade)
