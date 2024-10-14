class Calculadora:
    # Método para somar dois ou três números
    def somar(self, a, b, c=None):
        if c is None:
            return a + b
        else:
            return a + b + c

# Método principal para testar a classe
if __name__ == "__main__":
    calc = Calculadora()

    # Somando dois números
    resultado1 = calc.somar(5, 10)
    print(f"Resultado da soma de dois números: {resultado1}")

    # Somando três números
    resultado2 = calc.somar(5, 10, 15)
    print(f"Resultado da soma de três números: {resultado2}")
