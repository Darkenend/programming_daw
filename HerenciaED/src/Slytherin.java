import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Slytherin extends Alumno {

    public Slytherin() {
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
        String[] names = {"Ben", "Mia", "Jonas", "Emma", "Leon", "Hanna", "Elias", "Sophia", "Finn", "Anna"};
        String[] lastnames = {"Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Mayer", "Wagner", "Becker", "Schulz", "Hoffmann"};
        int temp = rng.nextInt(10);
        this.name = names[temp];
        temp = rng.nextInt(10);
        this.lastname = lastnames[temp];
    }

    public void generateAge() {
        Random rng = new Random();
        this.age = rng.nextInt(6)+12;
    }

    public void setHouse() {
        this.house="Slytherin";
    }

    public void setReply() {
        this.reply="Torturé a un elfo doméstico para que los hiciera";
    }

    public void setProperty() {
        Random rng = new Random();
        int temp = rng.nextInt(4);
        switch (temp) {
            case 0:
                this.property="Pistola";
                break;
            case 1:
                this.property="Escopeta";
                break;
            case 2:
                this.property="Subfusil";
                break;
            case 3:
                this.property="Rifle de Asalto";
                break;
            default:
                this.property="BFG";
                break;
        }
    }
}
