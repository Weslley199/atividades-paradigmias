package main

import "fmt"


type Carro struct {
    Marca  string
    Modelo string
    Ano    int
}


func (c Carro) ExibirDetalhes() {
    fmt.Printf("Carro: %s %s, Ano: %d\n", c.Marca, c.Modelo, c.Ano)
}

func main() {
  
    carro1 := Carro{"Toyota", "Corolla", 2020}
    carro2 := Carro{"Honda", "Civic", 2019}
    carro3 := Carro{"Ford", "Mustang", 2021}

    
    carro1.ExibirDetalhes()
    carro2.ExibirDetalhes()
    carro3.ExibirDetalhes()
}
