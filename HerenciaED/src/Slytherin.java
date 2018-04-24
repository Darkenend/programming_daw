/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.3.0
 */

public class Slytherin extends Alumno {
    protected String weapon;

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

    @Override
    public void setHouse() {
        this.house="Slytherin";
    }

    @Override
    public void setReply() {
        this.reply="Torturé a un elfo doméstico para que los hiciera";
    }

    @Override
    public void setProperty() {
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

    @Override
    public String getProperty() {
        return "Arma: "+this.weapon;
    }
}
