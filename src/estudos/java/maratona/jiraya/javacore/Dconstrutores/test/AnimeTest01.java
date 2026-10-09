package estudos.java.maratona.jiraya.javacore.Dconstrutores.test;

import estudos.java.maratona.jiraya.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("haikyuu", "TV", "Shonnen", 190, "Ghilb");
        anime.imprime();
    }
}
