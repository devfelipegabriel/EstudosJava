package estudos.java.maratona.jiraya.javacore.Oexception.errors.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000000; i++){
            System.out.println(i);
        }
    }
}
