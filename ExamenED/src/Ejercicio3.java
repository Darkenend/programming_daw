import java.util.Scanner;

/**
 *
 * @author Toni
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0;
        double c=0;
        String trabaja;
        double g=1492.2,h=1685.3,n=1750.32, d=1.0,f=1.0,r=0.0;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Dime tu puesto de trabajo");
        trabaja=teclado.next();

        f= g*Math.log(n);

        System.out.println("Dime tu sueldo");
        a=teclado.nextInt();
        System.out.println("Dime los años que llevas trabajados");
        b=teclado.nextInt();


        int e=0;
        while(e<500){
            f=f*3/2;
            for(int i=0;i<g;i++){
                d=(int) Math.pow(d, 2);

                d=d*(int) Math.pow(g,3);
                d=(d/((int)Math.pow(g,2)*h)+1);
                d=Math.sqrt(d);
                d=d+1;
                r=r+d;
            }
            e++;

        }
        if((!trabaja.toLowerCase().equals("jefe"))&&(!trabaja.toLowerCase().equals("programador"))){
            System.out.println("error puesto de trabajo erroneo");
        }else{
            if(g>f){
                r=23;
            }
            if(a<4){
                r=22;
            }
            if(b<5){
                c=a+(a*Math.abs(b)*5/100);
                System.out.println("Tu nuevo sueldo es:"+c+"€");
                for(int i=0;i<g;i++){
                    d=(int) Math.pow(d, 2);

                    d=d*(int) Math.pow(g,3);
                    d=(d/((int)Math.pow(g,2)*h)+1);
                    d=Math.sqrt(d);
                    d=d+1;
                    r=r+d;
                }
            }else{
                for(int i=0;i<g;i++){
                    d=(int) Math.pow(d, 2);

                    d=d*(int) Math.pow(g,3);
                    d=(d/((int)Math.pow(g,2)*h)+1);
                    d=Math.sqrt(d);
                    d=d+1;
                    r=r+d;
                }
                c=a-(a*Math.abs(b)*10/100);
                System.out.println("Tu nuevo sueldo es:"+c+"€");
            }
        }

    }

}
