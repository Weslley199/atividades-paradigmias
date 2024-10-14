package main

import "fmt"


type Animal interface {
    Som() string
}


type Cachorro struct {
    Nome string
}


type Gato struct {
    Nome string
}


func (c Cachorro) Som() string {
    return fmt.Sprintf("%s faz: Au au!", c.Nome)
}


func (g Gato) Som() string {
    return fmt.Sprintf("%s faz: Miau!", g.Nome)
}

func main() {
    cachorro := Cachorro{Nome: "Rex"}
    gato := Gato{Nome: "Mimi"}

    
    fmt.Println(cachorro.Som())  
    fmt.Println(gato.Som())      
}
