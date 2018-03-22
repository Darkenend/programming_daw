import java.util.Scanner;
public class Banco {
	private static Scanner teclado;

		
    public static void main(String[] ar) {	
    	int aux=0;
    	boolean codigoBancoF=false,codigoSucursalF=false,numeroCuentaF=false,codigoPersonalF=false,opcionF=false;
    	teclado=new Scanner(System.in);
    	System.out.println(" [Bienvenido] ");
    	System.out.print("Inserte el codigo de su banco: ");
    	String codigoBanco=teclado.nextLine();
    	System.out.print("Inserte el codigo de su sucursal: ");
    	String codigoSucursal=teclado.nextLine();
    	System.out.print("Inserte su numero de cuenta: ");
    	String numeroCuenta=teclado.nextLine();
    	System.out.print("Inserte su codigo personal: ");
    	String codigoPersonal=teclado.nextLine();
    	System.out.println("Inserte la opción que desee: ");
    	System.out.println("Opción \"Talonarios\" ");
    	System.out.println("Opción \"Movimientos\" ");
    	System.out.print("Opción: ");
    	String opcion=teclado.nextLine();
    	if(codigoBanco.length()==0 || codigoBanco.length()==3) {
    		if(codigoBanco.length()==3) {
    		aux=Character.getNumericValue(codigoBanco.charAt(0));
    		} else {
    			aux=2;
    		}
    		if(aux>1) {
    			if(codigoSucursal.length()==4) {
    				aux=Character.getNumericValue(codigoSucursal.charAt(0));
    				if(aux>0) {
    					if(numeroCuenta.length()==5) {
    						if(codigoPersonal.length()==5) {
    							if(opcion.toLowerCase().equals("talonarios") || opcion.toLowerCase().equals("movimientos") || opcion.toLowerCase().equals("")) {
    							} else {
    								opcionF=true;
    							}
    						} else {
    							codigoPersonalF=true;
    						}
    					} else {
    						numeroCuentaF=true;
    					}
    				} else {
    					codigoSucursalF=true;
    				}
    			} else {
    				codigoSucursalF=true;
    			}
    		} else {
    			codigoBancoF=true;
    		}
    	} else {
    		codigoBancoF=true;
    	}
    	if(codigoBancoF==true) {
    		System.out.println("El codigo de banco es erróneo");
    	} else {
    		if(codigoSucursalF==true) {
    			System.out.println("El codigo de sucursal es erróneo");
    		} else {
    			if(numeroCuentaF==true) {
    				System.out.println("El número de cuenta es erróneo");
    			} else {
    				if(codigoPersonalF==true) {
    					System.out.println("El codigo personal es erróneo");
    				} else {
    					if(opcionF==true) {
    						System.out.println("La opción es errónea");
    					} else {
    						switch (opcion.toLowerCase()) {
    				    	case "talonarios":
    				    		System.out.println("Mostrando el talonario porfavor espere... ");
    				    		break;

    				    	case "movimientos":
    				    		System.out.println("Mostrando movimientos porfavor espere... ");
    				    		break;
    						
    						case "":
    							System.out.println("Mostrando el talonario porfavor espere... ");
    							System.out.println("Mostrando movimientos porfavor espere... ");
    							break;
    						}
    					}
    				}
    			}
    		}
    	}
    }
    	
}