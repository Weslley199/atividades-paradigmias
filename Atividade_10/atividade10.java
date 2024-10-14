package atividades;

public class atividade10 {
	
	static class Calculadora{
		   
	    public double somar(double a, double b) {
	        return a + b;
	    }

	    
	    public double somar(double a, double b, double c) {
	        return a + b + c;
	    }		
			    
	    
	    public static void main(String[] args) {
	        Calculadora calc = new Calculadora();

	        
	        double resultado1 = calc.somar(5, 10);
	        System.out.println("Resultado da soma de dois números: " + resultado1);

	        
	        double resultado2 = calc.somar(5, 10, 15);
	        System.out.println("Resultado da soma de três números: " + resultado2);
	    }
	}
}
	


