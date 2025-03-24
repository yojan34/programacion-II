import math

class ProAlgebra:
    def __init__(self, a=1, b=2, c=1):
        self.a = a
        self.b = b
        self.c = c

    def set_a(self, a): self.a = a
    def set_b(self, b): self.b = b
    def set_c(self, c): self.c = c

    def get_discriminante(self):
        return self.b**2 - 4 * self.a * self.c

    def get_raiz1(self):
        if self.get_discriminante() < 0:
            return float('nan')
        return (-self.b + math.sqrt(self.get_discriminante())) / (2 * self.a)

    def get_raiz2(self):
        if self.get_discriminante() < 0:
            return float('nan')
        return (-self.b - math.sqrt(self.get_discriminante())) / (2 * self.a)

    def __str__(self):
        discriminante = self.get_discriminante()
        if discriminante < 0:
            return "La ecuación no tiene raíces reales."
        elif discriminante == 0:
            return f"La ecuación tiene una raíz real: {self.get_raiz1()}"
        else:
            return f"La ecuación tiene dos raíces reales: {self.get_raiz1()} y {self.get_raiz2()}"


e1 = ProAlgebra()
print(e1)
