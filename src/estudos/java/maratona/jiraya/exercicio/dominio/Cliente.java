package estudos.java.maratona.jiraya.exercicio.dominio;

public class Cliente extends Pessoa {
    private String email;
    {
        System.out.println("Cadastrando Cliente...");
    }

    public Cliente(String nome, String cpf, int idade, String email) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setIdade(idade);
        this.email = email;
        System.out.println("Cliente Cadastrado!");
    }

    public void imprime(){
        System.out.println("---- Cliente ----");
        super.imprime();
        System.out.println("email: " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
