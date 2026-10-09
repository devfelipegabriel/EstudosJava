package estudos.java.maratona.jiraya.javacore.Oexception.runtime.test;

import org.w3c.dom.ls.LSOutput;

public class RuntimeTest01 {
    //Checked - filhas da classe exception diretamente, podem nao permitir que seu codigo compile
    //UnChecked - runtime ou filhas de runtime, erros que voce mesmo causa
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());
    }
}
