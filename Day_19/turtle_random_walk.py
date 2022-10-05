
from turtle import Turtle, Screen
import random

timmy = Turtle()

timmy.shape("turtle")

colors = ["cyan4","DarkTurquoise","DeepPink","DeepSkyBlue","DarkGreen","HotPink3","OliveDrab","VioletRed3","purple"]


directions = [0, 90, 180, 270]
timmy.pensize(15)
timmy.speed("fastest")

for _ in range(200):
    timmy.color(random.choice(colors))
    timmy.forward(30)
    timmy.setheading(random.choice(directions))

my_screen = Screen()

my_screen.exitonclick
