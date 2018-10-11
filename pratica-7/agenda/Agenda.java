package testeagenda;
import java.util.ArrayList;
public class Agenda {
    private ArrayList <Pessoa> contatos;
    
    public Agenda() {
        contatos = new ArrayList();
    }
    public void adicionarContato(Pessoa pessoa) {
        contatos.add(pessoa);
    }
    
    public boolean removerContato(String id) {
        Pessoa cont = null;
        for (Pessoa c:contatos) {
            if (c instanceof PessoaFisica) {
                if(((PessoaFisica)c).getCpf().equals(id)) {
                    cont = c;
                }
            }
            else if (c instanceof PessoaJuridica) {
                if(((PessoaJuridica)c).getCnpj().equals(id)) {
                    cont = c;
                }
            }
        }
        return contatos.remove(cont);
    }
    @Override
    public String toString() {
        String lista  = "";
        for (Pessoa c:contatos) {
            if( c instanceof PessoaFisica) {
                lista += ((PessoaFisica)c).toString() + '\n';
            }
            else if (c instanceof PessoaJuridica) {
                lista += ((PessoaJuridica)c).toString() + '\n';
            }
        }
        if(lista.equals("")) {
            lista = "Agenda vaziaz\n";
        }
        return lista;
    }
}
