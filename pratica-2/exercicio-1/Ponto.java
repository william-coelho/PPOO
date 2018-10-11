public class Ponto {

private double x;
private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getPonto(){
        return "As coordenadas (x,y) do ponto são: (" + x +"; " + y+")";
    }

    public double calcularDistancia(double x2, double y2){
        return Math.sqrt((Math.pow(x - x2,2)) + (Math.pow(y - y2,2)));
    }
}
