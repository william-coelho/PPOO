public class PontoTeste {
    public static void main( String[] args){
        Ponto umPonto = new Ponto(1.5,2.5);
        System.out.println(umPonto.getPonto());
        System.out.printf("A distância entre os pontos é: %.2f", umPonto.calcularDistancia(3.5,5.5));
    }
}

