/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.1.0
 */

public class Ravenclaw extends Alumno {

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
                this.property="Metamorfosis";
                break;
            case 1:
                this.property="Asi Habló Zaratustra";
                break;
            case 2:
                this.property="Vida y Obra de John Carmack";
                break;
            case 3:
                this.property="En C++ creemos";
                break;
            default:
                this.property="Hablando de imbéciles";
                break;
        }
    }
}