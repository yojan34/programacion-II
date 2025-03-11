import math
class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.nroElementos = 0
        
    def insert(self,e):
        if not self.isFull():
            if self.fin == self.n - 1:
                self.fin = -1
            self.fin = self.fin + 1
            self.arreglo[self.fin] = e
            self.nroElementos = self.nroElementos + 1
        else: 
            print("Cola llena.");        
        
    def remove(self):
        e = -1
        if not self.isEmpty():
            e = self.arreglo[self.inicio]
            self.inicio = self.inicio + 1 
            if self.inicio == self.n:
                self.inicio = 0
            self.nroElementos = self.nroElementos - 1
        else:
            print("Cola vacía.")
      
        return e

    def peek(self):
        e = -1
        if not self.isEmpty():
            e = self.arreglo[self.inicio]
        else:
            print("Cola vacía.")

        return e
    
    def isEmpty(self):
        return self.nroElementos == 0

    def isFull(self):
        return self.nroElementos == self.n

    def size(self):
        return self.nroElementos
   
num = 500
primo = [True] * num

def criba():
    for i in range(2,int(math.sqrt(num))+1):
        if primo[i] == True:
            for j in range(i * i, num, i):
                primo[j] = False

criba()
A = Cola(5)
A.insert(7)
A.insert(22)
A.insert(11)
A.insert(10)

B = Cola(5)
C = Cola(5)
while not A.isEmpty():
    e = A.remove()
    if primo[e]:
        B.insert(e)
    else:
        C.insert(e)
        
print("Cola B:")
while not B.isEmpty():
    print(B.remove())
    
print("Cola C:")
while not C.isEmpty():
    print(C.remove())

