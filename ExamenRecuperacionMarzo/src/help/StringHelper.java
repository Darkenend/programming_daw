package help;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class StringHelper {

    public String[] splitter(String given) {
        String[] result_created = given.split(", ");
        return result_created;
    }

}
