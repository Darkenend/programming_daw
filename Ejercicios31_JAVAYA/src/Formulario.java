/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */
import javax.swing.*;

public class Formulario extends JFrame {
    /**
     *
     * @param ar Command line arguments.
     */
    public static void main(String[] ar) {
        Formulario f=new Formulario();
        f.setBounds(10,10,1024,800);
        f.setVisible(true);
        f.setResizable(false);
    }

    public Formulario() {
        setLayout(null);
    }
}
