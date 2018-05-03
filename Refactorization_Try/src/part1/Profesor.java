package part1;

import java.util.List;

public class Profesor extends Persona {
    String nombre;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
    }

    public void printTodaLaInformacion() {
        printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }
}
