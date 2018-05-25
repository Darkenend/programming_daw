/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author Toni
 */
public class Empresa {
    private String nombre;
    private String cif;
    private ArrayList <Conserje>aConserje;
    private ArrayList <Investigador>aInvestigador;
    private ArrayList <JefeDepartamento>aJefe;

    public Empresa(String nombre, String cif){
        this.nombre=nombre;
        this.cif=cif;
        this.aConserje=new ArrayList();
        this.aInvestigador=new ArrayList();
        this.aJefe=new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    public void anyadirConserje(Conserje conserje){
        aConserje.add(conserje);
    }
    public void anyadirInvestigador(Investigador investigador){
        aInvestigador.add(investigador);
    }
    public void anyadirJefe(JefeDepartamento jefe){
        aJefe.add(jefe);
    }
    public void mostrarInformacion(){
        for(Conserje c : aConserje){
            c.metodo2();
        }
        for(Investigador inv:aInvestigador){
            inv.metodo2();
        }
        for(JefeDepartamento jd : aJefe){
            jd.metodo2();
        }
    }





}
