package estudos.java.maratona.jiraya.introducao;

public class aula05EstruturasDeRepeticao02 {
    //imprima os primeiros 25 numeros de um dado valor, por exemplo, 50
    public static void main(String[] args) {
        int valorMaximo = 50;
        for(int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
