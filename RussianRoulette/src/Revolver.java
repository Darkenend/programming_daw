import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Revolver {
    /*
        TODO Method "siguienteBala()", which changes position in the drum
        TODO Add documentation of each method
     */
    /**
     * This will give info about each class attribute
     * @param current_position This indicates which round slot is being shot off the revolver.
     * @param round_position This indicates in which slot the round is.
     * @param capacity This indicates the maximum capacity of the revolver
     */
    private int current_position;
    private int round_position;
    private int capacity;


    public Revolver() {
        Random rng = new Random();
        this.capacity= rng.nextInt(3)+5;
        System.out.println("You've found a revolver with a capacity of "+this.capacity+" rounds.");
        this.round_position= rng.nextInt(this.capacity)+1;
        this.current_position= rng.nextInt(this.capacity)+1;
        System.out.println("The revolver has been loaded. It has 1 round out of "+this.capacity+".");
    }

    public boolean disparar() {
        System.out.println("Aims at his head and...");
        if (this.current_position==this.round_position) return true;
        else return false;
    }

    public void siguienteBala() {
        //Swap comments between the two blocks to switch between the "Roll between shots" and "Sequential shooting"
        //Roll between shots
        //Random rng = new Random();
        //System.out.println("Let's give it a spin...");
        //this.current_position= rng.nextInt(this.capacity)+1;

        //Sequential Shooting
        if (this.current_position==this.capacity) this.current_position=1;
        else this.current_position=this.current_position+1;
    }

    public String toString() {
        return "The revolver is gonna shoot the slot "+this.current_position+" and the bullet is in slot "+this.round_position+".";
    }
}
