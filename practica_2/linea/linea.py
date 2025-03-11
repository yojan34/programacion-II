import turtle

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea {self.p1}, {self.p2}"

    def dibujaLinea(self):
        screen = turtle.Screen()  
        screen.setworldcoordinates(-10, -10, 10, 10)
        pen = turtle.Turtle()
        pen.speed(0) 
        pen.penup()
        pen.goto(-10, 0)
        pen.pendown()
        pen.goto(10, 0)  
        pen.penup()
        pen.goto(0, -10)
        pen.pendown()
        pen.goto(0, 10)  
        pen.penup()
        pen.goto(self.p1) 
        pen.pendown()
        pen.goto(self.p2) 
        pen.penup()
        turtle.done() 

l1 = Linea((0, 0), (5, 5))

print("toString:")
print(l1)
l1.dibujaLinea()