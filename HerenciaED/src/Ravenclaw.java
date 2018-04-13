import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ravenclaw extends Alumno {
    protected String book;

    public Ravenclaw() {
        generateName();
        generateAge();
        setReply();
        setHouse();
        setProperty();
    }

    public void generateName() {
        Random rng = new Random();
        String[] names = {"Minato", "Sakura", "Tatsuki", "Riko", "Ren", "Aoi", "Haruta", "Wakana", "Haruki", "Yumiko"};
        String[] lastnames = {"Sato", "Suzuki", "Takahashi", "Tanaka", "Watanabe", "Ito", "Nakamura", "Kobayashi", "Yamamoto", "Kato"};
        int temp = rng.nextInt(10);
        this.name = names[temp];
        temp = rng.nextInt(10);
        this.lastname = lastnames[temp];
        temp = rng.nextInt(10);
        this.lastname = this.lastname+" "+lastnames[temp];
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
                this.book="Metamorfosis";
                break;
            case 1:
                this.book="Asi Habló Zaratustra";
                break;
            case 2:
                this.book="Vida y Obra de John Carmack";
                break;
            case 3:
                this.book="En C++ creemos";
                break;
            default:
                this.book="Hablando de imbéciles";
                break;
        }
    }
}
