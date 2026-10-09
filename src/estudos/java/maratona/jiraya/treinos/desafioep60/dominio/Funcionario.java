package estudos.java.maratona.jiraya.treinos.desafioep60.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    {
        System.out.println("Inicializando Funcionario...");
    }

    public Funcionario(String nome){
        this.nome = nome;
    }
    public Funcionario(String nome, int idade, double salario){
        this(nome);
        this.idade = idade;
        if(salario<0)
        {
            System.out.println("Salario invalido");
        }
        else{
            this.salario = salario;
        }
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
    }
}
