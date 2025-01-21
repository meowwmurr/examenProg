package tasks.Task3;

public class Picture {
    public final Parabol P1; // ОБЪЯВЛЕНИЕ ГРАФИКОВ
    public final DefParabol P2;
    public final Line L;
    public final Line L2;
    public final Rectangle R;

    public Picture(Parabol p1, DefParabol p2, Line l, Line l2, Rectangle r) {
        P1 = p1;
        P2 = p2;
        L = l;
        L2 = l2;
        R = r;
    }

    public SimpleColor getColor(double x, double y){ // ЛОГИКА РАСПРЕДЕЛЕНИЯ ЦВЕТОВ
        if(P2.InDParabola(x, y)){
            return SimpleColor.WHITEBLUE;
        } else if (P1.OnParabola(x, y) || P2.InDParabola(x, y) || L.OnLine(x, y) || L2.OnLine(x, y) || R.OnRectangle(x, y)) {
            return SimpleColor.BLUE;
        } else if (L.DownLine(x, y) && L2.UpLine(x, y)) {
            return SimpleColor.ORANGE;
        } else if (L.UpLine(x, y) && x < 1 && !P1.InParabola(x, y)) {
            return SimpleColor.WHITEBLUE;
        } else if (P1.InParabola(x, y) && x < 1 && x > -1) {
            return SimpleColor.YELLOW;
        } else if (P1.InParabola(x, y) && x > 1 && x < 3) {
            return SimpleColor.ORANGE;
        }
        else if(P1.InParabola(x, y)){
            return SimpleColor.WHITEBLUE;
        } else if (R.InRectangle(x, y) && y > 7) {
            return SimpleColor.GREEN;
        } else if (R.InRectangle(x, y) && y < 5) {
            return SimpleColor.WHITE;
        }
        return SimpleColor.GRAY;
    }
}
