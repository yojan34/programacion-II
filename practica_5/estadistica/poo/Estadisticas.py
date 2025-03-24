import math

class Estadistica:
    def __init__(self, numeros):
        self.numeros = numeros

    def calcular_promedio(self):
        return sum(self.numeros) / len(self.numeros)

    def calcular_desviacion(self):
        promedio = self.calcular_promedio()
        suma = sum((num - promedio) ** 2 for num in self.numeros)
        return math.sqrt(suma / (len(self.numeros) - 1))

numeros = []

print("Ingrese 10 números:")
for _ in range(10):
    numeros.append(float(input()))

estadistica = Estadistica(numeros)

print(f"El promedio es {estadistica.calcular_promedio():.2f}")
print(f"La desviación estándar es {estadistica.calcular_desviacion():.5f}")
