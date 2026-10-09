package estudos.java.maratona.jiraya.javacore.Oexception.exception.test;

import estudos.java.maratona.jiraya.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }
        catch(LoginInvalidoException e){
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDb = "Felipe";
        String passwordDb = "1234";
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite a sua senha: ");
        String senha = teclado.next();
        if(!usernameDb.equals(nome) || !passwordDb.equals(senha)){
            throw new LoginInvalidoException("Usuario ou senha incorretos");
        }
        else {
            System.out.println("Login aprovado com sucesso");
        }

    }
}
