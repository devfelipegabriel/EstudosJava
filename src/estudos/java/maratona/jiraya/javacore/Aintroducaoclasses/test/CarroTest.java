package estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.test;

import estudos.java.maratona.jiraya.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Honda";
        carro1.ano = 2020;

        carro2.nome = "A3";
        carro2.modelo = "Audi";
        carro2.ano = 2019;

        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("------------------------");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
