package estudos.java.maratona.jiraya.introducao;

public class exercicioAula04EstruturasCondicionais {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 e < 18 categoria juvenil
        //idade >= 18 categoria profissional

        int idade = 17;

        if (idade < 15) {
            System.out.println("Categoria infantil, com idade de " + idade + " anos");
        }
        else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil, com idade de " + idade + " anos");
        }
        else {
            System.out.println("Categoria profissional, com idade de " + idade + "anos");
        }

    }
}
