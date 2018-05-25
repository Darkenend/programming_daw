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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa=new Empresa("Entornos S.L.","12345678c");
        Conserje conserjeA=new Conserje("Pedro","Pérez",30,900,15,"mañana");
        Conserje conserjeB=new Conserje("Cecilia","Gutierrez",40,1000,20,"tarde");
        Investigador investigadorA=new Investigador("Jose","Bort",39,400,15,"Teoría de cuerdas");
        Investigador investigadorB=new Investigador("Javier","Bort",54,400,25,"física cuántica");
        Investigador investigadorC=new Investigador("Salvador","Bort",24,400,2,"Vida alienígena");
        Investigador investigadorD=new Investigador("Elena","Bort",60,400,35,"Entornos de desarrollo avanzados");
        JefeDepartamento jefe=new JefeDepartamento("Antonio", "López",100,100,100,"Entornos");


        miEmpresa.anyadirConserje(conserjeA);
        miEmpresa.anyadirConserje(conserjeB);

        miEmpresa.anyadirInvestigador(investigadorA);
        miEmpresa.anyadirInvestigador(investigadorB);
        miEmpresa.anyadirInvestigador(investigadorC);
        miEmpresa.anyadirInvestigador(investigadorD);


        miEmpresa.anyadirJefe(jefe);


        miEmpresa.mostrarInformacion();
    }

}
