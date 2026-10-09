package estudos.java.maratona.jiraya.exercicio.dominio;

import java.util.Arrays;

public class Pedido {
    private int codigo;
    private double valor;
    Produto[] produtos;
    Funcionario funcionarioResponsavel;
    Cliente cliente;

    {
        System.out.println("Criando pedido...");
    }

    public Pedido(int codigo, Produto[] produtos, Funcionario funcionarioResponsavel, Cliente cliente) {
        this.codigo = codigo;
        for (Produto produto : produtos) {
            if (produto.getQuantidadeProdutoPedido() > produto.getQuantidadeEstoque()) {
                System.out.println("Essa quantidade nao esta disponivel, a quantidade disponivel e: " + produto.getQuantidadeEstoque());
            }
            else{
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()-produto.getQuantidadeProdutoPedido());
            }
        }
        for (int i = 0; i < produtos.length; i++) {
            valor += produtos[i].getPreco();
        }
        this.produtos = produtos;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cliente = cliente;
        System.out.println("pedido criado!");
    }

    public void imprime(){
        System.out.println("---- Pedido ----");
        System.out.println("Funcionario: " + funcionarioResponsavel.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Codigo: " + codigo);
        System.out.println("Valor: " + valor);
        System.out.println("Produtos: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() +  " - " + produto.getPreco());
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
