/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.3.0
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

    @Override
    public void setReply() {
        this.reply="Por supuesto los he hecho";
    }

    @Override
    public void setHouse() {
        this.house="Gryffindor";
    }

    @Override
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

    @Override
    public String getProperty() {
        return "Mascota: "+this.pet;
    }
}
