import math

def get_discriminante(a, b, c):
    return b**2 - 4*a*c

def get_raiz1(a, b, c):
    return (-b + math.sqrt(b**2 - 4*a*c)) / (2*a)

def get_raiz2(a, b, c):
    return (-b - math.sqrt(b**2 - 4*a*c)) / (2*a)


a, b, c = 1, 2, 1
discriminante = get_discriminante(a, b, c)

if discriminante < 0:
    print("La ecuación no tiene raíces reales")
elif discriminante == 0:
    print(f"La ecuación tiene una raíz real: {get_raiz1(a, b, c)}")
else:
    print(f"La ecuación tiene dos raíces reales: {get_raiz1(a, b, c)} y {get_raiz2(a, b, c)}")
