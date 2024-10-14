package main

import (
	"fmt"
)

type Calculadora struct{}

// Função para somar dois ou três números
func (c Calculadora) Somar(nums ...float64) float64 {
	total := 0.0
	for _, num := range nums {
		total += num
	}
	return total
}

func main() {
	calc := Calculadora{}

	// Somando dois números
	resultado1 := calc.Somar(5, 10)
	fmt.Printf("Resultado da soma de dois números: %.2f\n", resultado1)

	// Somando três números
	resultado2 := calc.Somar(5, 10, 15)
	fmt.Printf("Resultado da soma de três números: %.2f\n", resultado2)
}
