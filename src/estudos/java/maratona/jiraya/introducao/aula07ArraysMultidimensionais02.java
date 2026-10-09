package estudos.java.maratona.jiraya.introducao;

public class aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] ArrayInt = new int[3][];
        for(int[] ArrayBase: ArrayInt)
        {
            for(int num : ArrayBase)
            {
                System.out.println(num);
            }
        }
    }
}
