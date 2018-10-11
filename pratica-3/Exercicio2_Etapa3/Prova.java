import java.util.Scanner;

public class Prova {
    private Questao[] questao = new Questao[5];
    Prova() {
        for (int i = 0; i < questao.length; i++) {
            questao[i] = new Questao();
        }
    }
    public void aplicar() {
        for (int i = 0; i < 5; i++) {
            int tentativa = 0;
            System.out.println(questao[i].getEnunciado());
            Scanner ler = new Scanner(System.in);
            int resposta = ler.nextInt();
            tentativa++;
            boolean errou = false;
            while(!questao[i].acertou(resposta)) {
                System.out.println("Infelizmente voce errou!");
                System.out.println("Você tentou " + tentativa + " vez(es) e errou a questão.");
                System.out.printf("%s","Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = ler.nextInt();
                tentativa++;
                errou = true;
            }
            System.out.println("Muito bem, voce acertou!");
            System.out.println("Você tentou " + tentativa + " vez(es) e acertou a questão.\n");
        }
    }
}

