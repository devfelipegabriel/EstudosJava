package estudos.java.maratona.jiraya.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Entrada: " + nome);
    }
}
