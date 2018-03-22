/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package unitat5.apartat1.repte2;
import utilitats.arrays.CalculsArrayReals;

public class RegistreNotes {
    public static void main(String[] args) {
        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }
    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
//Per cridar els mètodes cal inicialitzar la classe que els conté
        CalculsArrayReals calculador = new CalculsArrayReals();
//Un cop fet, cal cridar-los usant com a prefix l'identificador
        double max = calculador.calcularMaxim(notes);
        double min = calculador.calcularMinim(notes);
        double mitjana = calculador.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}