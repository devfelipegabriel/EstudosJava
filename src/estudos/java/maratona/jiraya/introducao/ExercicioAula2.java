package estudos.java.maratona.jiraya.introducao;

/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereco <endereco>,
Confirmo que recebi o salario de <salario>, na data <data>
 */
public class ExercicioAula2 {
    public static void main(String[] args) {
        String nome = "Felipe Gabriel";
        String endereco = "Rua bem-te-vi, lote 7, quadra 23";
        double salario = 5000;
        String data = "02/07/2026";

        System.out.println("Eu " + nome + ", morando no endereco " + endereco + ",\nConfirmo que recebi o salario de "
        + salario + ", na data " + data);
    }
}
