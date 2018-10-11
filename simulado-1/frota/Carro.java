public class Carro extends Veiculo{
    private int capacidadePortaMalas;
    private int numeroPortas;
    
    public Carro(String marca, int ano, String cor, int capacidadePortaMalas, int numeroPortas) {
        super(marca,ano,cor);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.numeroPortas = numeroPortas;
    }
    
    public int getCapacidadePortaMalas() {
        return this.capacidadePortaMalas;
    }
    
    public int getNumeroPortas() {
        return this.numeroPortas;
    }
    
    @Override
   public String toString() {
       return "Marca: " + this.getMarca() +"\nAno: " + this.getAno() + "\nCor: " + this.getCor() 
               + "\nCapacidade do porta malas: " + this.capacidadePortaMalas + "\nNumero de portas: " + this.numeroPortas + '\n';
   }
}
