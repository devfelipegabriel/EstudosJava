package estudos.java.maratona.jiraya.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo...");
    }

    @Override
    public void checkPermissions(){
        System.out.println("checando permissoes no banco de dados...");
    }
}
