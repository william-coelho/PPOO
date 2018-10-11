import java.util.Scanner;

public class Carrinho{
  private String cliente;
  private String[] carrinho;
  private int dia;
  private int mes;
  private int ano;
  private int contadorItens;
  public Carrinho(String cliente, int dia, int mes, int ano){
    this.cliente = cliente;
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    carrinho = new String[5];
    contadorItens = 0;
  }
  public String getCliente(){
    return cliente;
  }
  public void inserirItem(String produto){
    carrinho[contadorItens] = produto;
    contadorItens++;
  }
  public Carrinho(String cliente, int dia, int mes, int ano, int qtdProdutos){
      this.cliente = cliente;
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
      carrinho = new String[qtdProdutos];
      contadorItens = 0;
  }
  public void exibir(){
      System.out.println("Cliente: " + cliente);
      System.out.printf("%s%d/%d/%d\n","Data da compra: ", dia, mes, ano);
      System.out.printf("Itens do carrinho: ");
      for (String carrinho1 : carrinho) {
          System.out.printf(carrinho1 + " ");
      }
      System.out.println("\n");
  }
  public void encherCarrinho(){
    Scanner ler = new Scanner(System.in);
    for (int i = 0; i < carrinho.length; i++) {
        carrinho[i] = ler.nextLine();
    }
      System.out.println();
  }
}
