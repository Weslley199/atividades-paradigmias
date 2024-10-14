class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

    def ligar(self):
        print("O motor está ligado.")

    def desligar(self):
        print("O motor está desligado.")

    def informacoes(self):
        return f"Tipo: {self.tipo}, Potência: {self.potencia} CV"


class Carro:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.motor = Motor("Gasolina", 400)

    def ligar(self):
        self.motor.ligar()
        print("O carro está pronto para rodar.")

    def desligar(self):
        self.motor.desligar()
        print("O carro foi desligado.")

    def informacoes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}")
        print(f"Informações do Motor: {self.motor.informacoes()}")


carro = Carro("Ford", "Mustang")
carro.informacoes()
carro.ligar()
carro.desligar()
