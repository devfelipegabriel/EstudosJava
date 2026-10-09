package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 40;
        int num2 = 20;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
