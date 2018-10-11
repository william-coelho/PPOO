public class Veiculo {
    private String marca;
    private int ano;
    private String cor;
    
    public Veiculo(String marca, int ano, String cor) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public int getAno() {
        return this.ano;
    }
    public String getCor() {
        return this.cor;
    }
    
}
