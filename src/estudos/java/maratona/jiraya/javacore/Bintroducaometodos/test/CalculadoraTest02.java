package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20.5F);
    }
}
