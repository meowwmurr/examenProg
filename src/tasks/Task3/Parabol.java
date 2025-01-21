package tasks.Task3;

public class Parabol {
    public double x0;
    public double y0;
    public double a;

    public Parabol(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean InParabola(double x, double y){
        return x > a * Math.pow(y - y0, 2) + x0;
    }

    public boolean OnParabola(double x, double y){
        return x == a * Math.pow(y - y0, 2) + x0;
    }
}
// график горизонт параболы - x = a * (y -y0)^2 + x0