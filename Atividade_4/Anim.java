
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    
    public abstract String som();
}


class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Au au!";
    }
}


class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Miau!";
    }
}


public class Anim {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        System.out.println(cachorro.som());  
        System.out.println(gato.som());      
    }
}
