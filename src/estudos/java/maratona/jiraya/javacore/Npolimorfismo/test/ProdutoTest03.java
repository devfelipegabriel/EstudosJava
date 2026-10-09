package estudos.java.maratona.jiraya.javacore.Npolimorfismo.test;

import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Computador;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Produto;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Televisao;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Tomate;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.servico.CalculadoraImpostos;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        Produto televisao = new Televisao("Samsung 40\" ", 5000);
        CalculadoraImpostos.calcularImposto(computador);
        System.out.println("------------------------");
        tomate.setDataValidade("22/01/2027");
        CalculadoraImpostos.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImpostos.calcularImposto(televisao);
    }
}
