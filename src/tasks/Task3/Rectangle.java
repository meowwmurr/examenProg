package tasks.Task3;

public class Rectangle {
    public boolean InRectangle(double x, double y){
        return Math.max(Math.abs(x - 2) / 1, Math.abs(y - 4.5) / 4.5) < 1;
    }

    public boolean OnRectangle(double x, double y){
        return Math.max(Math.abs(x - 2) / 1, Math.abs(y - 4.5) / 4.5) == 1;
    }
}