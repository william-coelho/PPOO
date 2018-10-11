package testeagenda;
import java.util.Scanner;
public class TesteAgenda {

    public static void main(String[] args) {
     Agenda agenda = new Agenda();
     int op;
     Scanner ler = new Scanner(System.in);
        do{
            System.out.println("Escolha uma das opçoes: \n" + "1. Adicionar contato\n"
                    + "2. Remover contato\n"
                    + "3. Listar contatos\n"
                    + "4. Sair");
            op = ler.nextInt();
            switch(op) {
            case 1:
                Pessoa pessoa;
                int op2;
                String nome;
                String endereco;
                String email;
                System.out.println("1.Pessoa fisica\n"
                        + "2.Pessoa juridica\n");
                op2 = ler.nextInt();
                ler.skip("\n");
                System.out.print("Nome: ");
                nome = ler.nextLine();
                System.out.print("Endereço: ");
                endereco = ler.nextLine();
                System.out.print("E-mail: ");
                email = ler.next();
                
                if(op2 == 1) {
                    System.out.print("CPF: ");
                    String cpf = ler.next();
                    System.out.print("Estado civil: ");
                    String estadoCivil = ler.next();
                    pessoa = new PessoaFisica(nome,endereco,email,cpf,estadoCivil);
                    agenda.adicionarContato(pessoa);
                    System.out.println("");
                }
                if(op2 == 2) {
                    System.out.print("CNPJ: ");
                    String cnpj = ler.next();
                    System.out.print("Estado civil: ");
                    String inscricaoEstadual = ler.next();
                    pessoa = new PessoaFisica(nome,endereco,email,cnpj,inscricaoEstadual);
                    agenda.adicionarContato(pessoa);
                    System.out.println("");
                }
                break;
            case 2:
                System.out.print("Digite CPF ou CNPJ do contato: ");
                String id = ler.next();
                if (agenda.removerContato(id)) {
                    System.out.println("Contato removido");
                }
                else {
                    System.out.println("Contato inexistente");
                }
                System.out.println("");
                break;
            case 3:
                System.out.println(agenda);
                break;
            case 4:
                System.out.println("Agenda fechada");
                break;
            default:
                System.out.println("Opção inexistente");
            }
        }while(op != 4);
    }
}

