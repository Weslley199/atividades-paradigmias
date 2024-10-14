from abc import ABC, abstractmethod


class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass


class Relatorio(Imprimivel):
    def __init__(self, nome, ano, conteudo):
        self.nome = nome
        self.ano = ano
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Imprimindo Relatório: {self.nome} ({self.ano})")
        print(self.conteudo)


class Contrato(Imprimivel):
    def __init__(self, nome, ano, conteudo):
        self.nome = nome
        self.ano = ano
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Imprimindo Contrato: {self.nome} ({self.ano})")
        print(self.conteudo)


if __name__ == "__main__":
    
    relatorio = Relatorio("Relatório de Vendas", 2024, "Conteúdo do Relatório de Vendas. -444-324")

    
    contrato = Contrato("Contrato de Prestação de Serviços", 2024, "Conteúdo do Contrato. Contrato feito por ambas as partes.")

    
    relatorio.imprimir()
    contrato.imprimir()
