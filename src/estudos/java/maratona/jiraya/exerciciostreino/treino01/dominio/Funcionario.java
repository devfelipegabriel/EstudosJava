package estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, int idade, double salario, Cargo cargo) {
        this.nome = nome;
        this.idade = idade;
        if (salario <= 0) {
            System.out.println("salario invalido");
            this.salario = 0;
        }
        this.salario = salario;
        this.cargo = cargo;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
    }

    public abstract void trabalhar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
