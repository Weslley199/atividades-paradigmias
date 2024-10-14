package main

import "fmt"


type Funcionario interface {
	CalcularSalario() float64
}


type FuncionarioHorista struct {
	horasTrabalhadas int
	valorHora        float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return float64(f.horasTrabalhadas) * f.valorHora
}


type FuncionarioAssalariado struct {
	salarioFixo float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.salarioFixo
}

func main() {
	horista := FuncionarioHorista{160, 25}
	assalariado := FuncionarioAssalariado{3000}

	fmt.Printf("Salário do horista: R$ %.2f\n", horista.CalcularSalario())
	fmt.Printf("Salário do assalariado: R$ %.2f\n", assalariado.CalcularSalario())
}
