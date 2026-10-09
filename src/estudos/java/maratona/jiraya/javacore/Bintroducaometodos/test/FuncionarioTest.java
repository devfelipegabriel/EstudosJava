package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Joao");
        funcionario.setIdade(34);
        funcionario.setSalario(new double[] {1.678, 2.678, 3.678});

        funcionario.imprime();
    }
}
