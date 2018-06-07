package ex_2_liga;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Main {
    private static ArrayList<Liga> ligas = new ArrayList<>();
    private static boolean finished = false;
    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liga_id = 1, option;
        int league_id, team_id, jugador_id;
        System.out.println("Bienvenido al Sistema de Gestion de Ligas");
        while (!finished) {
            System.out.println("| Menu |");
            System.out.println("[1]. Añadir Liga");
            System.out.println("[2]. Comprobar Numero de equipos");
            System.out.println("[3]. Añadir Equipo a Liga");
            System.out.println("[4]. Añadir Jugador a Equipo");
            System.out.println("[5]. Jugadores en Equipo");
            System.out.println("[6]. Modificar Equipo");
            System.out.println("[7]. Imprimir estadisticas de equipo");
            System.out.println("[8]. Eliminar Equipo");
            System.out.println("[9]. Eliminar Jugador");
            System.out.println("[10]. Generar campeonato");
            System.out.println("[11]. Salir");
            System.out.println();
            System.out.println("Introduce tu opcion: [1-11]");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    ligas.add(new Liga(liga_id));
                    liga_id++;
                    break;
                case 2:
                    //Comprobar numero de equipos
                    int team_amount = 0;
                    for (Liga l:ligas) {
                        for (int i = 0; i < l.teams.size(); i++) {
                            team_amount++;
                        }
                    }
                    System.out.println("Numero de equipos: "+team_amount);
                    break;
                case 3:
                    //Añadir Equipo a Liga
                    league_id = checkLeague();
                    ligas.get(league_id).makeTeam(liga_id);
                    break;
                case 4:
                    //Añadir Jugador a Equipo
                    league_id = checkLeague();
                    team_id = checkTeam(league_id);
                    if (ligas.get(league_id).teams.get(team_id).players.size()<11) {
                        ligas.get(league_id).teams.get(team_id).makePlayer();
                    }
                    break;
                case 5:
                    //Mostrar Jugadores en Equipo
                    league_id = checkLeague();
                    team_id = checkTeam(league_id);
                    for (Jugador j:ligas.get(league_id).teams.get(team_id).players) {
                        System.out.println(j.getId()+" "+j.getNombre());
                    }
                    break;
                case 6:
                    //Modificar Equipo

                    break;
                case 7:
                    league_id = checkLeague();
                    team_id = checkTeam(league_id);
                    ligas.get(league_id).teams.get(team_id).printStats();
                    break;
                case 8:
                    league_id = checkLeague();
                    team_id = checkTeam(league_id);
                    ligas.get(league_id).teams.remove(team_id);
                    break;
                case 9:
                    league_id = checkLeague();
                    team_id = checkTeam(league_id);
                    jugador_id = checkPlayer(league_id, team_id);
                    ligas.get(league_id).teams.get(team_id).players.remove(jugador_id);
                    break;
                case 10:
                    league_id = checkLeague();
                    ligas.get(league_id).generateMatches();
                    ligas.get(league_id).setResults();
                    ligas.get(league_id).sortByPoints();
                    System.out.println("Puntos Liga "+ligas.get(league_id).getNombre());
                    for (Equipo e:ligas.get(league_id).teams) {
                        System.out.println(e.getNombre()+" "+e.getPuntos());
                    }
                    break;
                case 11:
                    finished = true;
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.err.println("Opcion no valida");
                    break;
            }
        }
    }

    private static int checkLeague() {
        Scanner keyboard = new Scanner(System.in);
        for (Liga l:ligas) {
            System.out.println(l.getId()+" "+l.getNombre());
        }
        System.out.println("Introduce el numero del id de la liga:");
        int id = keyboard.nextInt();
        return id-1;

    }

    private static int checkTeam(int league_id) {
        Scanner keyboard = new Scanner(System.in);
        for (Equipo p:ligas.get(league_id).teams) {
            System.out.println(p.getId()+" "+p.getNombre());
        }
        System.out.println("Introduce el numero del id del equipo:");
        int id = keyboard.nextInt();
        return id;
    }

    private static int checkPlayer(int league_id, int team_id) {
        Scanner keyboard = new Scanner(System.in);
        for (Jugador j:ligas.get(league_id).teams.get(team_id).players) {
            System.out.println(j.getId()+" "+j.getNombre());
        }
        System.out.println("Introduce el numero del id del jugador:");
        int id = keyboard.nextInt();
        return id;
    }
}
