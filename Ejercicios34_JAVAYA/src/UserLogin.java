import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class UserLogin extends JFrame implements ActionListener {

    private JTextField textfield1,textfield2;
    private JButton boton1;

    /**
     * @param args Command line argument
     */

    public static void main(String[] args) {
        UserLogin op = new UserLogin();
        op.setBounds(0, 0, 600, 400);
        op.setVisible(true);
    }

    private UserLogin() {
        setLayout(null);
        JLabel label1 = new JLabel("Nombre:");
        label1.setBounds(10,10,100,30);
        add(label1);
        JLabel label2 = new JLabel("Clave:");
        label2.setBounds(10,50,100,30);
        add(label2);
        textfield1=new JTextField();
        textfield1.setBounds(130,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(130,50,100,30);
        add(textfield2);
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("juan") && cad2.equals("abc123")) setTitle("Correcto");
            else setTitle("Incorrecto");
        }
    }
}
