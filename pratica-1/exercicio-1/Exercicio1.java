import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int consumo;
        Scanner ler = new Scanner(System.in);
        consumo = ler.nextInt();
        double valor;
        double taxa;
        if (consumo <= 10) {
            valor = 5;
            taxa = 0;
        }
        else if (consumo <= 100){
            valor = consumo * 0.6;
            taxa = 2;
        }
        else {
            int resto = consumo - 100;
            valor = 100 * 0.6;
            if (resto <= 50)
                valor += resto * 0.85;
            else {
                valor += 50 * 0.85;
                resto = resto - 50;
                valor += resto * 1.20;
            }    
            taxa = 3;
        }
        System.out.println(valor + taxa);
    }
    
}
