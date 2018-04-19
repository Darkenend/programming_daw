/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.1.0
 */

public class Slytherin extends Alumno {

    public Slytherin() {
        System.out.print("Creando alumno...");
        generateFullName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
        System.out.print("...Completo");
        System.out.println();
    }

    public void generateFullName() {
        String[] names = {"Ben", "Mia", "Jonas", "Emma", "Leon", "Hanna", "Elias", "Sophia", "Finn", "Anna"};
        String[] lastnames = {"Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Mayer", "Wagner", "Becker", "Schulz", "Hoffmann"};
        generateName(names);
        generateLastname(lastnames);
    }

    public void setHouse() {
        this.house="Slytherin";
    }

    public void setReply() {
        this.reply="Torturé a un elfo doméstico para que los hiciera";
    }

    public void setProperty() {
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
