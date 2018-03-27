import java.util.Random;

/**
 * <h1>Jugador</h1>
 *
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Jugador {
    /*
        TODO Add documentation of methods
     */
    private int id;
    private String nombre;
    private boolean vivo;

    /**
     * Jugador constructor, which basically needs the two parameters to be completely created,
     * "vivo" is always true by default, meaning that the player is alive.
     * @param i_id The id will come from the outside, but not input by the players.
     * @param i_nombre The name will come from the outside, and will be player input.
     */
    public Jugador(int i_id, String i_nombre) {
        System.out.println("Loading player...");
        this.id=i_id;
        this.nombre=i_nombre;
        this.vivo=true;
        System.out.println("Player "+this.nombre+" with ID "+this.id+" has been created.");
    }

    public boolean disparar(Revolver r) {
        Random rng = new Random();
        int rngeezuswills = rng.nextInt(4);
        if (r.disparar()) {
            if (this.nombre=="Darkenend") {
                System.out.println("BUENO CARALLO");
            } else {
                System.out.println("You died.");
            }
            switch (rngeezuswills) {
                case 0:
                    System.out.println("And we see a bit of pink mist, and everyone wipes their faces, just in case.");
                    break;
                case 1:
                    System.out.println("BANG, whoops, "+this.nombre+"is dead.");
                    break;
                case 2:
                    System.out.println("Press F to pay respects.\nWait wrong game.");
                    break;
                case 3:
                    System.out.println("BOOM, HEADSHOT");
                    break;
            }
            this.vivo=false;
            return false;
        }
        else {
            if (this.nombre=="Darkenend") {
                System.out.println("VAS MORRER");
            }
            switch (rngeezuswills) {
                case 0:
                    System.out.println("CLICK, you ain't dead yet!");
                    break;
                case 1:
                    System.out.println(this.nombre+"is one lucky pal.");
                    break;
                case 2:
                    System.out.println("HEY, YOU'RE NOT DEAD!");
                    break;
                case 3:
                    System.out.println("You still got it under control, right?");
                    break;
            }
            return true;
        }
    }
}
