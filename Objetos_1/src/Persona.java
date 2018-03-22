/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Persona {

    String nombre;
    int edad;
    float altura;

    String consulta_Nombre() {
        return nombre;
    }

     void cambia_Nombre(String nom) {
        nombre=nom;
    }
}
