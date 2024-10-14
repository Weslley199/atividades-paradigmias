package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade8 {
	
	static class Empresa{
		String nome;
		List<Empregado> empregados;
		
		public Empresa(String nome) {
			
			this.nome = nome;
			this.empregados = new ArrayList<>();
		}
		
		 
        public void adicionarEmpregado(Empregado empregado) {
            empregados.add(empregado);
        }
		
         
        public void listarEmpregados() {
            System.out.println("Empregados da empresa " + nome + ":");
            for (Empregado e : empregados) {
                System.out.println("- Nome: " + e.nome + ", Cargo: " + e.cargo + ", Salário: R$ " + e.salario);
            }
        }
	}
	
	static class Empregado{
		String nome;
		String cargo;
		double salario;
		
		public Empregado(String nome, String cargo, double salario) {
			super();
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}

		
		public static void main(String[] args) {
		    
		    Empresa empresa1 = new Empresa("Tech Solutions");

		    
		    Empregado empregado1 = new Empregado("Ana", "Desenvolvedora", 5000.0);
		    Empregado empregado2 = new Empregado("Carlos", "Gerente de Projetos", 7000.0);
		    
		    
		    empresa1.adicionarEmpregado(empregado1);
		    empresa1.adicionarEmpregado(empregado2);
		    
		    
		    empresa1.listarEmpregados();

		    
		    Empresa empresa2 = new Empresa("Creative Solutions");

		    
		    Empregado empregado3 = new Empregado("Maria", "Designer", 4000.0);
		    Empregado empregado4 = new Empregado("Pedro", "Analista de Sistemas", 6000.0);
		    
		    
		    empresa2.adicionarEmpregado(empregado3);
		    empresa2.adicionarEmpregado(empregado4);
		    
		    
		    empresa2.listarEmpregados();
		}

		
	}
	
	

}
