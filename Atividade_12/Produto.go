package main

import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func (p Produto) SomarPreco(outro Produto) float64 {
	return p.preco + outro.preco
}

func main() {
	produto1 := Produto{"Produto 1", 30}
	produto2 := Produto{"Produto 2", 45}

	fmt.Printf("Soma dos preços: R$ %.2f\n", produto1.SomarPreco(produto2))
}
