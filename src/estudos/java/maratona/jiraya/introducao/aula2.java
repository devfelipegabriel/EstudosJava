//variaveis primitivas: int, double, float, long, char, byte, short, boolean
// criar variavel: (tipo) (nomeDaVariavel) { = (valor)};

package estudos.java.maratona.jiraya.introducao;

public class aula2 {
    public static void main(String[] args) {
        int age = (int )10000000000L; // {CASTING} (Forca a variavel a adicionar o valor do long dentro do int
                                        //corta o numero ate caber)
        double salarioDouble = 1200;
        float salarioFloat = 3000.0F; //(colocar o F se o float for decimal)
        byte ageByte = 10;
        short ageShort = 10;
        long numeroGrande = 10000000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Felipe Gabriel";

        System.out.println(age);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(numeroGrande);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi, meu nome e " + nome);
    }
}
