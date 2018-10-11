import java.util.ArrayList;
public class Frota {
    private ArrayList <Veiculo> frota;
    public Frota(){
        frota = new ArrayList();
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }
    
    public void exibirVeiculos() {
        for (Veiculo v:frota) {
            System.out.println(v);
        }
    }
    
}
