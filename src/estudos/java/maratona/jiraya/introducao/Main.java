//variaveis primitivas: int, double, float, long, char, byte, short, boolean

package estudos.java.maratona.jiraya.introducao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age1, age2;

        System.out.println("Digite sua idade: ");
        age1 = input.nextInt();

        System.out.println("Digite a idade do seu amigo: ");
        age2 = input.nextInt();

        if (age1 > age2) {
            System.out.printf("Você é o mais velho com diferença de %d anos%n", age1 - age2);
        } else if (age2 > age1) {
            System.out.printf("Seu amigo é mais velho com diferença de %d anos%n", age2 - age1);
        } else {
            System.out.println("Vocês têm a mesma idade");
        }

        input.close();
    }
}