package main

import "fmt"

type Configuracao struct{}

var instance *Configuracao

func GetInstance() *Configuracao {
	if instance == nil {
		instance = &Configuracao{}
	}
	return instance
}

func main() {
	config1 := GetInstance()
	config2 := GetInstance()

	fmt.Println(config1 == config2) 
}
