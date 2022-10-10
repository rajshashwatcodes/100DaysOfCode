
from turtle import  *
import colorgram
import random

timmy = Turtle()
colormode(255)
timmy.speed("fastest")
timmy.hideturtle()

color_list = [(202, 164, 109), (238, 240, 245), (150, 75, 49), (223, 201, 135), (52, 93, 124), (172, 154, 40), (140, 30, 19), (133, 163, 185), (198, 91, 71), (46, 122, 86), (72, 43, 35), (145, 178, 148), (13, 99, 71), (233, 175, 164), (161, 142, 158), (105, 74, 77), (55, 46, 50), (183, 205, 171), (36, 60, 74), (18, 86, 90), (81, 148, 129), (148, 17, 20), (14, 70, 64), (30, 68, 100), (107, 127, 153), (174, 94, 97), (176, 192, 209)]
timmy.setheading(225)
timmy.penup()
timmy.forward(300)
timmy.left(135)    # timmy.setheading(0) can also be used

def move_straight():
    for i in range(10):
        timmy.dot(20, random.choice(color_list))
        timmy.forward(50)
    timmy.setheading(90)
    timmy.forward(50)
    timmy.setheading(180)
    timmy.forward(50)

def move_back():
    for i in range(10):
        timmy.dot(20, random.choice(color_list))
        timmy.forward(50)
    timmy.setheading(90)
    timmy.forward(50)
    timmy.setheading(360)
    timmy.forward(50)

for j in range(5):
    move_straight()
    move_back()    


my_screen = Screen()

my_screen.exitonclick()
