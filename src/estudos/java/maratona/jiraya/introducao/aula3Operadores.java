package estudos.java.maratona.jiraya.introducao;

public class aula3Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos + - / *
        // o resultado de operacoes com dois numeros inteiros sempre resultara num numero inteiro

        int numero1 = 10;
        double numero2 = 30;
        double operacao = numero1 / numero2;

        System.out.println(operacao);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        //Operadores Relacionais < > <= >= == != (sempre retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20; //padrao em tipo booleano sempre usar o is
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("Dez maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez menor que vinte? " + isDezMenorQueVinte);
        System.out.println("Dez igual a vinte? " + isDezIgualVinte);
        System.out.println("Dez diferente de vinte? " + isDezDiferenteVinte);

        //operadores logicos &&(and) ||(or) !(not)
        int idade = 35;
        float salario = 3500.00F;
        boolean isDetroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDetroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei Maior que trinta? " + isDetroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que trinta? " + isDetroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorTotalPlaystation = 5000;

        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorTotalPlaystation || valorTotalContaPoupanca >= valorTotalPlaystation;
        System.out.println("Comprar Playstation5? " + isPlaystation5Compravel);

        // += -= *= /= %=

        int bonus = 1800;
        bonus += 1000; //acrescenta 1000
        bonus -= 1000; //subtrai 1000
        bonus *= 2; //mulitplica por 2
        bonus /= 2; //divide por 2
        bonus %= 2; //pega o resto da divisao por 2

        // ++ --
        int contador = 0;
        contador++; //primeiro executa o que tem que executar na variavel e depois acrescenta
        contador--; //primeiro executa o que tem que executar na variavel e depois subtrai

        int contador2 = 0;
        ++contador2; //primeiro acrescenta e depois executa o que tem que executar na variavel
        --contador2; //primeiro subtrai e depois executa o que tem que executar na variavel

        System.out.println("Contador 1? " + contador);
        System.out.println("Contador 2? " + contador2);
        System.out.println("Contador 1? " + contador++);
        System.out.println("Contador 2? " + ++contador2);

    }
}
