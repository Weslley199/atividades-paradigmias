class Escola:
    def __init__(self, nome, ano_fundacao, rua):
        self.nome = nome
        self.ano_fundacao = ano_fundacao
        self.rua = rua
        self.professores = []

    def adicionar_professor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)
            professor.adicionar_escola(self)

    def listar_professores(self):
        print(f"Professores da escola {self.nome}:")
        for professor in self.professores:
            print(f"- {professor.nome}")

    def get_nome(self):
        return self.nome


class Professor:
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario
        self.escolas = []

    def adicionar_escola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)

    def listar_escolas(self):
        print(f"Escolas onde o professor(a) {self.nome} leciona:")
        for escola in self.escolas:
            print(f"- {escola.get_nome()}")


escola1 = Escola("Escola Primária", 1990, "Rua A")
escola2 = Escola("Escola Secundária", 2000, "Rua B")

professor1 = Professor("Maria", 3000.0)
professor2 = Professor("João", 4000.0)

escola1.adicionar_professor(professor1)
escola1.adicionar_professor(professor2)
escola2.adicionar_professor(professor1)

escola1.listar_professores()
professor1.listar_escolas()
