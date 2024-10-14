package main

import "fmt"


type Carro struct {
    Marca      string
    Modelo     string
    Ano        int
    Velocidade int 
}


func (c *Carro) Acelerar(incremento int) {
    c.Velocidade += incremento
    fmt.Printf("Acelerando... Nova velocidade: %d km/h\n", c.Velocidade)
}


func (c *Carro) Frear(decremento int) {
    if c.Velocidade-decremento < 0 {
        c.Velocidade = 0
    } else {
        c.Velocidade -= decremento
    }
    fmt.Printf("Freando... Nova velocidade: %d km/h\n", c.Velocidade)
}


func (c Carro) ExibirVelocidade() {
    fmt.Printf("Velocidade atual: %d km/h\n", c.Velocidade)
}

func main() {
    carro := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2020, Velocidade: 0}
    carro.Acelerar(50)
    carro.Frear(20)
    carro.ExibirVelocidade()
}
