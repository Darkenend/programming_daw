package ex_2_liga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Liga {
    private int id;
    ArrayList<Equipo> teams = new ArrayList<>();
    ArrayList<Partido> matches = new ArrayList<>();
    private String nombre, comarca;

    public Liga(int in_id) {
        Scanner keyboard = new Scanner(System.in);
        String lea_name, lea_com;
        System.out.println("Introduce el nombre de la liga:");
        lea_name=keyboard.next();
        System.out.println("Introduce la comarca:");
        lea_com=keyboard.next();
        setId(in_id);
        setNombre(lea_name);
        setComarca(lea_com);
        for (int i = 0; i < 4; i++) {
            makeTeam(i);
        }
    }

    void makeTeam(int i) {
        Scanner keyboard = new Scanner(System.in);
        String team_name, comp;
        boolean is_company = false, valid = false;
        System.out.println("Introduce el nombre del equipo "+(i+1)+":");
        team_name = keyboard.next();
        System.out.println("Es un equipo de una empresa? [S/N]");
        comp = keyboard.next();
        if (comp.equalsIgnoreCase("s") || comp.equalsIgnoreCase("n")) {
            valid = true;
        }
        while (!valid) {
            System.out.println("Es un equipo de una empresa? [S/N]");
            comp = keyboard.next();
            if (comp.equalsIgnoreCase("s") || comp.equalsIgnoreCase("n")) {
                valid = true;
            }
        }
        if (comp.equalsIgnoreCase("s")) {
            is_company = true;
        }
        teams.add(new Equipo(i+1, getComarca(), team_name, is_company));
    }

    void generateMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (i != j) {
                    matches.add(new Partido(teams.get(i), teams.get(j)));
                }
            }
        }
    }

    void setResults() {
        for (Partido p:matches) {
            if (p.getGol_local()>p.getGol_visitante()){
                //Victoria local
                teams.get(p.getLocal().getId()).setPuntos(teams.get(p.getLocal().getId()).getPuntos()+3);
            }
            if (p.getGol_local()==p.getGol_visitante()) {
                //Empate
                teams.get(p.getLocal().getId()).setPuntos(teams.get(p.getLocal().getId()).getPuntos()+1);
                teams.get(p.getVisitante().getId()).setPuntos(teams.get(p.getVisitante().getId()).getPuntos()+1);
            }
            if (p.getGol_local()<p.getGol_visitante()) {
                //Victoria Visitante
                teams.get(p.getVisitante().getId()).setPuntos(teams.get(p.getVisitante().getId()).getPuntos()+3);
            }
        }
    }

    void sortByPoints() {
        teams.sort(Comparator.comparingInt(Equipo::getPuntos));
        Collections.reverse(teams);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }
}
