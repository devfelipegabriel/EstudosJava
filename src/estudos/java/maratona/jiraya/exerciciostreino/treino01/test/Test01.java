package estudos.java.maratona.jiraya.exerciciostreino.treino01.test;
import estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio.Funcionario;
import estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio.*;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario gerente = new Gerente("Felipe", 19, 10000, Cargo.GERENTE, 100);
        gerente.exibirInformacoes();

        Funcionario desenvolvedor = new Desenvolvedor("GIGI", 24, 100000, Cargo.DESENVOLVEDOR, "Java");
        desenvolvedor.exibirInformacoes();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        Empresa empresa = new Empresa("GIGI COMPANY");
        empresa.dadosEmpresa();
        empresa.listarFuncionarios();
    }
}