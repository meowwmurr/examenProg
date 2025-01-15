package tasks;

public class Picture {
    public final DefParabol P1; // ОБЪЯВЛЕНИЕ ГРАФИКОВ
    public final DefParabol P2;
    public final Circle C1;
    public final Circle C2;
    public final Rectangle R;



    public Picture(tasks.DefParabol p1, tasks.DefParabol p2, Circle c1, Circle c2, Rectangle r) {
        P1 = p1;
        P2 = p2;
        C1 = c1;
        C2 = c2;
        R = r;
    }


    public SimpleColor getColor(double x, double y) { // ЛОГИКА РАСПРЕДЕЛЕНИЯ ЦВЕТОВ
        if (P1.InDParabola(x, y) && !P2.InDParabola(x, y)) {
            return SimpleColor.WHITE;
        } else if (P1.InDParabola(x, y) && P2.InDParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        else if (P1.OnDParabola(x, y) || P2.OnDParabola(x, y) || R.OnRectangle(x, y) || C1.OnCircle(x, y) || C2.OnCircle(x, y)) {
            return SimpleColor.BLUE;
        }
        else if (R.InRectangle(x, y) && !C1.InCircle(x, y)) {
            return SimpleColor.GRAY;
        }
        else if (C1.InCircle(x, y) && R.InRectangle(x, y)) {
            return SimpleColor.WHITE;
        } else if (C2.InCircle(x, y)) {
            return SimpleColor.GRAY;
        }
        else if(x == 0 || y == 0){return SimpleColor.BLACK;}
        return SimpleColor.WHITEBLUE;
    }
}
