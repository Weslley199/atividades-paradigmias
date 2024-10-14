package main

import "fmt"

type Escola struct {
	nome        string
	anoFundacao int
	rua         string
	professores []*Professor
}

func newEscola(nome string, anoFundacao int, rua string) *Escola {
	return &Escola{nome: nome, anoFundacao: anoFundacao, rua: rua, professores: []*Professor{}}
}

func (e *Escola) adicionarProfessor(professor *Professor) {
	for _, p := range e.professores {
		if p == professor {
			return
		}
	}
	e.professores = append(e.professores, professor)
	professor.adicionarEscola(e)
}

func (e *Escola) listarProfessores() {
	fmt.Printf("Professores da escola %s:\n", e.nome)
	for _, p := range e.professores {
		fmt.Printf("- %s\n", p.nome)
	}
}

func (e *Escola) getNome() string {
	return e.nome
}

type Professor struct {
	nome    string
	salario float64
	escolas []*Escola
}

func newProfessor(nome string, salario float64) *Professor {
	return &Professor{nome: nome, salario: salario, escolas: []*Escola{}}
}

func (p *Professor) adicionarEscola(escola *Escola) {
	for _, e := range p.escolas {
		if e == escola {
			return
		}
	}
	p.escolas = append(p.escolas, escola)
}

func (p *Professor) listarEscolas() {
	fmt.Printf("Escolas onde o professor(a) %s leciona:\n", p.nome)
	for _, e := range p.escolas {
		fmt.Printf("- %s\n", e.getNome())
	}
}

func main() {
	escola1 := newEscola("Escola Primária", 1990, "Rua A")
	escola2 := newEscola("Escola Secundária", 2000, "Rua B")

	professor1 := newProfessor("Maria", 3000.0)
	professor2 := newProfessor("João", 4000.0)

	escola1.adicionarProfessor(professor1)
	escola1.adicionarProfessor(professor2)
	escola2.adicionarProfessor(professor1)

	escola1.listarProfessores()
	professor1.listarEscolas()
}
