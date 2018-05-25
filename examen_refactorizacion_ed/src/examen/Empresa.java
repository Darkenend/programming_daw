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
//Made package-private to improve security
class Empresa {
    private String nombre;
    private String cif;
    private ArrayList <Conserje>aConserje;
    private ArrayList <Investigador>aInvestigador;
    private ArrayList <JefeDepartamento>aJefe;

    Empresa(String nombre, String cif){
        this.nombre=nombre;
        this.cif=cif;
        //Generified these ArrayList creations
        this.aConserje=new ArrayList<>();
        this.aInvestigador=new ArrayList<>();
        this.aJefe=new ArrayList<>();
    }
    //Deleted getters and setters that are never used.

    //Made package-private to improve security
    void anyadirConserje(Conserje conserje){
        aConserje.add(conserje);
    }
    void anyadirInvestigador(Investigador investigador){
        aInvestigador.add(investigador);
    }
    void anyadirJefe(JefeDepartamento jefe){
        aJefe.add(jefe);
    }
    void mostrarInformacion(){
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
