package estudos.java.maratona.jiraya.javacore.Gassociacao.test;

import estudos.java.maratona.jiraya.javacore.Gassociacao.dominio.Jogador;
import estudos.java.maratona.jiraya.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("felipe");
        Time time1 = new Time("Flamengo");
        jogador1.setTime(time1);

        jogador1.imprime();
    }
}
