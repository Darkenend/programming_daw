package ejercicios;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class BrowserSelector extends JFrame implements ActionListener, ChangeListener {
    JCheckBox cb1, cb2, cb3;
    JButton button1, button2;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        /*
         *  TODO Test and delete if everything is okay
         */
        BrowserSelector op = new BrowserSelector();
        op.setVisible(true);
    }

    public BrowserSelector() {
        setLayout(null);
        cb1=new JCheckBox("Chrome");
        cb1.setBounds(10,10,150,30);
        add(cb1);
        cb2=new JCheckBox("Firefox");
        cb2.setBounds(10,50,150,30);
        add(cb2);
        cb3=new JCheckBox("Opera");
        cb3.setBounds(10,90,150,30);
        add(cb3);
        button1=new JButton("Confirmar");
        button1.setBounds(10,140,100,30);
        button1.addActionListener(this);
        add(button1);
        button2=new JButton("Salir");
        button2.setBounds(10, 180, 100, 30);
        button2.addActionListener(this);
        add(button2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            String p1 = "", p2 = "", p3 = "";
            if (cb1.isSelected()==true) p1="Nav1";
            if (cb2.isSelected()==true) p2="Nav2";
            if (cb3.isSelected()==true) p3="Nav3";
            String titulo = p1+" - "+p2+" + "+p3;
            setTitle(titulo);
        }
        if (e.getSource()==button2) System.exit(0);
    }

    public void stateChanged(ChangeEvent e) {
        if (cb1.isSelected()==true || cb2.isSelected()==true || cb3.isSelected() == true) button1.setEnabled(true);
        else button1.setEnabled(false);
    }
}

