package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	saldo float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.saldo {
		return errors.New("Saldo insuficiente")
	}
	c.saldo -= valor
	return nil
}

func main() {
	conta := ContaBancaria{100}
	err := conta.Sacar(150)
	if err != nil {
		fmt.Println(err)
	}
}
