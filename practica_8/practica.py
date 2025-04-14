class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaxz(self):
        self.x += 1
        self.z += 1
    
    def incrementaz(self):
        self.z += 1

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z

    def incrementayz(self):
        self.y += 1
        self.z += 1
    
    def incrementaz(self):
        self.z += 1

class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)

    def incrementaxyz(self):
        self.x += 1
        self.y += 1
        self.z += 1

d = D(1, 2, 3)
print("Original XYZ= ",d.x, d.y, d.z) 
d.incrementaxz()
print("Incrementado XZ= ",d.x, d.y, d.z)
d.incrementayz()
print("Incrementado YZ= ",d.x, d.y, d.z)
d.incrementaz()
print("Incrementado Z= ",d.x, d.y, d.z)
d.incrementaxyz()
print("Incrementado XYZ= ",d.x, d.y, d.z)


