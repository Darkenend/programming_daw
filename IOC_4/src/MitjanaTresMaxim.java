import java.util.Scanner;

public class MitjanaTresMaxim {

	public static void main(String[] args) {
		MitjanaTresMaxim programa = new MitjanaTresMaxim();
		programa.inici();
	}

	public void inici() {
		System.out.println("Escriu deu enters separats per espais: ");
		int[] array = llegirArrayEntersTeclat();
		double res = calculaMitjanaTresMaxims(array);
		System.out.println("La mitjana dels tres valors més grans és " + res);
	}

	public int[] llegirArrayEntersTeclat() {
		Scanner lector = new Scanner(System.in);
		int[] llistaEnters = new int[10];
		int entersLlegits = 0;
		while (entersLlegits < 10) {
			if (lector.hasNextInt()) {
				llistaEnters[entersLlegits] = lector.nextInt();
				entersLlegits++;
			} else {
				lector.next();
			}
		}
		lector.nextLine();
		lector.close();
		return llistaEnters;
	}

	public double calculaMitjanaTresMaxims(int[] array) {
		ordenarDescendent(array);
		return (array[0] + array[1] + array[2]) / 3;
	}

	public void ordenarDescendent(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int canvi = array[i];
					array[i] = array[j];
					array[j] = canvi;
				}
			}
		}
	}

}
