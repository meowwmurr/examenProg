package tasks.Task3;

public class DefParabol {
    public double b;
    public double c;
    public double a;

    public DefParabol(double b, double c, double a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }

    public boolean InDParabola(double x, double y){
        return y < a * x*x + b * x + c ;
    }

    public boolean OnDParabola(double x, double y){
        return y == a * x*x + b * x + c;
    }
}