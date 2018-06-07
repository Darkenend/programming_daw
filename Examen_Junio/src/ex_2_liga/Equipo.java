package ex_2_liga;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Equipo {
    ArrayList<Jugador> players = new ArrayList<>();
    private boolean deEmpresa;
    private String comarca, nombre, localidad, estadio;
    private int id, win = 0, lost = 0, draw = 0, goal_pos = 0, goal_neg = 0, puntos = 0;

    public Equipo(int in_id, String in_comarca, String in_nombre, boolean in_deEmpresa) {
        Random rng = new Random();
        setId(in_id);
        setComarca(in_comarca);
        setNombre(in_nombre);
        setDeEmpresa(in_deEmpresa);
        setLocalidad(getNombre()+" de la Frontera");
        setEstadio(getComarca()+" "+getLocalidad());
        for (int i = 0; i < 7; i++) {
            makePlayer();
        }
        if (deEmpresa) {
            System.out.println(comprobarEquipoEmpresa());
        }
    }

    private String comprobarEquipoEmpresa() {
        int xd = 0;
        for (Jugador p: players) {
            if (p.isTrabajador()) xd++;
        }
        if (xd >= players.size()/2) {
            return "Cumple con la normativa de equipos de empresas";
        } else {
            return "No cumple con la normativa de equipos de empresas";
        }
    }

    void makePlayer() {
        Random rng = new Random();
        int x = rng.nextInt(2);
        if (x == 0) {
            players.add(new Jugador(players.size()+1, "Jugador"+players.size()+1, "jugador"+players.size()+1, "password"+players.size()+1, false));
        } else {
            players.add(new Jugador(players.size()+1, "Jugador"+players.size()+1, "jugador"+players.size()+1, "password"+players.size()+1, true));
        }
    }

    void printStats() {
        System.out.println("Victorias: "+getWin());
        System.out.println("Derrotas: "+getLost());
        System.out.println("Empates: "+getDraw());
        System.out.println("Goles a favor:"+getGoal_pos());
        System.out.println("Goles en contra"+getGoal_neg());
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeEmpresa() {
        return deEmpresa;
    }

    public void setDeEmpresa(boolean deEmpresa) {
        this.deEmpresa = deEmpresa;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getGoal_pos() {
        return goal_pos;
    }

    public void setGoal_pos(int goal_pos) {
        this.goal_pos = goal_pos;
    }

    public int getGoal_neg() {
        return goal_neg;
    }

    public void setGoal_neg(int goal_neg) {
        this.goal_neg = goal_neg;
    }
}
