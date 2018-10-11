package testeagenda;

public class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    
    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nEmail: " + email + '\n'; 
    }
}
