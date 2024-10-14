package main

import "fmt"

type Empregado struct {
	nome   string
	cargo  string
	salario float64
}

type Empresa struct {
	nome      string
	empregados []Empregado
}

func newEmpresa(nome string) *Empresa {
	return &Empresa{nome: nome, empregados: []Empregado{}}
}

func (e *Empresa) adicionarEmpregado(empregado Empregado) {
	e.empregados = append(e.empregados, empregado)
}

func (e *Empresa) listarEmpregados() {
	fmt.Printf("Empregados da empresa %s:\n", e.nome)
	for _, empregado := range e.empregados {
		fmt.Printf("- Nome: %s, Cargo: %s, Salário: R$ %.2f\n", empregado.nome, empregado.cargo, empregado.salario)
	}
}

func main() {
	empresa1 := newEmpresa("Tech Solutions")

	empregado1 := Empregado{"Ana", "Desenvolvedora", 5000.0}
	empregado2 := Empregado{"Carlos", "Gerente de Projetos", 7000.0}

	empresa1.adicionarEmpregado(empregado1)
	empresa1.adicionarEmpregado(empregado2)

	empresa1.listarEmpregados()

	empresa2 := newEmpresa("Creative Solutions")

	empregado3 := Empregado{"Maria", "Designer", 4000.0}
	empregado4 := Empregado{"Pedro", "Analista de Sistemas", 6000.0}

	empresa2.adicionarEmpregado(empregado3)
	empresa2.adicionarEmpregado(empregado4)

	empresa2.listarEmpregados()
}
