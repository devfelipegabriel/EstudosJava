package estudos.java.maratona.jiraya.exercicio.dominio;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    {
        System.out.println("Cadastrando Funcionario...");
    }

    public Funcionario(String nome, String cpf, int idade, String cargo, double salario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setIdade(idade);
        this.cargo = cargo;
        this.salario = salario;
        System.out.println("Funcionario cadastrado!");
    }

    public void imprime(){
        System.out.println("---- Funcionario ----");
        super.imprime();
        System.out.println("salario: " + salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
