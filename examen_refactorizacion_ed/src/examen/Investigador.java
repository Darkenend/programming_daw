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
public class Investigador {
    public String nombre;
    public String apellido;
    public int numero;
    public double sueldo;
    public int antiguedad;
    public String campo;



    public Investigador(String nombre, String apellido, int numero,
                        double sueldo, int antiguedad, String campo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numero=numero;
        this.sueldo=sueldo;
        this. antiguedad=antiguedad;
        this.campo=campo;
    }

    public double pension(){
        double pension;
        if(antiguedad<30){
            pension=sueldo*antiguedad/50;
            return pension;
        }
        else{
            pension=sueldo*antiguedad/30;
            return pension;
        }
    }

    public void metodo2(){
        System.out.println("Mi nombre es: "+nombre+" "+apellido+" y tengo "
                +numero+" años.\n Soy investigador. Mi campo de investigación"
                + " es: "+campo+". Llevo "+antiguedad+" años dedicandome"
                + " a esto. Mi pensión será de: "+pension()+"\n");
    }


}
