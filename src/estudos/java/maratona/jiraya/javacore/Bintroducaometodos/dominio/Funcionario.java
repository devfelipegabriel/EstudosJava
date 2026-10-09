package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media = 0;

    public void imprime() {
        System.out.println("========= DADOS ========");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (double num : salario) {
            System.out.println("Salario: " + num);
        }
        System.out.println("============ MEDIA ============");
        for (double salario : salario) {
            media += salario;
        }
        media /= this.salario.length;
        System.out.println("Media: " + media);
    }

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

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
