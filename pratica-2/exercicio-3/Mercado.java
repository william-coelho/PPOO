public class Mercado {

    public static void main(String[] args) {
    

        Carrinho car = new Carrinho("Luiz",24,3,2017);
        car.encherCarrinho();
        car.exibir();
        Carrinho car2 = new Carrinho("Carlos",4,5,2018,3);
        car2.encherCarrinho();
        car2.exibir();
    }
    
}
