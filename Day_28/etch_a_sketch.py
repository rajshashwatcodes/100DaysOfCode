
from turtle import *

timmy = Turtle()
my_screen = Screen()
timmy.speed = "fastest"
def move_forward():
    forward(10)

def move_backward():
    back(10)

def move_anti_clockwise():
    left(10)

def move_clockwise():
    right(10)

def clear_screen():
    clear()
    penup()
    home()
    pendown()
    
def to_undo():
    undo()

my_screen.listen()
my_screen.onkey(key="f", fun=move_forward)
my_screen.onkey(key="b", fun=move_backward)
my_screen.onkey(key="l", fun=move_anti_clockwise)
my_screen.onkey(key="r", fun=move_clockwise)
my_screen.onkey(key="c", fun=clear_screen)
my_screen.onkey(key="u", fun=to_undo)

my_screen.exitonclick()
