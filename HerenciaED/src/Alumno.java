/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public abstract class Alumno {
    /*
        TODO Implement attributes
        TODO Implement methods
        TODO Figure more stuff
     */
    protected String name, lastname, house, fav_sub = "Entornos de Desarrollo mágicos", reply;
    protected int age;

    protected abstract void generateName();
    protected abstract void generateAge();
    protected abstract void setReply();
    protected abstract void setHouse();
    protected abstract void setProperty();
}
