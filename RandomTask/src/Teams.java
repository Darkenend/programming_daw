/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Teams {
	Scanner teclado = new Scanner(System.in);
	int team_amount, contestants_amount;
	String[] teams, contestants;
	int[] contestant_team, team_contestant_amount;
	
	//Let's put on the constructor the amount of teams and contestants.
	public Teams() {
		System.out.println("Introduce el numero de equipos a introducir:");
		team_amount=teclado.nextInt();
		System.out.println("Introduce el numero de participantes:");
		contestants_amount=teclado.nextInt();
		//Check if the numbers are correct
		if (team_amount*2>contestants_amount) {
			System.err.println("El numero de equipos tiene que ser como maximo la mitad que el numero de participantes.");
			while (team_amount*2>contestants_amount) {
				System.out.println("Introduce el numero de equipos a introducir:");
				team_amount=teclado.nextInt();
				System.out.println("Introduce el numero de participantes:");
				contestants_amount=teclado.nextInt();
			}
		}
	}
	
	//Let's fit the arrays here
	public void ArraySize() {
		teams=new String[team_amount];
		team_contestant_amount= new int[team_amount];
		contestants=new String [contestants_amount];
		contestant_team=new int[contestants_amount];
	}
	
	//We're gonna do the Team Input in here, we'll separate the team and contestant input to simplify the code at the cost of making it longer
	public void TeamInput() {
		System.out.println();
		System.out.println("| Introduccion de nombres de equipo |");
		System.out.println();
		for (int i = 0; i < teams.length; i++) {
			System.out.println("Introduce el nombre del "+(i+1)+"º equipo:");
			teams[i]=teclado.nextLine();
		}
		System.out.println();
	}
	public void ContestantInput() {
		System.out.println();
		System.out.println("| Introduccion de nombres de participantes |");
		System.out.println();
		for (int i = 0; i < contestants.length; i++) {
			System.out.println("Introduce el nombre del "+(i+1)+"º participante:");
			contestants[i]=teclado.nextLine();
		}
		System.out.println();
	}
	
	//Let's pray to RNGEEZUS
	public void RNG() {
		for (int i = 0; i < contestants.length; i++) {
			double rngeezus_speak = Math.random();
			double splittinghelp1 = 1/team_amount;
			double splittinghelp2 = 1 / team_amount;
			for (int j = 0; j < team_amount; j++) {
				if (splittinghelp1<rngeezus_speak) {
					contestant_team[i]=j;
				} else {
					splittinghelp1=splittinghelp1+splittinghelp2;
				}
			}
			System.out.println("El participante "+contestants[i]+" esta en el equipo "+contestant_team[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
