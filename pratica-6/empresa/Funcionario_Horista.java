public class Funcionario_Horista extends Funcionario{
    private double salarioHora;
    private double horasTrabalhadas;
    
    public Funcionario_Horista(String nome, String cpf, double salarioHora, double horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    

    @Override
    public double calcularSalario() {
        return salarioHora * horasTrabalhadas;
    }
}
