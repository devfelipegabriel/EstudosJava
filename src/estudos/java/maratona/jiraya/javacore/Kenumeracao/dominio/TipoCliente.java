package estudos.java.maratona.jiraya.javacore.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int id;
    public final String tipoRelatorio;
    TipoCliente(int id, String tipoRelatorio){
        this.id = id;
        this.tipoRelatorio = tipoRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String tipoRelatorio){
        for (TipoCliente tipoCliente : TipoCliente.values()){
            if (tipoCliente.tipoRelatorio.equals(tipoRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public int getId(){
        return id;
    }
}
