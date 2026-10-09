package estudos.java.maratona.jiraya.javacore.Gassociacao.test;

import estudos.java.maratona.jiraya.javacore.Gassociacao.dominio.Escola;
import estudos.java.maratona.jiraya.javacore.Gassociacao.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jirayia");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = new Professor[]{professor1, professor2};
        Escola escola = new Escola("Escola de chunnin", professores);

        escola.imprime();
    }
}
