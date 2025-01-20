package Ivan;

import figures.DefParabol;

public class Picture {
    public final Parabol P1; // ОБЪЯВЛЕНИЕ ГРАФИКОВ
    public final Line L;
    public final Line L2;

    public Picture(Parabol p1, Line l, Line l2) {
        P1 = p1;
        L2 = l2;
        L = l;
    }

    public SimpleColor getColor(double x, double y){ // ЛОГИКА РАСПРЕДЕЛЕНИЯ ЦВЕТОВ
            if (L2.DownLine(x, y) && L.UpLine(x, y) && P1.InParabola(x, y)){
                return SimpleColor.GREEN;
            } else if (x == 0 || y == 0) {
                return SimpleColor.BLACK;
            } else if (L.OnLine(x, y) || P1.OnParabola(x, y) || L2.OnLine(x, y)) {
                return SimpleColor.BLUE;

            } else if (L.UpLine(x, y) && !P1.InParabola(x, y) && L2.DownLine(x, y)){
                return SimpleColor.ORANGE;
            }
            else if (L.DownLine(x, y) && !P1.InParabola(x, y) && L2.DownLine(x, y)){
                return SimpleColor.YELLOW;
            } else if (P1.InParabola(x, y) && L.UpLine(x, y)) {
                return SimpleColor.ORANGE;
            }
            else if (!P1.InParabola(x, y) && L.UpLine(x, y) && L2.UpLine(x, y)) {
                return SimpleColor.GREEN;
            }
            return SimpleColor.GRAY;
    }
}
