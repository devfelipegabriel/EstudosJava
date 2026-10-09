package estudos.java.maratona.jiraya.introducao;

public class exercicio03Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        //dado um numero de 1 a 7 imprima se e dia util ou final de semana
        //considere 1 como domingo

        byte numero = 7;
        switch (numero) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("final de semana");
                break;
            default:
                System.out.println("opcao invalida");
        }
    }
}
