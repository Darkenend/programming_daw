package ejemplos.e1;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Formulario extends JFrame implements ChangeListener{
    private JCheckBox check1,check2,check3;
    public Formulario() {
        setLayout(null);
        check1=new JCheckBox("Inglés");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        check2=new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);
        check3=new JCheckBox("Alemán");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
    }

    public void stateChanged(ChangeEvent e){
        String cad="";
        if (check1.isSelected()==true) {
            cad=cad+"Inglés-";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Francés-";
        }
        if (check3.isSelected()==true) {
            cad=cad+"Alemán-";
        }
        setTitle(cad);
    }

    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }
}
