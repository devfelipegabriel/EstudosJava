package estudos.java.maratona.jiraya.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a pergunta e eu responderei sim ou nao: ");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("sim");
        }
        else {
            System.out.println("nao");
        }
    }
}
