/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Toni
 */
public class JefeDepartamento extends Persona {
    //Removed repeated variables, made the variable private because it's not used from outside this class
    private String departamento;

    //Made package-private to improve security
    JefeDepartamento(String nombre, String apellido, int numero,
                            double sueldo, int antiguedad, String departamento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numero=numero;
        this.sueldo=sueldo;
        this. antiguedad=antiguedad;
        this.departamento=departamento;
    }

    //Added @Override to keep it sure that the "JefeDepartamento" keeps his status that's different to "Investigador", "Conserje" or other possible future classes
    @Override
    public double pension(){
        double pension;
        if(antiguedad<30){
            pension=sueldo*antiguedad/5;
            return pension;
        }
        else{
            pension=sueldo*antiguedad/2;
            return pension;
        }
    }

    public void metodo2(){
        System.out.println("Mi nombre es: "+nombre+" "+apellido+" y tengo "
                +numero+" años.\nSoy el jefe del departamento: "+departamento+
                ". Llevo "+antiguedad+" años dedicandome a esto."
                + "Mi pensión será de: "+pension()+"\n");
    }

}
