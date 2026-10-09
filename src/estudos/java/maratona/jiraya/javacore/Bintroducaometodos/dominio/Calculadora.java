package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0)
        {
            return 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Altera dois numeros: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArrray(int[] numeros){
        int soma = 0;
        for(int temp : numeros){
            soma += temp;
        }
        System.out.println(soma);
    }

    //transforma em array (obrigatoriamente tem que ser o ultimo atributo, nao pode vir nada depois dele)
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int temp : numeros){
            soma += temp;
        }
        System.out.println(soma);
    }
}
