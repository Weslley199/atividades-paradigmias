package main

import "fmt"


type Imprimivel interface {
	imprimir()
}


type Relatorio struct {
	nome     string
	ano      int
	conteudo string
}

func (r Relatorio) imprimir() {
	fmt.Printf("Imprimindo Relatório: %s (%d)\n", r.nome, r.ano)
	fmt.Println(r.conteudo)
}


type Contrato struct {
	nome     string
	ano      int
	conteudo string
}

func (c Contrato) imprimir() {
	fmt.Printf("Imprimindo Contrato: %s (%d)\n", c.nome, c.ano)
	fmt.Println(c.conteudo)
}

func main() {
	
	relatorio := Relatorio{
		nome:     "Relatório de Vendas",
		ano:      2024,
		conteudo: "Conteúdo do Relatório de Vendas. -444-324",
	}

	
	contrato := Contrato{
		nome:     "Contrato de Prestação de Serviços",
		ano:      2024,
		conteudo: "Conteúdo do Contrato. Contrato feito por ambas as partes.",
	}

	
	relatorio.imprimir()
	contrato.imprimir()
}
