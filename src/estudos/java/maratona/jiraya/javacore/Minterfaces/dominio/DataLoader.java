package estudos.java.maratona.jiraya.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 100;
    void load();
    default void checkPermissions(){
        System.out.println("checando permissoes...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
