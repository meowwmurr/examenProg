package tasks;

public class Rectangle {
    public boolean InRectangle(double x, double y){
        return Math.max(Math.abs(x - 3) / 4, Math.abs(y + 0.5) / 4.5) < 1;
    }

    public boolean OnRectangle(double x, double y){
        return Math.max(Math.abs(x - 3) / 4, Math.abs(y + 0.5) / 4.5) == 1;
    }
}