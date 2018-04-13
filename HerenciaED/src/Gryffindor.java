import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Gryffindor extends Alumno {
    private String mascota;

    public Gryffindor() {
        generateName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
    }

    public void generateName() {
        Random rng = new Random();
        String[] names = {"Noah", "Emma", "William", "Olivia", "James", "Ava", "Jacob", "Sophia", "Elijah", "Isabella"};
        String[] lastnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson"};
        int temp = rng.nextInt(10);
        this.name = names[temp];
        temp = rng.nextInt(names.length);
        this.lastname = lastnames[temp];
    }

    public void generateAge() {
        Random rng = new Random();
        this.age = rng.nextInt(6)+12;
    }

    public void setReply() {
        this.reply="Por supuesto los he hecho";
    }

    public void setHouse() {
        this.house="Gryffindor";
    }

    public void setProperty() {
        Random rng = new Random();
        int temp = rng.nextInt(4);
        switch (temp) {
            case 0:
                this.mascota="Buho";
                break;
            case 1:
                this.mascota="Rata";
                break;
            case 2:
                this.mascota="Gato";
                break;
            case 3:
                this.mascota="Conejo";
                break;
            default:
                this.mascota="Paloma";
                break;
        }
    }
}
