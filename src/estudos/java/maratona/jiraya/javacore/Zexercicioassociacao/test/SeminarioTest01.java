package estudos.java.maratona.jiraya.javacore.Zexercicioassociacao.test;

import estudos.java.maratona.jiraya.javacore.Zexercicioassociacao.dominio.Aluno;
import estudos.java.maratona.jiraya.javacore.Zexercicioassociacao.dominio.Local;
import estudos.java.maratona.jiraya.javacore.Zexercicioassociacao.dominio.Professor;
import estudos.java.maratona.jiraya.javacore.Zexercicioassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Sala2");
        Aluno aluno = new Aluno("Felipe", 19);
        Professor professor = new Professor("Vagner", "Desenvolvimento");

        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Desenvolvimento", alunos, local);

        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();

    }
}
