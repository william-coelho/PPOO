public class HorarioTeste {

    public static void main(String[] args) {
        Horario horario = new Horario (10,15,43);
        horario.exibir();
        horario.formatarTempo(3690);
        horario.formatarTempo(3521);
        horario.formatarTempo(59);
    }    
}
