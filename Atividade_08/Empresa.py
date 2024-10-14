class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        print(f"Empregados da empresa {self.nome}:")
        for empregado in self.empregados:
            print(f"- Nome: {empregado.nome}, Cargo: {empregado.cargo}, Salário: R$ {empregado.salario:.2f}")

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario


empresa1 = Empresa("Tech Solutions")


empregado1 = Empregado("Ana", "Desenvolvedora", 5000.0)
empregado2 = Empregado("Carlos", "Gerente de Projetos", 7000.0)


empresa1.adicionar_empregado(empregado1)
empresa1.adicionar_empregado(empregado2)


empresa1.listar_empregados()


empresa2 = Empresa("Creative Solutions")


empregado3 = Empregado("Maria", "Designer", 4000.0)
empregado4 = Empregado("Pedro", "Analista de Sistemas", 6000.0)


empresa2.adicionar_empregado(empregado3)
empresa2.adicionar_empregado(empregado4)


empresa2.listar_empregados()
