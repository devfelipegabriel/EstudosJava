package estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.test;

import estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 27;
        professor.nome = "Joao";
        professor.sexo = 'M';
        professor.teste[0] = 3;
        professor.teste[1] = 4;
        professor.teste[2] = 5;

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo + " ");

        for (int i : professor.teste){
            System.out.println(i);
        }
    }
}
