
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Cliente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoCliente mimarco = new MarcoCliente();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCliente extends JFrame {

    public MarcoCliente() {

        setBounds(600, 300, 280, 350);

        LaminaMarcoCliente milamina = new LaminaMarcoCliente();

        add(milamina);

        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel {

    public LaminaMarcoCliente() {

        JLabel texto = new JLabel("CLIENTE");

        add(texto);

        campo1 = new JTextField(20);

        add(campo1);

        miboton = new JButton("Enviar");

        EnviaTexto mievento = new EnviaTexto();

        miboton.addActionListener(mievento);

        add(miboton);

    }

    private class EnviaTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Socket misocket = new Socket("192.168.0.10", 9999);

                DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());

                flujo_salida.writeUTF(campo1.getText());

                flujo_salida.close();

            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);

                System.out.println(ex.getMessage());

            }

        }

    }

    private JTextField campo1;

    private JButton miboton;

}
