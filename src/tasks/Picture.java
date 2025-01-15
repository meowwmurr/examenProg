package tasks;

import figures.DefParabol;

public class Picture {
    public final Parabol P1; // ОБЪЯВЛЕНИЕ ГРАФИКОВ
    public final Line L;

    public Picture(Parabol p1, Line l) {
        P1 = p1;
        L = l;
    }

    public SimpleColor getColor(double x, double y){ // ЛОГИКА РАСПРЕДЕЛЕНИЯ ЦВЕТОВ
        if(P1.InParabola(x, y) && L.UpLine(x, y) && x < 0 && y < 0){
            return SimpleColor.GREEN;
        }
        else if (P1.OnParabola(x, y) || L.OnLine(x, y) || (x == -3 && (y >= -4 && y <= 0) || (y == -4 && (x >= -3 && x <= 0)))) {
            return SimpleColor.BLUE;
        }
        else if (P1.InParabola(x, y) && L.DownLine(x, y) && y < 0 && x > -3){
            return SimpleColor.WHITE;
        }
        else if(L.UpLine(x, y) && !P1.InParabola(x, y) && x < 0 && y > -4){
            return SimpleColor.ORANGE;
        }
        else if(P1.InParabola(x, y) && x != 0 && y != 0){
            return SimpleColor.WHITEBLUE;
        }
        else if(L.UpLine(x, y) && y > 0){
            return SimpleColor.WHITEBLUE;
        }
        else if(x > -3 && (y > -4 && y < 0) || (y == -4 && (x > -3 && x < 0))){
            return SimpleColor.GREEN;
        }
        else if(x == 0 || y == 0){return SimpleColor.BLACK;}
        return SimpleColor.GREEN;
    }
}
