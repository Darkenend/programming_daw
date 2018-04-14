import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Gryffindor extends Alumno {

    public Gryffindor() {
        System.out.print("Creando alumno... 1");
        generateName();
        System.out.print("...2");
        generateAge();
        System.out.print("...3");
        setReply();
        System.out.print("...4");
        setHouse();
        System.out.print("...5");
        setProperty();
        System.out.print("...Completo");
        System.out.println();
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
                this.property="Buho";
                break;
            case 1:
                this.property="Rata";
                break;
            case 2:
                this.property="Gato";
                break;
            case 3:
                this.property="Conejo";
                break;
            default:
                this.property="Paloma";
                break;
        }
    }
}
