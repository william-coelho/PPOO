public class Despesa extends MovimentacaoFinanceira{
    private String cnpj;
    private int numParcelas;

    public Despesa(int dia, int mes, int ano, String horario, double valor, String cnpj, int numParcelas) {
        super(dia, mes, ano, horario, valor);
        this.cnpj = cnpj;
        this.numParcelas = numParcelas;
    }
    
    @Override
    public double calcularImposto() {
        double taxa = this.getTaxaFixa(this.getMes());
        double parcela = numParcelas * (this.getValor() * 0.01);
        return taxa + parcela;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj + "\nNúmero de Parcelas: " + numParcelas + "\nImposto a pagar: " + calcularImposto() + '\n';
    }
}
