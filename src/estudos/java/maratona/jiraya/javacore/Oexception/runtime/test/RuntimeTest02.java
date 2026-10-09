package estudos.java.maratona.jiraya.javacore.Oexception.runtime.test;

public class RuntimeTest02 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Salvando arquivo");
        }
        catch (Exception e){
            System.out.println("Erro ao criar arquivo");
            e.printStackTrace();
        }
        finally{
            System.out.println("fechando recurso liberado pelo SO");
        }
    }
}
