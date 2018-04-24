/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.3.0
 */

public class Ravenclaw extends Alumno {
    protected String book;

    public Ravenclaw() {
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
        this.house="Ravenclaw";
    }

    @Override
    public void setReply() {
        this.reply="¿A eso llamas deberes?";
    }

    @Override
    public void setProperty() {
        int temp = rng.nextInt(4);
        switch (temp) {
            case 0:
                this.book ="Metamorfosis";
                break;
            case 1:
                this.book ="Asi Habló Zaratustra";
                break;
            case 2:
                this.book ="Vida y Obra de John Carmack";
                break;
            case 3:
                this.book ="En C++ creemos";
                break;
            default:
                this.book ="Hablando de imbéciles";
                break;
        }
    }

    @Override
    public String getProperty() {
        return "Libro: "+this.book;
    }
}