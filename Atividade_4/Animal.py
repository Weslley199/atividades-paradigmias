
class Animal:
    def __init__(self, nome):
        self.nome = nome

    def som(self):
        raise NotImplementedError("Subclasses devem implementar este método")



class Cachorro(Animal):
    def som(self):
        return f"{self.nome} faz: Au au!"



class Gato(Animal):
    def som(self):
        return f"{self.nome} faz: Miau!"



cachorro = Cachorro("Rex")
gato = Gato("Mimi")

print(cachorro.som())  
print(gato.som())      
