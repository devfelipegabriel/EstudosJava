package estudos.java.maratona.jiraya.introducao;

public class aula05EstruturasDeRepeticao03 {
    //imprima os primeiros 25 numeros de um dado valor, por exemplo, 50
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcelas = (int) valorCarro; parcelas >= 1; parcelas--) {
            double valorParcela = valorCarro / parcelas;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcelas + " com valor R$" + valorParcela);
        }
    }
}
