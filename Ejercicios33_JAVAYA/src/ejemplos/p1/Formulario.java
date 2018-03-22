package ejemplos.p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Formulario extends JFrame implements ActionListener {
    JButton button1;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setBounds(0, 0, 450, 350);
        form.setVisible(true);
    }

    public Formulario() {
        setLayout(null);
        button1 = new JButton("Finalizar");
        button1.setBounds(300, 250, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1 ) {
            System.exit(0);
        }
    }
}
