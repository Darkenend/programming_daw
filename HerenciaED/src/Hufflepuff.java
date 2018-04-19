/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.1.0
 */

public class Hufflepuff extends Alumno {

    public Hufflepuff() {
        System.out.print("Creando alumno...");
        generateFullName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
        System.out.print("...Completo");
        System.out.println();
        this.fav_sub="Lenguaje de Marcas y Runas";
    }

    public void generateFullName() {
        String[] names = {"Nikau", "Maia", "Ari", "Manaia", "Manaia", "Anahera", "Wiremu", "Ana", "Kauri", "Aroha"};
        String[] lastnames = {"Smith", "Wilson", "Williams", "Brown", "Taylor", "Jones", "Singh", "Wang", "Anderson", "Li"};
        generateName(names);
        generateLastname(lastnames);
    }

    public void setHouse() {
        this.house="Hufflepuff";
    }

    public void setReply() {
        this.reply="¿Había deberes?";
    }

    public void setProperty() {
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
