package estudos.java.maratona.jiraya.javacore.Hheranca.test;

import estudos.java.maratona.jiraya.javacore.Hheranca.dominio.Endereco;
import estudos.java.maratona.jiraya.javacore.Hheranca.dominio.Funcionario;
import estudos.java.maratona.jiraya.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua bem-te-vi");
        endereco.setCep("23088060");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        pessoa.setCpf("17507093760");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------------");

        Funcionario  funcionario = new Funcionario();
        funcionario.setNome("Felipin funcionario");
        funcionario.setCpf("1111111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3200);
        funcionario.imprime();

        System.out.println("------------------");
        funcionario.imprimeRelatorio();

    }
}
