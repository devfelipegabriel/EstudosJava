package estudos.java.maratona.jiraya.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //inicia sempre que o objeto e criado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for (int episodios : this.episodios){
            System.out.print(episodios + " ");
        }
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
