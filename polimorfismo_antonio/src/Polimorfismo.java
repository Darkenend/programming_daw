import java.util.Scanner;

public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso primero=obtenerCurso();
        primero.crearAlumnos();
        primero.listarAlumnos();
        }
    public static Curso obtenerCurso(){
        int g,s,h,r=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos de Gryffindor tiene tu escuela?");
        g=teclado.nextInt();
        System.out.println("¿Cuantos alumnos de Slytherin tiene tu escuela?");
        s=teclado.nextInt();
        System.out.println("¿Cuantos alumnos de Hufflepuff tiene tu escuela?");
        h=teclado.nextInt();
        System.out.println("¿Cuantos alumnos de Ravenclaw tiene tu escuela?");
        r=teclado.nextInt();
        
        
        
        return new Curso(g,s,h,r);
    }
    
}
