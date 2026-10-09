package estudos.java.maratona.jiraya.javacore.Oexception.runtime.test;

public class RuntimeTest03 {
    public static void main(String[] args) {
        try{
            throw new ArrayStoreException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (ArrayStoreException e){
            System.out.println("Dentro do ArrayStoreException");
        } catch (NullPointerException e){
            System.out.println("Dentro do NullPointerException");
        } catch (NumberFormatException e){
            System.out.println("Dentro do NumberFormatException");
        }
    }
}
