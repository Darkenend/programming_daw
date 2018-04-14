/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

public class DiaSetmana {

	public static void main(String[] args) {
		DiaSetmana op = new DiaSetmana();
		op.start();
	}
	
	public void start() {
		String name = day(3);
		System.out.println("El dia de la setmana es "+name);
		name = day(5);
		System.out.println("El dia de la setmana es "+name);
		name = day(273);
		System.out.println("El dia de la setmana es "+name);
	}

	public String day(int daynum) {
		String dayname = "El dia no s'ha especificat";
		switch (daynum) {
		case 1:
			dayname="dilluns";
			break;
		case 2:
			dayname="dimarts";
			break;
		case 3:
			dayname="dimecres";
			break;
		case 4:
			dayname="dijous";
			break;
		case 5:
			dayname="divendres";
			break;
		case 6:
			dayname="dissabte";
			break;
		case 7:
			dayname="diumenge";
		default:
			dayname="no existeix";
			break;
		}
		return dayname;
	}
}
