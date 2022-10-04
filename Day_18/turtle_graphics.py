

from turtle import Turtle , Screen

timmy = Turtle()

print(timmy)

# call methods

timmy.shape("turtle")   # earlier the canvas was having an arrow instead of a turtle so its shape is changed now
timmy.color("blue violet")   # to change the color of the turtle 

def move():

    timmy.left(75)   # to move the turtle forward by 100 paces
    timmy.forward(100)
    timmy.right(150)
    timmy.forward(100)
    timmy.speed("fastest")

for i in range(23):
    move()
    
move()

my_screen = Screen()

print(my_screen.canvheight)    # canvheight = to get the height of the canvas

my_screen.exitonclick()    # instead of our screen just popping ang then disappearing we can stop the screen untill we click on the screen
