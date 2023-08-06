class Staff:
    def __init__(self, name, department):
        self.name = name
        self.department = department

class Teacher(Staff):
    def __init__(self, name, department, subject):
        super().__init__(name, department)
        self.subject = subject

# calling the class Teacher
teacher1 = Teacher("Mary", "Science", "Biology")
print("Name:", teacher1.name)
print("Department:", teacher1.department)
print("Subject:", teacher1.subject)
