package estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio;

public class Desenvolvedor extends Funcionario implements Bonificavel {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int idade, double salario, Cargo cargo, String linguagemPrincipal) {
        super(nome, idade, salario, cargo);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Linguagem principal: " + linguagemPrincipal);
    }

    @Override
    public void calcularBonus() {
        this.setSalario(this.getSalario() * 0.10);
        System.out.println("O bonus e de: " + this.getSalario());
    }

    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor trabalha utilizando: " + this.getLinguagemPrincipal());
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
}
