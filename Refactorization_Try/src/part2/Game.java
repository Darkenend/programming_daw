package part2;

public class Game {
    Player p;
    //...
    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")) {
            p.setX(p.getX()+1);
        }
        if (m.equalsIgnoreCase("Izquierda")) {
            p.setX(p.getX()-1);
        }
        if (m.equalsIgnoreCase("Arriba")) {
            p.setY(p.getY()+1);
        }
        if (m.equalsIgnoreCase("Abajo")) {
            p.setY(p.getY()-1);
        }
    }
}
