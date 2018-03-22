package ejercicios.e1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class ResolutionChanger extends JFrame implements ActionListener {
    private static int x = 800;
    private static int y = 600;
    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem item1, item2;
    private JTextField res1, res2;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        /*
         *  TODO Implement Formulary
         *  TODO Add Listeners to buttons
         *  TODO Set default resolution through introduction
         */
        ResolutionChanger op = new ResolutionChanger();
        op.setBounds(0, 0, x, y);
        op.setVisible(true);
    }

    public ResolutionChanger() {
        setLayout(null);
        menubar=new JMenuBar();
        setJMenuBar(menubar);
        menu1=new JMenu("Opciones");
        menubar.add(menu1);
        item1=new JMenuItem("Redimensionar ventana");
        menu1.add(item1);
        item1.addActionListener(this);
        item2=new JMenuItem("Salir");
        menu1.add(item2);
        item2.addActionListener(this);
        res1=new JTextField();
        res1.setBounds(10,10,100,30);
        add(res1);
        res2=new JTextField();
        res2.setBounds(10,50,100,30);
        add(res2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            x = Integer.parseInt(res1.getText());
            y = Integer.parseInt(res2.getText());
            setSize(x, y);
        }
        if (e.getSource() == item2) System.exit(0);
    }
}
