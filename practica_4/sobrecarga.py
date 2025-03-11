class Figura:
    def area(self, *args):
        if len(args) == 1 and isinstance(args[0], (int, float)):  # Círculo
            return 3.1416 * args[0] ** 2
        elif len(args) == 2 and isinstance(args[0], int) and isinstance(args[1], int):  # Rectángulo
            return args[0] * args[1]
        elif len(args) == 2 and isinstance(args[0], float) and isinstance(args[1], float):  # Triángulo
            return (args[0] * args[1]) / 2
        elif len(args) == 3 and isinstance(args[0], int) and isinstance(args[1], int) and isinstance(args[2], float):  # Trapecio
            return ((args[0] + args[1]) * args[2]) / 2
        elif len(args) == 2 and isinstance(args[0], int) and isinstance(args[1], float):  # Pentágono
            return (5 * args[0] * args[1]) / 2
        else:
            return "Parámetros inválidos"

f1 = Figura()
f2 = Figura()
f3 = Figura()
f4 = Figura()
f5 = Figura()

print("Área del círculo:", f1.area(2))
print("Área del rectángulo:", f2.area(4, 6))
print("Área del triángulo:", f3.area(4.0, 6.0))
print("Área del trapecio:", f4.area(6, 4, 5.0))
print("Área del pentágono:", f5.area(5, 3.0))

