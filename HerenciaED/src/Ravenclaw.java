import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ravenclaw extends Alumno {

    public void generateName() {
        Random rng = new Random();
        String[] names = new String[10];
        String[] lastnames = new String[10];
        int temp = rng.nextInt(10);
        name = names[temp];
        temp = rng.nextInt(10);
        lastname = lastnames[temp];
        temp = rng.nextInt(10);
        lastname = lastname+" "+lastnames[temp];
    }

    public void generateAge() {
        Random rng = new Random();
        age = rng.nextInt(6)+12;
    }
}
