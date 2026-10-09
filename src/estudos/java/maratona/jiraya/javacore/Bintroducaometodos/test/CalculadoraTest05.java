package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArrray(numeros);
        //em varargs voce pode colocar a lista diretamente na chamada
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);
    }
}
