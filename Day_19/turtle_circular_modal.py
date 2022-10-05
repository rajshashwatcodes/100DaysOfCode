import turtle as t
from turtle import Screen
import random

timmy = t.Turtle()

timmy.shape("turtle")

t.colormode(255)

def random_color():
    r = random.randint(0, 255)
    g = random.randint(0, 255)
    b = random.randint(0, 255)
    random_color = (r, g , b)
    return random_color


for _ in range(72):
    timmy.circle(100)
    timmy.right(5)
    timmy.color(random_color())
    timmy.speed("fastest")



my_screen = Screen()

my_screen.exitonclick()
