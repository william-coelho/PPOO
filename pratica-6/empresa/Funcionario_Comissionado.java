public class Funcionario_Comissionado extends Funcionario {
        
    private int totalVendas;
    private double taxaComissao;
    
    public Funcionario_Comissionado(String nome, String cpf, int totalVendas, double taxaComissao) {
        super(nome,cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }
    public int getTotalVendas() {
        return totalVendas;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public double calcularSalario() {
        return totalVendas * taxaComissao;
    } 
}
