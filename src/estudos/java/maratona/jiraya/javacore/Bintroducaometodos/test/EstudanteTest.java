package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Estudante;
import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.idade = 19;
        estudante1.sexo = 'M';
        estudante1.nome = "Marcos";

        estudante2.idade = 19;
        estudante2.sexo = 'M';
        estudante2.nome = "Felipe";


        impressora.imprime(estudante1);

        impressora.imprime(estudante2);

        System.out.println("---------------------------");

        System.out.println("Nome: " + estudante1.nome);
        System.out.println("Idade: " + estudante1.idade);
        System.out.println("Sexo: " + estudante1.sexo);

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
