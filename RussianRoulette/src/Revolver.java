import java.util.Random;

/**
 * <h1>Revolver</h1>
 *
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Revolver {
    /*
        TODO Add documentation of each method
     */
    private int current_position;
    private int round_position;
    private int capacity;

    /**
     * Main constructor for the Revolver, it will randomly generate a
     * revolver of a capacity ranging from 5 to 8 rounds, and then it
     * will load it. This means that it generates an int with a maximum,
     * and then assigns a random value to the current_position
     * reffering to the slot in the revolver's drum where the round
     * is.
     */
    public Revolver() {
        Random rng = new Random();
        this.capacity= rng.nextInt(3)+5;
        System.out.println("You've found a revolver with a capacity of "+this.capacity+" rounds.");
        this.round_position= rng.nextInt(this.capacity)+1;
        this.current_position= rng.nextInt(this.capacity)+1;
        System.out.println("The revolver has been loaded. It has 1 round out of "+this.capacity+".");
    }

    /**
     * This method will compare where the hammer is aiming (current_position)
     * to the slot where the round is (round_position)
     * @return true if current_position==round_position (which would mean that
     * the revolver has shot a bullet and killed someone.)
     */
    public boolean disparar() {
        if (this.current_position==this.round_position) return true;
        else return false;
    }

    /**
     * This method will change the slot where the hammer is aiming (current_position)
     * to another one. There's two modes available, and the dev should un-comment and
     * re-comment code for it to switch between the "Roll between shots" and the
     * "Sequential shooting mode."
     */
    public void siguienteBala() {
        //Roll between shots
        //Random rng = new Random();
        //System.out.println("Let's give it a spin...");
        //this.current_position= rng.nextInt(this.capacity)+1;

        //Sequential Shooting
        if (this.current_position==this.capacity) this.current_position=1;
        else this.current_position=this.current_position+1;
    }

    /**
     * Method that takes all the information of the revolver into a string.
     * @return String that contains all the information about the revolver,
     * basically the current_position and the round_position of said revolver.
     */
    public String toString() {
        return "The revolver is gonna shoot the slot "+this.current_position+" and the bullet is in slot "+this.round_position+".";
    }
}
