import java.util.Scanner;
public class TesteFrota{
  private static Frota f;
  private static String resposta, marca, cor;
  private static int ano, cpm, np, ne, cc;
  private static Veiculo v;
  
  public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
    f = new Frota();
    int opcao;
    
    do{
      exibirMenu();
      opcao = entrada.nextInt();
      executarOpcao(opcao);
    }while(opcao != 4);
  }
  
  private static void exibirMenu(){
    System.out.println("=======Controle de Frota=======");
    System.out.println("1 - Entrar com dados de um carro");
    System.out.println("2 - Entrar com dados de um caminhão");
    System.out.println("3 - Imprimir dados da frota");
    System.out.println("4 - Sair\n");
    System.out.print("Digite sua opcao: ");
  }
  
  private static void executarOpcao(int opcao){
    switch(opcao){
      case 1:
	entrarDadosCarro();
	break;
      case 2:
	entrarDadosCaminhao();
	break;
      case 3:
	f.exibirVeiculos();
	break;
      case 4:
	break;
      default: 
	System.out.println("Opção inválida!");
    }
  }
  
  private static void entrarDadosCarro(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com a marca: ");
    marca = entrada.next();
    System.out.println("Entre com o ano: ");
    ano = entrada.nextInt();
    System.out.println("Entre com a cor: ");
    cor = entrada.next();
    System.out.println("Entre com a capacidade do porta malas: ");
    cpm = entrada.nextInt();
    System.out.println("Entre com o número de portas: ");
    np = entrada.nextInt();
    v = new Carro(marca, ano, cor, cpm, np);
    f.adicionarVeiculo(v);
  }
  
  private static void entrarDadosCaminhao(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com a marca: ");
    marca = entrada.next();
    System.out.println("Entre com o ano: ");
    ano = entrada.nextInt();
    System.out.println("Entre com a cor: ");
    cor = entrada.next();
    System.out.println("Entre com o número de eixos: ");
    ne = entrada.nextInt();
    System.out.println("Entre com a capacidade de carga: ");
    cc = entrada.nextInt();
    v = new Caminhao(marca, ano, cor, ne, cc);
    f.adicionarVeiculo(v);
  }
}
