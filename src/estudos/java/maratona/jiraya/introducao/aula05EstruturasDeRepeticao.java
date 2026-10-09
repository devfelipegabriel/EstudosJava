package estudos.java.maratona.jiraya.introducao;

public class aula05EstruturasDeRepeticao {
    public static void main(String[] args) {
        // estruturas de repeticao em java: while, do-while, for
        int count = 12;
        while(count < 10) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while: " + count);
            ++count;
        }
        while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Dentro do for " + i);
        }
    }
}
