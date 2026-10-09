package estudos.java.maratona.jiraya.javacore.Bintroducaometodos.test;

import estudos.java.maratona.jiraya.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        pessoa.setIdade(19);

//        pessoa.imprimePessoa();
        System.out.println(pessoa.getNome());
    }
}
