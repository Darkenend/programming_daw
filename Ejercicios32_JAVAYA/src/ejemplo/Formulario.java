package ejemplo;

import javax.swing.*;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */
public class Formulario extends JFrame {
    /**
     * @param args Command line arguments
     * @param label1 Label Nº1
     * @param label2 Label Nº2
     */

    private JLabel label1, label2;

    public static void main(String[] args) {
        Formulario f = new Formulario();
        f.setBounds(0,0, 500, 300);
        f.setResizable(false);
        f.setVisible(true);
    }

    public Formulario() {
        setLayout(null);
        label1=new JLabel("Sistema de facturacion");
        label1.setBounds(10, 10, 100, 30);
        label2=new JLabel("Version 1.0.0");
        label2.setBounds(10, 100, 100, 30);
        add(label1);
        add(label2);
    }
}
