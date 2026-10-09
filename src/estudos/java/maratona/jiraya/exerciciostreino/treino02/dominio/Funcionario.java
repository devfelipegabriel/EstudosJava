package estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        if (!nome.isBlank() && idade >= 18 && salario > 0) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }
        else {
            System.out.println("erro, certifique-se de que:" +
                    "\nNome nao seja vazio" +
                    "\nIdade seja maior de 18" +
                    "\nSalario seja maior que 0");
        }
        }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salario: R$ " + salario);
    }

    public void verificarFuncionario(Funcionario funcionario){
        if (funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            gerente.calcularBonus();
        }
        else if (funcionario instanceof Vendedor){
            Vendedor vendedor = (Vendedor) funcionario;
            vendedor.calcularComissao();
        }
    }

    public void aumetarSalario(double taxa){
        double taxaReal;

        taxaReal = this.salario * (taxa/100);
        this.salario += taxaReal;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
