package estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio;

public class Gerente extends Funcionario{
    private double salarioFinal;
    private double bonus;
    public Gerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cargo: Gerente");
    }

    public void calcularBonus(){
        this.salarioFinal = super.getSalario() + this.bonus;
        System.out.println("salario: R$" + super.getSalario());
        System.out.println("Bonus: R$" + this.bonus);
        System.out.println("Salario final: R$" + this.salarioFinal);
    }
}
