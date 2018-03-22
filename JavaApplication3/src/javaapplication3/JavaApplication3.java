/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ED
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double media=0,totalEntrada=0,totalValido=0,minimo=0,maximo=0,suma=0;
        int i=0;
        double valor[]=rellenarArray();
        
        System.out.println("Introduzca el mínimo");
        minimo=Double.parseDouble(teclado.nextLine());
        System.out.println("Introduzca el máximo");
         maximo=Double.parseDouble(teclado.nextLine());
        
         
         
         while(i<100
                 && valor[i]!=-999 ){
             totalEntrada++;
             if(valor[i]>=minimo &&
                     valor[i]<=maximo){
                 totalValido++;
                 suma+=valor[i];
             }
             i++;                        
         }
         if (totalValido<0){
             media=suma/totalValido;
         }
         else{
             media=-999;
         }
         System.out.println("media: "+ media+ "\nTotal de números válidos: "+totalEntrada+"\nTotal de valores válidos: "+totalValido);
         
    }

    public static double[] rellenarArray(){
        double num[]=new double[100];
        for(int i=0;i<num.length;i++){
            num[i]=(Math.random()-0.5)*2000;
        }
       
        return num;
    }
}
