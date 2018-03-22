package utilidad;

public class StringHelper {
	
	public int stringWordCounter(String frase) {
		String[] array_frase=frase.split(" ");
		int length = array_frase.length;
		return length;
	}
	
	public String[] stringWordSeparator(String frase) {
		String[] array_frase=frase.split(" ");
		return array_frase;
	}

	public String[] extendArray(String[] string_array) {
	    String[] temp = string_array.clone();
        string_array = new String[temp.length+1];
        System.arraycopy(temp, 0, string_array, 0, temp.length);
	    return string_array;
    }
}
