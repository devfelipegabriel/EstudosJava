package estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.test;

import estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.idade = 18;
        estudante1.sexo = 'M';
        estudante1.nome = "Marcos";
        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
    }
}
