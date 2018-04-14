package ejercicio2;

public class Trabajador {
	private String nombre;
	private int edad, categoria, antiguedad;
	public static int cat_empleado=0, cat_encargado=1, cat_directivo=2, ant_novato=0, ant_maduro=1, ant_experto=2;
	
	public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
	}
	
	public double calcularSueldo(int edad, int categoria, int antiguedad) {
		double sueldo = 607;
		double cat_bon;
		int ant_bon;
		switch (categoria) {
		case 0:
			cat_bon=0.15;
			break;
		case 1:
			cat_bon=0.35;
			break;
		case 2:
			cat_bon=0.60;
			break;
		default:
			cat_bon=0;
			break;
		}
		switch (antiguedad) {
		case 0:
			ant_bon=150;
			break;
		case 1:
			ant_bon=300;
			break;
		case 2:
			ant_bon=600;
			break;
		default:
			ant_bon=0;
			break;
		}
		sueldo=sueldo+(sueldo*cat_bon)+ant_bon;
		return sueldo;
	}
}
