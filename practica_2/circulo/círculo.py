import turtle

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio
    def __str__(self):
        return f"Circunferencia con punto en {self.centro}, y radio {self.radio}"
    def dibujaCirculo(self):
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
        pen.goto(self.centro[0], self.centro[1] - self.radio)
        pen.pendown()  
        pen.circle(self.radio, steps=100)
        turtle.done()  

c1 = Circulo((0, 0), 4)
print("toString:")
print(c1)
c1.dibujaCirculo()
