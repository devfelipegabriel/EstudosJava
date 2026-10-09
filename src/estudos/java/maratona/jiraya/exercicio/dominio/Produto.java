package estudos.java.maratona.jiraya.exercicio.dominio;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidadeEstoque;
    private int quantidadeProdutoPedido;
    private int quantidadeProdutosCadastrados = 0;
    private double preco;
    {
        System.out.println("Cadastrando produto...");
        quantidadeProdutosCadastrados++;
    }

    public Produto(int codigo, String nome, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        System.out.println("Produto cadastrado!");
    }

    public void imprime(){
        System.out.println("---- Produto ----");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("QuantidadeEstoque: " + quantidadeEstoque);
        System.out.println("Preco: " + preco);
    }

    public int getQuantidadeProdutoPedido() {
        return quantidadeProdutoPedido;
    }

    public void setQuantidadeProdutoPedido(int quantidadeProdutoPedido) {
        this.quantidadeProdutoPedido = quantidadeProdutoPedido;
    }

    public void setQuantidadeProdutosCadastrados(int quantidadeProdutosCadastrados) {
        this.quantidadeProdutosCadastrados = quantidadeProdutosCadastrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
