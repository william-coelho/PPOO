import java.util.Scanner;
public class TesteDiabetes {

    public static void main(String[] args) {
        System.out.printf("%s","Digite o nome do paciente: ");
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        System.out.printf("%s","Entre com a quantidade de amostras coletadas: ");
        int qtdAmostras = ler.nextInt();
        Paciente paciente = new Paciente(nome,qtdAmostras);
        
        for (int i = 0; i < qtdAmostras; i++) {
            System.out.printf("%s%d%s","Insira o resultado do teste ", i+1 , ": ");
            paciente.inserirAmostra(ler.nextDouble());
        }
        System.out.println("");
        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.printf("%s%.6f%n","Resultado médio =",paciente.getMedia());
        System.out.println("Diagnóstico: " + paciente.getDiagnostico());
    }
    
}
