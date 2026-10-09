package estudos.java.maratona.jiraya.exercicio.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    public int quantidade = 0;

    {
        quantidade++;
    }

    public String getNome() {
        return nome;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    public void pessoasCadastradas(){
        System.out.println("Quantidade de pessoas: " + quantidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
