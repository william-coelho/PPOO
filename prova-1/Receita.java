public class Receita extends MovimentacaoFinanceira{
    private String cpf;
    private String formaRecebimento;

    public Receita(int dia, int mes, int ano, String horario, double valor, String cpf, String formaRecebimento) {
        super(dia, mes, ano, horario, valor);
        this.cpf = cpf;
        this.formaRecebimento = formaRecebimento;
    }
    
    @Override
    public double calcularImposto() {
       double taxa = this.getTaxaFixa(this.getMes());
       double parcela = 0;
       if(formaRecebimento.equals("Dinheiro")) {
           parcela = this.getValor() * 0.015;
       }
       else if(formaRecebimento.equals("Débito")) {
           parcela = this.getValor() * 0.03;
       }
       
       else if(formaRecebimento.equals("Crédito")) {
           parcela = this.getValor() * 0.04;
       }
       
       return taxa + parcela;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + cpf + "\nForma de pagamento: " + formaRecebimento + "\nImposto a pagar: " + calcularImposto() + '\n';
    }
}
