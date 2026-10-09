package estudos.java.maratona.jiraya.exerciciostreino.treino02.test;

import estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio.Funcionario;
import estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio.Gerente;
import estudos.java.maratona.jiraya.exerciciostreino.treino02.dominio.Vendedor;

public class Treino02Test {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario normal", 23, 2000);
        Funcionario gerente = new Gerente("Felipe Gabriel", 19, 20000, 15);
        Funcionario vendedor = new Vendedor("Marquinhos", 19, 10000, 20000, 0.5);

        gerente.mostrarDados();
        System.out.println("======================");
        vendedor.mostrarDados();
        System.out.println("======================");
        funcionario.mostrarDados();

        System.out.println("verificacoes de usuarios:");
        funcionario.verificarFuncionario(gerente);


    }
}
