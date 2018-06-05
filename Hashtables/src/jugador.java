/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class jugador {
    public String nombre;
    public String dorsal;
    public String posicion;
    jugador(String nombre, String dorsal, String posicion){
        this.nombre=nombre;
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    public String getJugador(){
        return nombre+" "+posicion+" n "+dorsal;
    }
    public String getDorsal(){
        return dorsal;
    }
    public String getPosicion(){
        return posicion;
    }
}
