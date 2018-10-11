
GCC178 – Práticas de Programação Orientada a Objetos
2018/2
PRÁTICA SOBRE CONCEITOS BÁSICOS DE ORIENTAÇÃO A OBJETOS
Exercício 1
Implemente em Java uma classe  
Ponto 
para representar um ponto no plano cartesiano.
Essa classe deve possuir os atributos reais, 
x
 e 
y
, que correspondem às coordenadas do
ponto   no   plano   cartesiano.   Implemente   um   construtor   que   inicializa   os   dois   atributos,
supondo que os valores fornecidos serão sempre corretos. A classe dever ter um método
getPonto
 que retorne uma 
String
 no formato do seguinte exemplo: “As coordenadas (x,y)
do ponto são: (1,7; 3,4)”. Crie também o método 
calcularDistancia
 que calcule e retorne a
distância entre o ponto em questão e um segundo ponto cujas coordenadas são passadas
por parâmetro. Por fim, implemente a classe 
PontoTeste
 para testar a implementação da
classe  
Ponto
. Nessa classe, que será a principal (contém o método  
main
), instancie um
objeto da classe  
Ponto
  (
x
=1,5 e  
y
  = 2,5), chame o método  
getPonto
  para esse objeto,
implemente o código para calcular a distância entre o objeto (ponto) criado e um segundo
ponto (
x
=3,5 e 
y
 = 5,5) e imprima na tela o valor da distância entre os pontos no formato
do seguinte exemplo: “A distância entre os pontos é: 3,61”.
Exercício 2
Crie  uma  classe  
Horario
  com  três  atributos inteiros:  hora,  minuto  e  segundo.  Faça   um
construtor   que   inicializa   os   três   atributos   e   suponha   que   os   valores   passados   por
parâmetro serão corretos. A classe deve possuir um método para exibir (imprimir na tela)
o horário em formato de números separados por dois pontos (por exemplo: 15h:05m:12s).
Além   disso,   essa   classe   deverá   ter   um   método   
formatar
Tempo
   que   recebe   uma
quantidade     de     segundos     por     parâmetro,     converte     esse     valor     no     padrão
hora:minuto:segundo e utiliza o método 
exibir
 para imprimi-lo na tela. Por exemplo, 3690
segundos   deve   ser   impresso   como   01h:01m:30s.   Uma   segunda   classe   denominada
HorarioTeste
  deve   ser   criada   para   testar   a   implementação   da   classe  
Horario
.  
Nessa
classe,   que   será   a   principal   (contém   o   método  
main
),   instancie   um   objeto   da   classe
Horario
 (hora = 10, minuto = 15, segundo = 43), chame o método 
exibir
 para esse objeto
e, em seguida, chame também o método   
formatar
Tempo 
com os seguintes parâmetros:
3690, 3521 e 59.
Exercício 3
Dada a classe 
Carrinho
 a seguir, realize as seguintes tarefas em Java:
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
}
a) Implemente uma classe que possa ser executada (contenha o método 
main
) e dentro
dela   exista   o   código   que   é   necessário  para   instanciar  um   objeto  da   classe  
Carrinho
  e
chamar   os   métodos   necessários   (incluindo   o   implementado   como   resposta   do   item   b)
para se ter uma saída no formato especificado a seguir:
Cliente: Luiz
Data da compra: 24/6/2017
Itens do carrinho: leite pão café queijo manteiga 
Obs.: Utilize uma estrutura de repetição para solicitar ao usuário os itens que irão compor
o carrinho de compra.
b) Apresente o código do método  
exibir 
da classe  
Carrinho
 para imprimir na tela a saída
de dados no formato apresentado anteriormente (no item a).   
c) Implemente um segundo construtor para a classe 
Carrinho
 que permita ao usuário da
classe definir a quantidade de produtos que serão incluídos no carrinho de compra. Desse
modo, o usuário poderá escolher entre criar um objeto Carrinho com 5 produtos ou com
qualquer   outra   quantidade   de   produtos   desejada.   Teste   esse   segundo   construtor
instanciando um novo objeto Carrinho com apenas 3 produtos.

