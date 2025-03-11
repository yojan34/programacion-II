class Pila:
    def __init__(self):
        self.arreglo = [] 
    def push(self,e):
        self.arreglo.append(e)
    def pop(self):
        e = -1
        if not self.isEmpty():
            e = self.arreglo.pop()
        else:
            print("Pila vacía.")
        return e
    def peek(self):
        e = -1
        if not self.isEmpty():
            n = len(self.arreglo)
            e = self.arreglo[n-1]
        else:
            print("Pila vacía.")
        return e
    def isEmpty(self):
        return len(self.arreglo) == 0
A = Pila()
A.push(7)
A.push(22)
A.push(13)
A.push(44)
B = Pila()
C = Pila()
while not A.isEmpty():
    e = A.pop()
    if e % 2 == 0:
        B.push(e)
    else:
        C.push(e)
print("Pila B:")
while not B.isEmpty():
    print(B.pop())
print("Pila C:")
while not C.isEmpty():
    print(C.pop())
