package estudos.java.maratona.jiraya.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeTest04 {
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

        try{
            talvezLanceException();
        }
        catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }

}
