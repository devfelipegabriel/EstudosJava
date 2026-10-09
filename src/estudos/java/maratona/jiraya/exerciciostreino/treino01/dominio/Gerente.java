package estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio;

public class Gerente extends Funcionario implements Bonificavel {
    public int quantidadeFuncionarios;

    public Gerente(String nome, int idade, double salario, Cargo cargo, int quantidadeFuncionarios) {
        super(nome, idade, salario, cargo);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("quantidade de funcionarios: " + quantidadeFuncionarios);
    }

    @Override
    public void calcularBonus() {
        this.setSalario(this.getSalario() * 0.20);
        System.out.println("O bonus e de: " + this.getSalario());
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando");
    }
}
