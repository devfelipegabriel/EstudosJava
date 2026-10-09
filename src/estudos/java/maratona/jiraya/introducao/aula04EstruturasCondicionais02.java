package estudos.java.maratona.jiraya.introducao;

public class aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Operador ternario (operador criado no java
        //para simplificar condicoes if-else, quando se precisa fazer associacao direto pela variavel
        //sintaxe(dentro da variavel ou retorno de um metodo): (condicao) ? verdadeiro : falso
        //exemplo

        double salario = 6800;
        String mensagemDoar = "Eu vou doar 1000";
        String mensagemNaoDoar = "Nao tenho condicoes de doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
