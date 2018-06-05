/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

import java.io.*;
import java.util.*;
public class hashtable {
    private static BufferedReader stdin= new BufferedReader (new InputStreamReader(System.in));
    public static short muestraMenu() throws IOException {
        short opcion;
        System.out.println("MENU");
        System.out.println("======");
        System.out.println("1.Insertar jugador");
        System.out.println("2.Borrar jugador");
        System.out.println("3.Listar jugadores");
        System.out.println("4.Salir");
        System.out.println("Elige una opción: ");
        opcion = Short.parseShort(stdin.readLine());
        return opcion;
    }
    public static jugador dameDatosJugador() throws IOException {
        System.out.print("Introduce el nombre del jugador ");
        String nombre=stdin.readLine();
        System.out.print("Introduce el dorsal del "+nombre+": ");
        String dorsal=stdin.readLine();
        System.out.print("Introduce la posicion del jugador "+nombre+": ");
        String posicion=stdin.readLine();
        return new jugador(nombre ,dorsal ,posicion);
    }
    public static void main(String[] args) throws IOException {
        Hashtable tabla = new Hashtable();
        short opcion=0;
        do{
            opcion=muestraMenu();
            switch(opcion){
                case 1:
                    jugador jug = dameDatosJugador();
                    DORSAL clave= new DORSAL(jug.getDorsal());
                    if(tabla.put(clave,jug)!=null){
                        System.out.println("E R R O R al introducir a "+jug.getJugador());
                    }
                    break;
                case 2:
                    System.out.println("Introduce el dorsal del jugador a borrar: ");
                    String dorsal= stdin.readLine();
                    DORSAL clave1= new DORSAL(dorsal);
                    if(tabla.remove(clave1)==null)
                        System.out.println("No existe el jugador con el dorsal: "+dorsal);
                    break;
                case 3:
                    Enumeration lista= tabla.elements();
                    while(lista.hasMoreElements())
                        System.out.println(((jugador)lista.nextElement()).getJugador());
                    break;
                default:
                    break;
            }
        }while(opcion!=4);
    }
}