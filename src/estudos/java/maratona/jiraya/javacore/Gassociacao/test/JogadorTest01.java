package estudos.java.maratona.jiraya.javacore.Gassociacao.test;

import estudos.java.maratona.jiraya.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Jogador jogador2 = new Jogador("messi");
        Jogador jogador3 = new Jogador("neymar");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
