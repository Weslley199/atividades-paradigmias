class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibir_detalhes(self):
        print(f"Carro: {self.marca} {self.modelo}, Ano: {self.ano}")


carro01 = Carro("Volkswagen", "Golzinho", 2020)
carro02 = Carro("Q2", "Audi ", 2019)
carro03 = Carro("Fiat", "Argo", 2021)


carro01.exibir_detalhes()
carro02.exibir_detalhes()
carro03.exibir_detalhes()
