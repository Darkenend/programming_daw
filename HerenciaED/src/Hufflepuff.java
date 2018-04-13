import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Hufflepuff extends Alumno {
    protected String plant;

    public Hufflepuff() {
        generateName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
        this.fav_sub="Lenguaje de Marcas y Runas";
    }

    public void generateName() {
        Random rng = new Random();
        String[] names = {"Nikau", "Maia", "Ari", "Manaia", "Manaia", "Anahera", "Wiremu", "Ana", "Kauri", "Aroha"};
        String[] lastnames = {"Smith", "Wilson", "Williams", "Brown", "Taylor", "Jones", "Singh", "Wang", "Anderson", "Li"};
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
        this.house="Hufflepuff";
    }

    public void setReply() {
        this.reply="¿Había deberes?";
    }

    public void setProperty() {
        Random rng = new Random();
        int temp = rng.nextInt(4);
        switch (temp) {
            case 0:
                this.plant="Geranios";
                break;
            case 1:
                this.plant="Opio";
                break;
            case 2:
                this.plant="Alcachofas";
                break;
            case 3:
                this.plant="Plastico";
                break;
            default:
                this.plant="Cocaina";
                break;
        }
    }
}
