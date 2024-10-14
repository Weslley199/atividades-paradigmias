from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, valor_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario_fixo):
        self.salario_fixo = salario_fixo

    def calcular_salario(self):
        return self.salario_fixo

# Testando
horista = FuncionarioHorista(160, 25)
assalariado = FuncionarioAssalariado(3000)

print(f"Salário do horista: R$ {horista.calcular_salario()}")
print(f"Salário do assalariado: R$ {assalariado.calcular_salario()}")
