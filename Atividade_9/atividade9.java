package atividades;

public class atividade9 {
	
	interface Imprimivel{
		void imprimir();
	}
	
	static class Relatorio implements Imprimivel{
		
		String nome;
		int ano;
		private String conteudo;
		
		public Relatorio(String nome, int ano, String conteudo) {
			
			this.nome = nome;
			this.ano = ano;
			this.conteudo = conteudo;
		}
		
		@Override
		public void imprimir() {
			 System.out.println("Imprimindo Relatório: " + nome + " (" + ano + ")");
		     System.out.println(conteudo);
			
		}
				
	}
	static class Contrato implements Imprimivel {
		
		String nome;
		int ano;
		private String conteudo;
		
		public Contrato(String nome, int ano, String conteudo) {
			super();
			this.nome = nome;
			this.ano = ano;
			this.conteudo = conteudo;
		}
		
		 @Override
		    public void imprimir() {
			    System.out.println("Imprimindo Contrato: " + nome + " (" + ano + ")");;
		        System.out.println(conteudo);
		    }
		
	}
	
	
	
    public static void main(String[] args) {
        
        Relatorio relatorio = new Relatorio("Relatório de Vendas", 2024, "Conteúdo do Relatório de Vendas. -444-324");

        
        Contrato contrato = new Contrato("Contrato de Prestação de Serviços", 2024, "Conteúdo do Contrato. Contrato feito ambas as partes..");

        
        relatorio.imprimir();
        contrato.imprimir();
    }
	
	
}
