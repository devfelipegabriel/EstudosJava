package estudos.java.maratona.jiraya.javacore.Jmodificadorfinal.test;

import estudos.java.maratona.jiraya.javacore.Jmodificadorfinal.dominio.Carro;
import estudos.java.maratona.jiraya.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Carro Test01");
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
