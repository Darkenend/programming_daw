/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.2.0
 */

public class Gryffindor extends Alumno {
    protected String pet;

    public Gryffindor() {
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
        String[] names = {"Noah", "Emma", "William", "Olivia", "James", "Ava", "Jacob", "Sophia", "Elijah", "Isabella"};
        String[] lastnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson"};
        generateName(names);
        generateLastname(lastnames);
    }


    public void setReply() {
        this.reply="Por supuesto los he hecho";
    }

    public void setHouse() {
        this.house="Gryffindor";
    }

    public void setProperty() {
        int temp = rng.nextInt(4);
        switch (temp) {
            case 0:
                this.pet ="Buho";
                break;
            case 1:
                this.pet ="Rata";
                break;
            case 2:
                this.pet ="Gato";
                break;
            case 3:
                this.pet ="Conejo";
                break;
            default:
                this.pet ="Paloma";
                break;
        }
    }

    public String getProperty() {
        return "Mascota: "+this.pet;
    }
}
