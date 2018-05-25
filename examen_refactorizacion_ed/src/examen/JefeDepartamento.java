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
public class JefeDepartamento {
    public String nombre;
    public String apellido;
    public int numero;
    public double sueldo;
    public int antiguedad;
    public String departamento;



    public JefeDepartamento(String nombre, String apellido, int numero,
                            double sueldo, int antiguedad, String departamento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numero=numero;
        this.sueldo=sueldo;
        this. antiguedad=antiguedad;
        this.departamento=departamento;
    }

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
