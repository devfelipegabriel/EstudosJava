package estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.test;

import estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Felipe";
        aluno.idade = 19;
        aluno.notas[0] = 7.0;
        aluno.notas[1] = 8.0;
        aluno.notas[2] = 6.5;
        aluno.notas[3] = 7.5;

        double notaTotal = aluno.notas[0] + aluno.notas[1] + aluno.notas[2] + aluno.notas[3];
        double media =  notaTotal / aluno.notas.length;

        System.out.println("Notas: ");
        for(double notas : aluno.notas)
        {
            System.out.println(notas);
            System.out.println("-----------------");
        }

        System.out.println("\nMedia: " + media);
        System.out.println("==================");
        System.out.println("=     STATUS     =");
        System.out.println("==================");

        if(media > 7){
            System.out.println("Aprovado");
        }
        else if(media < 7 && media > 4.5){
            System.out.println("Em recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }

        double maiorNota = aluno.notas[0];
        double menorNota = aluno.notas[0];
        int notasAcimaDaMedia = 0;
        for(int i = 1; i < aluno.notas.length; i++) {
            if(aluno.notas[i] > maiorNota){
                maiorNota = aluno.notas[i];
            }
            if(aluno.notas[i] < menorNota){
                menorNota = aluno.notas[i];
            }
        }
        for (int i = 0; i < aluno.notas.length; i++)
        {
            if (aluno.notas[i] > media)
            {
                notasAcimaDaMedia++;
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
