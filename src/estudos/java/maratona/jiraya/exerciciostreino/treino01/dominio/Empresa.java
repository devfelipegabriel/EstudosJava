package estudos.java.maratona.jiraya.exerciciostreino.treino01.dominio;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarioArrayList;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarioArrayList.add(funcionario);
    }

    public void dadosEmpresa(){
        System.out.println("Dados da empresa: ");
        System.out.println("Nome: " + this.nome);
    }

    public void listarFuncionarios(){
        System.out.println("============= Lista de Funcionarios =============");
        for (int i = 0; i < funcionarioArrayList.size(); i++) {
            System.out.println(funcionarioArrayList.get(i));
        }
        System.out.println("=================================================");
    }

    public Funcionario[] getFuncionario() {
        return funcionarioArrayList.toArray(new Funcionario[funcionarioArrayList.size()]);
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionarioArrayList.add(funcionario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
