package estudos.java.maratona.jiraya.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }
    @Override
    public void checkPermissions(){
        System.out.println("checando permissoes nos arquivos...");
    }
}
