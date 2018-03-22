package ejercicio1;

import javax.swing.*;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ejercicio1 extends JFrame {
    private JLabel label1, label2, label3;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        Ejercicio1 op = new Ejercicio1();
        op.setBounds(0, 0, 300, 200);
        op.setVisible(true);
    }

    public Ejercicio1() {
        setLayout(null);
        label1=new JLabel("Rojo");
        label2=new JLabel("Verde");
        label3=new JLabel("Azul");
        label1.setBounds(10, 20, 100, 30);
        label2.setBounds(10, 60, 100, 30);
        label3.setBounds(10, 100, 100, 30);
        add(label1);
        add(label2);
        add(label3);
    }
}
