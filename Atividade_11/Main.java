abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioAssalariado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista(160, 25);
        Funcionario assalariado = new FuncionarioAssalariado(3000);

        System.out.println("Salário do horista: R$ " + horista.calcularSalario());
        System.out.println("Salário do assalariado: R$ " + assalariado.calcularSalario());
    }
}
