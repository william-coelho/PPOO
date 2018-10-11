public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void exibir(){
        System.out.printf("%02d%s%02d%s%02d%s%n", hora ,"h:",  minuto ,"m:" ,segundo ,"s");
    }
    
    public void formatarTempo(int segundos){
        int resto;
        this.hora = segundos / 3600;
        resto = segundos % 3600;
        this.minuto = resto / 60;
        resto %= 60;
        this.segundo = resto;
        this.exibir();
    }
    
}
