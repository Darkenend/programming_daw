import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Slytherin extends Alumno {
    protected String weapon;

    public Slytherin() {
        generateName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
    }

    public void generateName() {
        Random rng = new Random();
        String[] names = {"Ben", "Mia", "Jonas", "Emma", "Leon", "Hanna", "Elias", "Sophia", "Finn", "Anna"};
        String[] lastnames = {"", "", "", "", "", "", "", "", "", ""};
        int temp = rng.nextInt(10);
        this.name = names[temp];
        temp = rng.nextInt(10);
        this.lastname = lastnames[temp];
        temp = rng.nextInt(10);
        this.lastname = this.lastname+" "+lastnames[temp];
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
                this.weapon="Pistola";
                break;
            case 1:
                this.weapon="Escopeta";
                break;
            case 2:
                this.weapon="Subfusil";
                break;
            case 3:
                this.weapon="Rifle de Asalto";
                break;
            default:
                this.weapon="BFG";
                break;
        }
    }
}
