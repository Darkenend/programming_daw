import java.util.Scanner;

public class AplicacionCuentaBancaria {
    static Scanner keyboard = new Scanner(System.in);
    static CuentaBancaria cuenta;
    public static void main(String[] args) throws Exception {
        String titul,cc;
        boolean digi,volver;
        do{
            volver=false;
            System.out.println("Introduzca el nombre del titular de la cuenta:");
            titul=keyboard.nextLine();
            do{
                digi=true;
                System.out.println("Introduzca el Código de la Cuenta del Cliente (20 dígitos numéricos):");
                cc=keyboard.nextLine();
                for(int i=0;i<cc.length();i++){
                    if(cc.charAt(i)-48<0 || cc.charAt(i)-48>9) digi=false;
                }
                if(!digi) System.err.println("Sólo dígitos numéricos (20 dígitos)");
            }   while(cc.length()!=20 || !digi);
            cuenta=new CuentaBancaria(titul,cc);
        }   while(volver);
        int opcion=0;
        do{
            System.out.println("  menu de opciones  ");
            System.out.println("--------------------");
            System.out.println("1 - Ver el número de cuenta completo");
            System.out.println("2 - Ver el titular de la cuenta");
            System.out.println("3 - Ver el código de la entidad");
            System.out.println("4 - Ver el código de la oficina");
            System.out.println("5 - Ver el número de la cuenta");
            System.out.println("6 - Ver los dígitos de control de la cuenta");
            System.out.println("7 - Realizar un ingreso");
            System.out.println("8 - Retirar efectivo");
            System.out.println("9 - Consultar saldo");
            System.out.println("0 - Salir de la aplicación");
            System.out.println("--------------------");
            System.out.println("  Qué desea hacer?  ");
            opcion=Integer.parseInt(keyboard.nextLine());
            System.out.println("opcion:"+opcion);
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.printf("Nº de cuenta: %s-%s-%s-%s\n", cuenta.getEntidad(), cuenta.getOficina(), CuentaBancaria.obtenerDigitosControl(cuenta.getEntidad(), cuenta.getOficina(), cuenta.getNumCuenta()), cuenta.getNumCuenta());
                    break;
                case 2:
                    System.out.printf("Titular: %s\n", cuenta.getTitular());
                    break;
                case 3:
                    System.out.printf("Código de la entidad: %s\n", cuenta.getEntidad());
                    break;
                case 4:
                    System.out.printf("Código de la oficina %s\n", cuenta.getOficina());
                    break;
                case 5:
                    System.out.printf("Cuenta nº: %s\n", cuenta.getNumCuenta());
                    break;
                case 6:
                    System.out.printf("Dígitos de control: %s\n", CuentaBancaria.obtenerDigitosControl(cuenta.getEntidad(), cuenta.getOficina(), cuenta.getNumCuenta()));
                    break;
                case 7:
                    ingreso();
                    break;
                case 8:
                    retirada();
                    break;
                case 9:
                    System.out.printf("Saldo: %s €", cuenta.getSaldo());
                    break;
                default:
                    System.out.println("Introduzca un valor entre 0 y 9");
            }
        }while(opcion != 0);
    }

    public static void consulDatos(){
        System.out.println(cuenta.toString());
    }


    public static void ingreso() throws Exception{
        double dinero;
        System.out.println("¿Qué cantidad desea ingresar?");
        dinero=keyboard.nextDouble();
        while(dinero<0) {
            System.out.println("Solo numeros positivos");
            dinero=keyboard.nextDouble();
        }
        cuenta.ingresar(dinero);
    }

    public static void retirada() throws Exception {
        double dinero;
        System.out.println("¿Qué cantidad desea retirar?");
        dinero=keyboard.nextDouble();
        while(dinero<0) {
            System.out.println("Solo numeros positivos");
            dinero=keyboard.nextDouble();
        }
        cuenta.retirar(dinero);
    }
}
