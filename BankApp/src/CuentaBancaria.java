/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class CuentaBancaria {
    /*
        TODO Create all methods
        TODO Implement functionality for all methods
        TODO Complete Complex Constructor (Line 27)
        TODO Create Simple Constructor (Line 44)
     */
    /*
    This class sorts out how a bank account works
    from the class AplicacionCuentaBancaria.
     */
    private String titular;
    private float saldo;
    private int entidad;
    private int oficina;
    private int numCuenta;
    public static int maxSize=100;
    public static int minSize=10;

    //Complex constructor
    public CuentaBancaria(String titular, String entidad, String oficina, String DC, String numCuenta) {
        boolean validation = true;
        String DC_calc=calcularDigitosControl(entidad, oficina, numCuenta);
        if (titular.length()<minSize || titular.length()>maxSize) validation=false;
        if (entidad.length()!=4) validation=false;
        if (oficina.length()!=4) validation=false;
        if (DC.length()!=2) validation=false;
        if (DC!=DC_calc) validation=false;
        if (validation) {
            this.saldo=0;
        } else {
            //IllegalArgumentException here
        }

    }

    //Simple constructor
    public CuentaBancaria(String titular, String CCC) {
        this.saldo=0;
    }


    //This method calculates the control digits of the bank account, to ensure security
    public String calcularDigitosControl(String h1, String h2, String h3) {
        //Condig is the result, help 1 to 3 are the int adaptation of h 1 to 3 to operate with it, we return the result.
        int condig, help1 = Integer.parseInt(h1), help2 = Integer.parseInt(h2), help3 = Integer.parseInt(h3);
        condig = help1+help2+help3;
        String result = String.valueOf(condig);
        return result;
    }

    //Methods that print a set of data
    public void printTitular() {
        System.out.println("El titular de la cuenta es: "+this.titular);
    }
    public void printSaldo() {
        System.out.println("Tu saldo es: "+this.saldo);
    }
    public void printNumCuenta() {
        System.out.println("Numero de cuenta: "+this.numCuenta);
    }
    public void printEntidad() {
        System.out.println("Tu entidad es: "+this.entidad);
    }
    public void printOficina() {
        System.out.println("Tu oficina es: "+this.oficina);
    }

    //Method to change the holder of the account
    public void setTitular(String new_titular) {
        if (titular.length()<minSize||titular.length()>maxSize) {
            //IllegalArgumentException here
        } else {
            this.titular = new_titular;
        }
    }

    //Methods to input and deduct money
    public void moneyIncrement(float payment) {
        this.saldo=this.saldo+payment;
    }
    public void moneyDecrease(float payment) {
        this.saldo=this.saldo-payment;
    }

    //Method to validate the CCC
    public static boolean comprobarCCC(String CCC){
        boolean res = false;
        return res;
    }

    //Method that returns a string with all the shit
    public String toString(String titular, String CCC, String saldo) {
        String res = "La cuenta "+CCC+" con titular "+titular+" dispone de un saldo de "+saldo;
        return res;
    }
}
