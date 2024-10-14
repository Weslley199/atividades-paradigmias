class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

# Testando
produto1 = Produto("Produto 1", 30)
produto2 = Produto("Produto 2", 45)

print(f"Soma dos preços: R$ {produto1 + produto2}")
