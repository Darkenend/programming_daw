import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Hufflepuff extends Alumno {

    public Hufflepuff() {
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
                this.property="Geranios";
                break;
            case 1:
                this.property="Opio";
                break;
            case 2:
                this.property="Alcachofas";
                break;
            case 3:
                this.property="Plastico";
                break;
            default:
                this.property="Cocaina";
                break;
        }
    }
}
