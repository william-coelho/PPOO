package testeagenda;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;
    
    public PessoaFisica(String nome, String endereco, String email, String cpf, String estadoCivil) {
        super(nome,endereco,email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
    
    public String getCpf() {
        return cpf;
    }

    @Override
   public String toString() {
       return super.toString() + "CPF: " + cpf + "\nEstado Civil: " + estadoCivil + '\n';
   }
}
