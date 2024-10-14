
class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0  

    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f"Acelerando... Nova velocidade: {self.velocidade} km/h")

    def frear(self, decremento):
        self.velocidade = max(0, self.velocidade - decremento)  
        print(f"Freando... Nova velocidade: {self.velocidade} km/h")

    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")



carro = Carro("Toyota", "Corolla", 2020)
carro.acelerar(50)
carro.frear(20)
carro.exibir_velocidade()
