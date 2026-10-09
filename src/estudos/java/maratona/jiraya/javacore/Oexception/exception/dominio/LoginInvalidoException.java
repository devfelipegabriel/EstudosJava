package estudos.java.maratona.jiraya.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        System.out.println("Login Invalido");
    }

    public LoginInvalidoException(String message){
        super(message);
    }
}
