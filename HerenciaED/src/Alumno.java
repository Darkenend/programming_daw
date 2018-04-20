import java.util.Random;

/**
 * This is the parent class for each one of the classes based on each house.
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.2.0
 */

public abstract class Alumno {
    protected String name, lastname, house, fav_sub = "Entornos de Desarrollo mágicos", reply;
    protected int age;
    protected Random rng = new Random();

    /**
     * The method generateFullName will generate a String with a name and a last name at random from a selection of 10 each
     */
    protected abstract void generateFullName();

    /**
     * The methods generateName and generateLastname pick a string from a set of 10 with a pseudorandom
     */
    protected void generateName(String[] names) {
        int tempn = rng.nextInt(10);
        this.name = names[tempn];
    }
    protected void generateLastname(String[] lastname) {
        int templn = rng.nextInt(lastname.length);
        this.lastname = lastname[templn];
    }

    protected void generateAge() {
        this.age = rng.nextInt(6)+12;
    }

    //These are simple setters
    protected abstract void setReply();
    protected abstract void setHouse();
    protected abstract void setProperty();

    //Simple getters
    protected String getName() {
        return this.name;
    }
    protected String getLastname() {
        return this.lastname;
    }
    protected String getHouse() {
        return this.house;
    }
    protected String getFav_sub() {
        return this.fav_sub;
    }
    protected String getReply() {
        return this.reply;
    }
    protected abstract String getProperty();
    protected int getAge() {
        return this.age;
    }
    protected String getFullName() { return getName()+" "+getLastname(); }
}
