import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class ArrayListEx1 {
    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amy");
        names.add("Bob");
        names.add("Cindy");
        names.add("David");
        names.add(0, "Nick");
        names.add(1, "Mike");
        names.remove(3);
        System.out.println(names);
        System.out.println(names.size());
        for (String i :
                names
                ) {
            System.out.println("Nombre: " + i);
        }
        Iterator<String> iterador = names.iterator();
        while (iterador.hasNext()) {
            System.out.println("Nombre mediante iterador: "+iterador.next());
        }
        ListIterator<String> lista = names.listIterator();
        System.out.println("Hacia adelante con ListIterator");
        while (lista.hasNext()) {
            System.out.println(lista.next());
        }
        System.out.println("Hacia atras con ListIterator");
        while (lista.hasPrevious()) {
            System.out.println(lista.previous());
        }
    }
}
