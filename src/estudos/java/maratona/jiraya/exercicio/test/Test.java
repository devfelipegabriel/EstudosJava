package estudos.java.maratona.jiraya.exercicio.test;
import estudos.java.maratona.jiraya.exercicio.dominio.Cliente;
import estudos.java.maratona.jiraya.exercicio.dominio.Funcionario;
import estudos.java.maratona.jiraya.exercicio.dominio.Pedido;
import estudos.java.maratona.jiraya.exercicio.dominio.Produto;

public class Test {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Felipe", "1234567", 19, "Desenvolvedor", 2500);
        Cliente cliente1 = new Cliente("Marcos", "12345", 19, "marcosdias@gmail.com");
        Produto produto = new Produto(1, "Cabo", 10, 14.90);
        Produto produto2 = new Produto(2, "Rodrigues", 10, 14.9);
        Produto[] arrayProduto = new Produto[]{produto, produto2};

        Pedido pedido = new Pedido(1, arrayProduto, funcionario1, cliente1);

        funcionario1.imprime();
        cliente1.imprime();
        produto.imprime();
        pedido.imprime();
    }
}
