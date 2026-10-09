package estudos.java.maratona.jiraya.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println("salario: " + this.salario);

    }

    public void imprimeRelatorio(){
        System.out.println("Eu " + this.nome + " Portador do CPF: " + this.cpf + " Declaro que recebi " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
