
from turtle import *

timmy = Turtle()
my_screen = Screen()

def move_forward():
    timmy.forward(10)

my_screen.listen()
my_screen.onkey(key="space",fun=move_forward)
my_screen.exitonclick()
