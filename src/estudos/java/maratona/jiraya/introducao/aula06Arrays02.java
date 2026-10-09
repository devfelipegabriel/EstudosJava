package estudos.java.maratona.jiraya.introducao;

public class aula06Arrays02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        //foreach (nao da pra escolher os indices, imprime todo array
        for(int num:numeros2){
            System.out.println(num);
        }
    }
}
