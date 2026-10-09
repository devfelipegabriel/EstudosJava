package estudos.java.maratona.jiraya.javacore.CsobrecargaMetodos.test;

import estudos.java.maratona.jiraya.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTipo("TV");
        anime.setEpisodios(190);
        anime.setNome("Kimetsu no Yaiba");
        anime.imprime();
    }
}
