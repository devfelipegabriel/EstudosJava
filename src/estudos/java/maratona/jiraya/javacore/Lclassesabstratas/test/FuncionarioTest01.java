package estudos.java.maratona.jiraya.javacore.Lclassesabstratas.test;

import estudos.java.maratona.jiraya.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import estudos.java.maratona.jiraya.javacore.Lclassesabstratas.dominio.Funcionario;
import estudos.java.maratona.jiraya.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000.00);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Felipe", 10000.00);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }
}