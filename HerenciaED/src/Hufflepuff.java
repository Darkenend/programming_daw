/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.3.0
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

    @Override
    public void setHouse() {
        this.house="Hufflepuff";
    }

    @Override
    public void setReply() {
        this.reply="¿Había deberes?";
    }

    @Override
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

    @Override
    public String getProperty() {
        return "Planta: "+this.plant;
    }
}
