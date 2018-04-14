import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ravenclaw extends Alumno {

    public Ravenclaw() {
        System.out.print("Creando alumno... 1");
        generateName();
        System.out.print("...2");
        generateAge();
        System.out.print("...3");
        setReply();
        System.out.print("...4");
        setHouse();
        System.out.print("...5");
        setProperty();
        System.out.print("...Completo");
        System.out.println();
    }

    public void generateName() {
        Random rng = new Random();
        String[] names = {"Minato", "Sakura", "Tatsuki", "Riko", "Ren", "Aoi", "Haruta", "Wakana", "Haruki", "Yumiko"};
        String[] lastnames = {"Sato", "Suzuki", "Takahashi", "Tanaka", "Watanabe", "Ito", "Nakamura", "Kobayashi", "Yamamoto", "Kato"};
        int temp = rng.nextInt(10);
        this.name = names[temp];
        temp = rng.nextInt(10);
        this.lastname = lastnames[temp];
    }

    public void generateAge() {
        Random rng = new Random();
        this.age = rng.nextInt(6)+12;
    }

    public void setHouse() {
        this.house="Hufflepuff";
    }

    public void setReply() {
        this.reply="¿A eso llamas deberes?";
    }

    public void setProperty() {
        Random rng = new Random();
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
