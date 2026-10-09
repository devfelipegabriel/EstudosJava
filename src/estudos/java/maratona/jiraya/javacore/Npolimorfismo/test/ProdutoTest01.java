package estudos.java.maratona.jiraya.javacore.Npolimorfismo.test;

import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Computador;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.dominio.Tomate;
import estudos.java.maratona.jiraya.javacore.Npolimorfismo.servico.CalculadoraImpostos;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC 10", 11000);
        Tomate tomate = new Tomate("Tomate 01", 10);
        CalculadoraImpostos.calcularImposto(computador);
        System.out.println("-----------------------------------------");
        CalculadoraImpostos.calcularImposto(tomate);
    }
}
