package main

import "fmt"

type Animal interface {
	emitirSom() string
	informacoes()
}

type animal struct {
	especie string
	nome    string
}

func (a *animal) informacoes() {
	fmt.Printf("Nome: %s, Espécie: %s\n", a.nome, a.especie)
}

type Cachorro struct {
	animal
}

func newCachorro(nome string) *Cachorro {
	return &Cachorro{animal{especie: "Cachorro", nome: nome}}
}

func (c *Cachorro) emitirSom() string {
	return "Au Au"
}

type Gato struct {
	animal
}

func newGato(nome string) *Gato {
	return &Gato{animal{especie: "Gato", nome: nome}}
}

func (g *Gato) emitirSom() string {
	return "Miau"
}

func mostrarSons(animais []Animal) {
	for _, animal := range animais {
		animal.informacoes()
		fmt.Printf("%s diz: %s\n", animal.(*animal).nome, animal.emitirSom())
	}
}

func main() {
	animais := []Animal{
		newCachorro("Rex"),
		newGato("Mimi"),
	}
	mostrarSons(animais)
}
