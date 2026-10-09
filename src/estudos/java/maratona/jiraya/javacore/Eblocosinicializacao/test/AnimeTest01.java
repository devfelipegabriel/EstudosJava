package estudos.java.maratona.jiraya.javacore.Eblocosinicializacao.test;

import estudos.java.maratona.jiraya.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
