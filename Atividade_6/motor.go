package main

import "fmt"

type Motor struct {
	tipo     string
	potencia int
}

func newMotor(tipo string, potencia int) *Motor {
	return &Motor{tipo: tipo, potencia: potencia}
}

func (m *Motor) ligar() {
	fmt.Println("O motor está ligado.")
}

func (m *Motor) desligar() {
	fmt.Println("O motor está desligado.")
}

func (m *Motor) informacoes() string {
	return fmt.Sprintf("Tipo: %s, Potência: %d CV", m.tipo, m.potencia)
}

type Carro struct {
	marca  string
	modelo string
	motor  *Motor
}

func newCarro(marca, modelo string) *Carro {
	return &Carro{marca: marca, modelo: modelo, motor: newMotor("Gasolina", 400)}
}

func (c *Carro) ligar() {
	c.motor.ligar()
	fmt.Println("O carro está pronto para rodar.")
}

func (c *Carro) desligar() {
	c.motor.desligar()
	fmt.Println("O carro foi desligado.")
}

func (c *Carro) informacoes() {
	fmt.Printf("Marca: %s, Modelo: %s\n", c.marca, c.modelo)
	fmt.Printf("Informações do Motor: %s\n", c.motor.informacoes())
}

func main() {
	carro := newCarro("Ford", "Mustang")
	carro.informacoes()
	carro.ligar()
	carro.desligar()
}
