package estudos.java.maratona.jiraya.introducao;

public class exercicioAula05EstruturasDeRepeticao {
    public static void main(String[] args) {
        //crie um programa que exiba todos os numeros pares de 0 ate 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
