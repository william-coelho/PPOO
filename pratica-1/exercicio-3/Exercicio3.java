import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int[] notas = new int[9];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            notas[i] = ler.nextInt();
        }
        int moda = 0;
        int contModa = 0;
        for (int nota = 0; nota <= 10; nota++) {
            int contNota = 0;
            for (int i = 0; i < 9; i++) {
                if(notas[i] == nota) {
                    contNota++;
                }
            }
            if (contNota > contModa) {
                moda = nota;
                contModa = contNota;
            }
        }
        System.out.println(moda);
    }
}
