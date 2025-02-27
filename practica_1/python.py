import math
class punto:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def coor_cartesianas(self):
        return (self.x, self.y)
    def coor_polares(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.atan2(self.y, self.x)
        return (r, theta)
    def __str__(self):
        return f"Punto({self.x}, {self.y})"
p1 = punto(3, 4)
print("Coordenadas cartesianas:")
print(p1.coor_cartesianas())
print("Coordenadas polares:")
print(p1.coor_polares())
print("toString:")
print(p1)