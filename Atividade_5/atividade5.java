package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade5 {
	
	
	public static class Animal {
		protected String especie;
		protected String nome;

		public Animal(String especie, String nome) {
			this.especie = especie;
			this.nome = nome;
		}

		public String emitirSom() {
			return ""; 
		}
		
		public void informacoes() {
			 System.out.println("Nome: " + nome + ", Espécie: " + especie);
		}
		
		
	}
	
	

	
	static class Cachorro extends Animal {
		public Cachorro(String nome) {
			super("Cachorro", nome);
		}
		
		@Override
		public String emitirSom() {
			return "Au Au";
		}
	}

	
	static class Gato extends Animal {
		public Gato(String nome) {
			super("Gato", nome);
		}
		
		
		@Override
		public String emitirSom() {
			return "Miau";
		}
	}
	
	
	public static void mostrarsons(List<Animal> animais) {
		for (Animal animal : animais) {
			animal.informacoes();
			System.out.println(animal.nome + " diz: " + animal.emitirSom()); 
		}
	}

	
	public static void main(String[] args) {
		 List<Animal> listaDeAnimais = new ArrayList<>();
	        listaDeAnimais.add(new Cachorro("Rex"));
	        listaDeAnimais.add(new Gato("Mimi"));

	        mostrarsons(listaDeAnimais);
	}
}
