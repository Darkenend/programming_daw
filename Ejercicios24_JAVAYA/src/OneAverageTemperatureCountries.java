/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class OneAverageTemperatureCountries {
	Scanner teclado = new Scanner(System.in);
	int major_case;
	float major_comparison;
	private String[] country=new String[4];
	private float[][] table=new float[4][3];
	private float[] average=new float[4];
	
	public void nameinput() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduce el nombre del pais "+(i+1)+":");
			country[i]=teclado.nextLine();
		}
	}
	
	public void tempinput() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Introduce la temperatura media de "+ country[i] + " en el mes " + (j+1));
				table[i][j]=teclado.nextFloat();
				while (table[i][j] < -273) {
					System.err.println("No se puede bajar del 0 Kelvin");
					System.out.println("Introduce la temperatura media de "+ country[i] + " en el mes " + (j+1));
					table[i][j]=teclado.nextFloat();
				}
			}
		}
	}
	
	public void countryaveragedisplay() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Temperaturas medias de "+country[i]+":");
			for (int j = 0; j < 3; j++) {
				System.out.println("Mes "+(j+1)+": "+table[i][j]);
			}
			System.out.println();
		}
	}
	
	public void totalaveragecountry() {
		float sum;
		for (int i = 0; i < 4; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {
				sum=sum+table[i][j];
			}
			average[i]=sum/3;
			System.out.println("La media de "+country[i]+" es: "+average[i]);
			System.out.println();
		}
	}
	
	public void displaytopaverage() {
		major_comparison=0;
		for (int i = 0; i < 4; i++) {
			if (average[i]>major_comparison) {
				major_comparison=average[i];
				major_case=i;
			}
		}
		System.out.println(country[major_case]+" tiene la mayor media de temperatura con: "+major_comparison);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneAverageTemperatureCountries operations=new OneAverageTemperatureCountries();
		operations.nameinput();
		operations.tempinput();
		operations.countryaveragedisplay();
		operations.totalaveragecountry();
		operations.displaytopaverage();
	}

}
