package examen;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

//Created abstract class to remove repeated variables and methods
public abstract class Persona {
    String nombre;
    String apellido;
    int numero;
    double sueldo;
    int antiguedad;

    //Added abstract method to make sure that this method (Tells the person's data) is always created
    public abstract void metodo2();

    //Made "pension" method to avoid duplicated code
    public double pension() {
        double pension;
        if(antiguedad<30){
            pension=sueldo*antiguedad/50;
            return pension;
        }
        else{
            pension=sueldo*antiguedad/30;
            return pension;
        }
    }
}
