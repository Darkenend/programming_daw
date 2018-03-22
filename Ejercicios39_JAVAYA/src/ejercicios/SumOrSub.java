package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class SumOrSub extends JFrame implements ActionListener {
    private JTextField tf1, tf2;
    private ButtonGroup bg;
    private JRadioButton radio1, radio2;
    private JButton boton1, boton2;
    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        SumOrSub op = new SumOrSub();
        op.setBounds(0,0, 600, 400);
        op.setVisible(true);
    }

    public SumOrSub() {
        setLayout(null);
        tf1=new JTextField();
        tf1.setBounds(10,10,100,30);
        add(tf1);
        tf2=new JTextField();
        tf2.setBounds(10,60,100,30);
        add(tf2);
        bg=new ButtonGroup();
        radio1=new JRadioButton("Sumar");
        radio1.setBounds(10,110,100,30);
        bg.add(radio1);
        add(radio1);
        radio2=new JRadioButton("Restar");
        radio2.setBounds(10,140,100,30);
        bg.add(radio2);
        add(radio2);
        boton1=new JButton("Operar");
        boton1.setBounds(10,180,100,30);
        boton1.addActionListener(this);
        add(boton1);
        boton2=new JButton("Salir");
        boton2.setBounds(10, 220, 100, 30);
        boton2.addActionListener(this);
        add(boton2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton2) System.exit(0);
        if (e.getSource()==boton1) {
            int v1=Integer.parseInt(tf1.getText());
            int v2=Integer.parseInt(tf2.getText());
            if (radio1.isSelected()) setTitle(String.valueOf(v1+v2));
            if (radio2.isSelected()) setTitle(String.valueOf(v1-v2));
        }
    }
}
