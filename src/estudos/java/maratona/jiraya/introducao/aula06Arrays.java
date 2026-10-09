package estudos.java.maratona.jiraya.introducao;

public class aula06Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3]; //arrays: variavel tipo reference (pode iniciar com nullo)
        //Em java e obrigatorio definir a quantidade de elementos de um array
        idades[0] = 15;
        idades[1] = 18;
        idades[2] = 21;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String[] nomes = new String[3];
        nomes[0] = "Felipe";
        nomes[1] = "Pedro";
        nomes[2] = "Alves";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
