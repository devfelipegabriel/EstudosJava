package estudos.java.maratona.jiraya.javacore.Fmodificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //inicia sempre que o objeto e criado
    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println();
    }
    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
