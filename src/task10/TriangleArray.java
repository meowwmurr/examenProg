package task10;

import java.util.ArrayList;

class TriangleArray {
    private ArrayList<Double> a, b, c;

    public TriangleArray(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getTriangleArea() {
        double x1 = a.get(0), y1 = a.get(1);
        double x2 = b.get(0), y2 = b.get(1);
        double x3 = c.get(0), y3 = c.get(1);

        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }
}