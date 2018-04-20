/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.2.0
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

    public void generateFullName() {
        String[] names = {"Minato", "Sakura", "Tatsuki", "Riko", "Ren", "Aoi", "Haruta", "Wakana", "Haruki", "Yumiko"};
        String[] lastnames = {"Sato", "Suzuki", "Takahashi", "Tanaka", "Watanabe", "Ito", "Nakamura", "Kobayashi", "Yamamoto", "Kato"};
        generateName(names);
        generateLastname(lastnames);
    }

    public void setHouse() {
        this.house="Ravenclaw";
    }

    public void setReply() {
        this.reply="¿A eso llamas deberes?";
    }

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

    public String getProperty() {
        return "Libro: "+this.book;
    }
}