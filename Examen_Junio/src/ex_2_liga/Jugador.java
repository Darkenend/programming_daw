package ex_2_liga;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Jugador {
    private String nombre, username, password;
    private int id, goals = 0, red = 0, yellow = 0;
    private boolean trabajador;

    public Jugador(int in_id, String in_nombre, String in_username, String in_password, boolean in_trabajador) {
        setId(in_id);
        setNombre(in_nombre);
        setUsername(in_username);
        setPassword(in_password);
        setTrabajador(in_trabajador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public boolean isTrabajador() {
        return trabajador;
    }

    public void setTrabajador(boolean trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" - Usuario: "+getUsername();
    }
}
