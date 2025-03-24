import math

def promedio(numeros):
    return sum(numeros) / len(numeros)

def desviacion(numeros, prom):
    suma = sum((num - prom) ** 2 for num in numeros)
    return math.sqrt(suma / (len(numeros) - 1))

numeros = []

print("Ingrese 10 números:")
for _ in range(10):
    numeros.append(float(input()))

prom = promedio(numeros)
desv = desviacion(numeros, prom)

print(f"El promedio es {prom:.2f}")
print(f"La desviación estándar es {desv:.5f}")
