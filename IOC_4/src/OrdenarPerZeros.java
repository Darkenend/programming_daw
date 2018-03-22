/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

public class OrdenarPerZeros {

	public static void main(String[] args) {
		OrdenarPerZeros programa = new OrdenarPerZeros();
		programa.inici();
	}

	public void inici() {
		int[] array = { 100, 2014, 12, 30, 302, 40020, 7009, 500000 };
		mostrarArray(array);
		ordenarZeros(array);
		mostrarArray(array);
	}

	public void mostrarArray(int[] array) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public void ordenarZeros(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int iZeros = comptarZeros(array[i]);
				int jZeros = comptarZeros(array[j]);
				if (iZeros < jZeros) {
					int canvi = array[i];
					array[i] = array[j];
					array[j] = canvi;
				}
			}
		}
	}

	public int comptarZeros(int valor) {
		int res = 0;
		while (valor > 0) {
			int num = valor % 10;
			valor = valor / 10;
			if (num == 0) {
				res++;
			}
		}
		return res;
	}
}