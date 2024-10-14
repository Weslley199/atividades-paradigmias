
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade; 

  
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

   
    public void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando... Nova velocidade: " + this.velocidade + " km/h");
    }

   
    public void frear(int decremento) {
        this.velocidade = Math.max(0, this.velocidade - decremento);  // Evita velocidade negativa
        System.out.println("Freando... Nova velocidade: " + this.velocidade + " km/h");
    }


    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }


    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020);
        carro.acelerar(50);
        carro.frear(20);
        carro.exibirVelocidade();
    }
}
