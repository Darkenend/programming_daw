/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.2.0
 */

public class Hufflepuff extends Alumno {
    protected String plant;

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
                this.plant ="Geranios";
                break;
            case 1:
                this.plant ="Opio";
                break;
            case 2:
                this.plant ="Alcachofas";
                break;
            case 3:
                this.plant ="Plastico";
                break;
            default:
                this.plant ="Cocaina";
                break;
        }
    }

    public String getProperty() {
        return "Planta: "+this.plant;
    }
}
