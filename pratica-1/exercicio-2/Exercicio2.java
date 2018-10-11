import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int velRubens;
        int velAirton;
        Scanner ler = new Scanner(System.in);
        velRubens = ler.nextInt();
        velAirton = ler.nextInt();
        
       int distRubens = 15000;
       int distAirton = 14880;
       int dif = 120;
       while(dif > 0) {
           distRubens += velRubens;
           distAirton += velAirton;
           dif = distRubens - distAirton;
       }
       int volta = distAirton / 1500;
        System.out.println(volta+ 1);
    }
    
}
