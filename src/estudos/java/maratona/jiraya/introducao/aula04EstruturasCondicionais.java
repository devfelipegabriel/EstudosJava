package estudos.java.maratona.jiraya.introducao;

public class aula04EstruturasCondicionais {
    public static void main(String[] args) {
        //if
        if (true) {
            //bloco de codigo a ser executado se a condicao for verdadeira
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
        if (true)
            System.out.println("Dentro do if");
        System.out.println("Fora do if");

        //exemplos
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Pode ingerir bebida alcoolica");
        }
        else {
            System.out.println("nao pode ingerir bebida alcoolica");
        }

        //outras formas de se utilizar
        int idade2 = 20;
        boolean isAutorizadoParaBebidas = idade >= 18;

        if(isAutorizadoParaBebidas) {
            System.out.println("pode ingerir bebida alcoolica");
        }
        else {
            System.out.println("nao pode ingerir bebida alcoolica");
        }
    }
}
