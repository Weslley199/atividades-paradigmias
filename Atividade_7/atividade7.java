package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade7 {
	
	static class Escola{
		private String nome;
		private int anofundacao;
		private String rua;
		private List<Professor> professores; 
		
		
		
		public Escola(String nome, int anofundacao, String rua) {
			super();
			this.nome = nome;
			this.anofundacao = anofundacao;
			this.rua = rua;
			this.professores = new ArrayList<>(); 
		}
		
		 
        public void adicionarProfessor(Professor professor) {
            if (!professores.contains(professor)) {
                professores.add(professor);
                professor.adicionarEscola(this); 
            }
				
	}

        public void listarProfessores() {
            System.out.println("Professores da escola " + nome + ":");
            for (Professor p : professores) {
                System.out.println("- " + p.getNome());
            }
        }
        
        public String getNome() {
			
			return nome;
		}
	}
	
	static class Professor {
        private double salario;
        private String nome;
        private List<Escola> escolas; 

        public Professor(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
            this.escolas = new ArrayList<>(); 
        }

        
        public void adicionarEscola(Escola escola) {
            if (!escolas.contains(escola)) {
                escolas.add(escola);
            }
        }

        public String getNome() {
            return nome;
        }

        public void listarEscolas() {
            System.out.println("Escolas onde o professor(a) " + nome + " leciona:");
            for (Escola e : escolas) {
                System.out.println("- " + e.getNome());
                
            }
        }
	}


public static void main(String[] args) {
	
                    
                    Escola escola1 = new Escola("Escola Primária", 1990, "Rua A");
                    Escola escola2 = new Escola("Escola Secundária", 2000, "Rua B");

                    
                    Professor professor1 = new Professor("Maria", 3000.0);
                    Professor professor2 = new Professor("João", 4000.0);

                    
                    escola1.adicionarProfessor(professor1);
                    escola1.adicionarProfessor(professor2);
                    escola2.adicionarProfessor(professor1); 

                    
                    escola1.listarProfessores();

                    
                    professor1.listarEscolas();
            }
            
     }

