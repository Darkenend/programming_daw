package ex_1_personas;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String usuario;
    private String password;

    /**
     * Constructor de la clase Persona
     * @param in_id id a asignar
     * @param in_nombre nombre a asignar
     * @param in_edad edad a asignar
     * @param in_usuario usuario a asignar
     * @param in_password password a asignar
     */
    public Persona(int in_id, String in_nombre, int in_edad, String in_usuario, String in_password) {
        setId(in_id);
        setNombre(in_nombre);
        setEdad(in_edad);
        setUsuario(in_usuario);
        setPassword(in_password);
    }

    /**
     * El metodo "id" obtiene un atributo
     *
     * @return Atributo "id"
     */
    public int getId() {
        return id;
    }

    /**
     * El metodo "id" asigna un atributo
     *
     * @param id Atributo "id"
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     * El metodo "nombre" obtiene un atributo
     *
     * @return Atributo "nombre"
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El metodo "nombre" asigna un atributo
     *
     * @param nombre Atributo "nombre"
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El metodo "edad" obtiene un atributo
     *
     * @return Atributo "edad"
     */
    public int getEdad() {
        return edad;
    }

    /**
     * El metodo "edad" asigna un atributo
     *
     * @param edad Atributo "edad"
     */
    private void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * El metodo "usuario" obtiene un atributo
     *
     * @return Atributo "usuario"
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * El metodo "usuario" asigna un atributo
     *
     * @param usuario Atributo "usuario"
     */
    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * El metodo "password" obtiene un atributo
     *
     * @return Atributo "password"
     */
    public String getPassword() {
        return password;
    }

    /**
     * El metodo "password" asigna un atributo
     *
     * @param password Atributo "password"
     */
    private void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Persona - Id:"+getId()+" Nombre: "+getNombre()+" Edad: "+getEdad()+" Usuario: "+getUsuario()+" Contraseña: "+getPassword();
    }
}
