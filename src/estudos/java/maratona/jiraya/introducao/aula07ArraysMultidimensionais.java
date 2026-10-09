package estudos.java.maratona.jiraya.introducao;

public class aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        //Arrays Multidimensionais sao arrays que referenciam outros arrays
        //exemplo, um programa que guarde o dia e o mes em arrays
        //1,2,3,4,5 meses
        //31,28,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------");
        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
