package estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio;

public class Vendedor extends Funcionario{
    private double vendas;
    double comissao;
    public Vendedor(String nome, int idade, double salario, double vendas,  double comissao) {
        super(nome, idade, salario);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cargo: Vendedor");
    }

    public void calcularComissao(){
        double salarioFinal = super.getSalario() + (this.vendas*comissao/100);
        System.out.println("salario: R$" + super.getSalario());
        System.out.println("Vendas: " + this.vendas);

        System.out.println("Comissao: R$" + this.comissao);
        System.out.println("Salario Final: R$" + salarioFinal);

    }
}
