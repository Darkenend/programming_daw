package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class ComboBox extends JFrame implements ActionListener {
    private JLabel asklabel, combolabel;
    private JTextField askfield;
    private JComboBox<String> ultracombo;
    private JButton insert, exit;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        /*
         * TODO The program should work right now, test and delete if there's no issues
         */
        ComboBox op = new ComboBox();
        op.setBounds(0, 0, 800, 600);
        op.setVisible(true);
    }

    private ComboBox() {
        setLayout(null);
        asklabel = new JLabel("Nombre:");
        combolabel = new JLabel("Pais:");
        askfield = new JTextField();
        ultracombo = new JComboBox<>();
        insert = new JButton("Entrar");
        exit = new JButton("Salir");
        ultracombo.addItem("España");
        ultracombo.addItem("Francia");
        ultracombo.addItem("Inglaterra");
        ultracombo.addItem("Alemania");
        asklabel.setBounds(10, 10, 90, 30);
        askfield.setBounds(110, 10, 90, 30);
        combolabel.setBounds(10, 50, 90, 30);
        ultracombo.setBounds(110, 50, 90, 30);
        insert.setBounds(10, 360, 90, 30);
        exit.setBounds(300, 360, 90, 30);
        insert.addActionListener(this);
        exit.addActionListener(this);
        add(asklabel);
        add(combolabel);
        add(askfield);
        add(ultracombo);
        add(insert);
        add(exit);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==insert) {
            String part1=askfield.getText();
            String part3=(String)ultracombo.getSelectedItem();
            setTitle(part1+" - "+part3);
        }
        if (e.getSource()==exit) System.exit(0);
    }
}
