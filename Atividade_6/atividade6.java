package atividades;

public class atividade6 {
    
    
    static class Motor {
        private String tipo;
        private int potencia;

        public Motor(String tipo, int potencia) {
            this.tipo = tipo;
            this.potencia = potencia;
        }

        public void ligar() {
            System.out.println("O motor está ligado.");
        }

        public void desligar() {
            System.out.println("O motor está desligado.");
        }
        
        
        public String informacoes() {
            return "Tipo: " + tipo + ", Potência: " + potencia + " CV";
        }
    }

    
    static class Carro {
        private String marca;
        private String modelo;
        private Motor motor;  
        
        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = new Motor("Gasolina", 400); 
        }

        public void ligar() {
            motor.ligar(); 
            System.out.println("O carro está pronto para rodar.");
        }

        public void desligar() {
            motor.desligar(); 
            System.out.println("O carro foi desligado.");
        }

        
        public void informacoes() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo);
            System.out.println("Informações do Motor: " + motor.informacoes());
        }
    }

    
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Mustang"); 
        carro.informacoes(); 
        carro.ligar(); 
        carro.desligar(); 
    }
}  nesse tambem 