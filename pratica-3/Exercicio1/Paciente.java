public class Paciente {
    private String nome;
    private double[] exames;
    private int contExames;
    Paciente(String nome, int qtdExames){
        this.nome = nome;
        this.exames = new double[qtdExames];
        this.contExames = 0;
    }
    
    String getNome(){
        return nome;
    }
    
    double getAmostra(int numAmostra){
        return exames[numAmostra-1];
    }
    
    double getMedia(){
        double soma = 0;
        for (int i = 0; i < exames.length; i++) {
            soma += exames[i];
        }
        return soma / exames.length;
    }
    
    String getDiagnostico(){
        double media = getMedia();
        if (media < 140){
            return "Glicemia normal";
        }
        else if(media <= 199){
            return "Risco de diabetes";
        }
        else {
            return "Diabetes Mellitus";
        }
    }
    
     void inserirAmostra(double amostra) {
        exames[contExames] = amostra;
        contExames++;
    }
}
