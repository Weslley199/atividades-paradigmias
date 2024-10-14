class Animal:
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome

    def emitir_som(self):
        return ""

    def informacoes(self):
        print(f"Nome: {self.nome}, Espécie: {self.especie}")


class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__("Cachorro", nome)

    def emitir_som(self):
        return "Au Au"


class Gato(Animal):
    def __init__(self, nome):
        super().__init__("Gato", nome)

    def emitir_som(self):
        return "Miau"


def mostrar_sons(animais):
    for animal in animais:
        animal.informacoes()
        print(f"{animal.nome} diz: {animal.emitir_som()}")


lista_de_animais = [Cachorro("Rex"), Gato("Mimi")]
mostrar_sons(lista_de_animais)
