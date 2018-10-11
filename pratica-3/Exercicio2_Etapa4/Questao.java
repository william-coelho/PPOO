import java.util.Random;

public class Questao {
    private String enunciado;
    private int gabarito;
    private int idQuestao;
    private static int cont = 0;
    public Questao() {
        Random num = new Random();
        int num1 = num.nextInt(9);
        int num2 = num.nextInt(9);
        enunciado = "Quanto e " + num1 + " * " + num2 + "?";
        gabarito = num1 * num2;
        cont ++;
        idQuestao = cont;
    }
    
    public String getEnunciado() {
        return "Questao " + getIdQuestao() + '\n' + enunciado;
    }
    
    public boolean acertou(int resposta) {
        return resposta == gabarito;
    }
    
    public int getIdQuestao() {
        return idQuestao;
    }
}

