package ex_2_liga;

import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Partido {
    private Equipo local, visitante;
    private String localidad, estadio;
    private int gol_local, gol_visitante;

    public Partido(Equipo in_local, Equipo in_visitante) {
        Random rng = new Random();
        setLocal(in_local);
        setVisitante(in_visitante);
        setLocalidad(local.getLocalidad());
        setEstadio(local.getEstadio());
        setGol_local(rng.nextInt(11));
        setGol_visitante(rng.nextInt(11));
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
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

    public int getGol_local() {
        return gol_local;
    }

    public void setGol_local(int gol_local) {
        this.gol_local = gol_local;
    }

    public int getGol_visitante() {
        return gol_visitante;
    }

    public void setGol_visitante(int gol_visitante) {
        this.gol_visitante = gol_visitante;
    }
}
