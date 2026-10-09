package estudos.java.maratona.jiraya.javacore.Npolimorfismo.servico;

import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Produto;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImpostos {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
