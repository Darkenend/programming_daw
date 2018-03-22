package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class ButtonMaleFemale extends JFrame implements ActionListener {
    JButton MButton, FButton, boton1;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        ButtonMaleFemale test=new ButtonMaleFemale();
        test.setBounds(0, 0, 450, 350);
        test.setVisible(true);
    }

    public ButtonMaleFemale() {
        setLayout(null);
        //Exit button
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);

        //Male button
        MButton = new JButton("Varon");
        MButton.setBounds(10, 100, 90, 30);
        add(MButton);
        MButton.addActionListener(this);

        //Female button
        FButton = new JButton("Mujer");
        FButton.setBounds(110, 100, 90, 30);
        add(FButton);
        FButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) System.exit(0);
        if (e.getSource() == MButton ) setTitle("Varón");
        if (e.getSource() == FButton ) setTitle("Mujer");
    }
}