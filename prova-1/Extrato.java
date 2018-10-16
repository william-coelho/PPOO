import java.util.ArrayList;
public class Extrato {
    private ArrayList<MovimentacaoFinanceira> movimentacoes;
    
    public Extrato() {
        movimentacoes = new ArrayList<MovimentacaoFinanceira>();
    }
    
    public void novaMovimentacao(MovimentacaoFinanceira movimentacao) {
        movimentacoes.add(movimentacao);
    }
    
    @Override
    public String toString() {
        String ex = "";
        for(MovimentacaoFinanceira m:movimentacoes) {
            if(m instanceof Receita){
                ex += ((Receita)m).toString();
            }
            else if(m instanceof Despesa) {
                ex +=((Despesa)m).toString();
            }
            ex += '\n';
        }
        return ex;
    }
}
