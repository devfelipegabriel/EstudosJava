package estudos.java.maratona.jiraya.introducao;

public class exercicio02Aula05EstruturasDeRepeticao {
    //Crie um programa que verifique em quantas vezes um carro pode ser parcelado
    //condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcelas = 1; parcelas <= valorCarro; parcelas++) {
             double valorParcela = valorCarro / parcelas;
             if (valorParcela >= 1000) {
                 System.out.println("Parcela " + parcelas + " com valor R$" + valorParcela);
             }
             else {
                 break;
             }
        }
    }
}
