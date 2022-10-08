
from turtle import Turtle , Screen
import random

timmy = Turtle()

timmy.shape("turtle")

colors = ["cyan4","DarkTurquoise","DeepPink","DeepSkyBlue","DarkGreen","HotPink3","OliveDrab","VioletRed3","purple"]

def draw_shape(num_sides):
    angle = 360 / num_sides
    for _ in range(num_sides):
        timmy.forward(100)
        timmy.left(angle)


for n_sides in range(3,11):
    timmy.color(random.choice(colors))
    draw_shape(n_sides)


my_screen = Screen()

my_screen.exitonclick()
