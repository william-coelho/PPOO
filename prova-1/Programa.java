public class Programa {

    public static void main(String[] args) {
        Extrato extrato = new Extrato();
        //Instanciando movimentações
        MovimentacaoFinanceira mov1 = new Despesa(8,2,2018,"15:30",500.0,"012.345.678/0001-10",3);
        MovimentacaoFinanceira mov2 = new Despesa(9,4,2018,"13:49",700.0,"765.432.109/0001-10",1);
        MovimentacaoFinanceira mov3 = new Receita(10,6,2018,"09:28",1500.0,"123.456.789-0","Débito");
        MovimentacaoFinanceira mov4 = new Receita(11,10,2018,"17:00",1000.0,"098.765.432-1","Dinheiro");
        //Adicionando movimentações ao extrato
        extrato.novaMovimentacao(mov1);
        extrato.novaMovimentacao(mov2);
        extrato.novaMovimentacao(mov3);
        extrato.novaMovimentacao(mov4);
        //Imprimindo extrato
        System.out.println(extrato);
    }
    
}
