package numeros;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Complejo {

    private double real;
    private double imaginaria;

    public Complejo(){
        this.real=0;
        this.imaginaria=0;
    }

    public Complejo(double preal, double pimag) {
        this.real=preal;
        this.imaginaria=pimag;
    }

    public double consulta_Real() {
        return real;
    }

    public double consulta_Imag() {
        return imaginaria;
    }

    public void cambia_Real(double real) {
        this.real=real;
    }

    public void cambia_Imag(double imag) {
        this.imaginaria=imag;
    }

    public String toString() {
        String complejo_string = String.valueOf(this.real)+"+"+String.valueOf(this.imaginaria)+"i";
        return complejo_string;
    }

    public void sumar(Complejo b) {
        double suma_r, suma_i;
        suma_r = this.real+b.real;
        suma_i = this.imaginaria+b.imaginaria;
        String result_string = String.valueOf(suma_r)+"+"+String.valueOf(suma_i)+"i";
        System.out.println("La suma de ambos numeros complejos es:");
        System.out.println(result_string);
    }
}
