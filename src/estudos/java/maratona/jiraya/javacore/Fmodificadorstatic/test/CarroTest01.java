package estudos.java.maratona.jiraya.javacore.Fmodificadorstatic.test;

import estudos.java.maratona.jiraya.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);
//        carro1.getVelocidadeLimite(180);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
