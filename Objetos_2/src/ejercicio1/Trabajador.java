package ejercicio1;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Trabajador {
    //Static public constants
    public static final int CAT_EMPLEADO = 0;
    public static final int CAT_ENCARGADO = 1;
    public static final int CAT_DIRECTIVO = 2;
    public static final int ANT_NOVATO = 0;
    public static final int ANT_MADURO = 1;
    public static final int ANT_EXPERTO = 2;

    //private attributes
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    /**
     * Building the Trabajador object, if there's any error,
     * it throws the IllegalArgumentException. We'll use:
     * @param nombre
     * @param edad
     * @param categoria
     * @param antiguedad
     */
    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
        if (comprobarCategoria(categoria) && comprobarAntiguedad(antiguedad)) {
            this.nombre = nombre;
            this.edad = edad;
            this.categoria = categoria;
            this.antiguedad = antiguedad;
        } else {
            throw new IllegalArgumentException("Categoria o antiguedad incorrectos");
        }
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        if (comprobarAntiguedad(antiguedad)) this.antiguedad=antiguedad;
        else throw new IllegalArgumentException("Antiguedad incorrecta");
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if (comprobarCategoria(categoria)) this.categoria=categoria;
        else throw new IllegalArgumentException("Antiguedad incorrecta");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSueldo() {
        double sueldo=0;
        switch (this.categoria) {
            case CAT_EMPLEADO:
                sueldo+=sueldo*0.15;
                break;
            case CAT_ENCARGADO:
                sueldo+=sueldo*0.35;
                break;
            case CAT_DIRECTIVO:
                sueldo+=sueldo*0.60;
                break;
        }
        switch (this.antiguedad) {
            case ANT_NOVATO:
                sueldo+=150;
                break;
            case ANT_MADURO:
                sueldo+=300;
                break;
            case ANT_EXPERTO:
                sueldo+=600;
                break;
        }
        return sueldo;
    }

    private boolean comprobarCategoria(int categoria) {
        boolean check=true;
        if (categoria<CAT_EMPLEADO || categoria>CAT_DIRECTIVO) check=false;
        return check;
    }

    private boolean comprobarAntiguedad(int antiguedad) {
        boolean check=true;
        if (antiguedad<ANT_NOVATO || antiguedad>ANT_EXPERTO) check=false;
        return check;
    }
}