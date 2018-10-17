
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
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

        setBounds(600, 300, 350, 400);

        LaminaMarcoCliente milamina = new LaminaMarcoCliente();

        add(milamina);

        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel implements Runnable {

    public LaminaMarcoCliente() {

        nick = new JTextField(5);

        add(nick);

        JLabel texto = new JLabel("-Chat-");

        add(texto);

        ip = new JTextField(8);

        add(ip);

        campochat = new JTextArea(12, 26);

        add(campochat);

        campo1 = new JTextField(20);

        add(campo1);

        miboton = new JButton("Enviar");

        EnviaTexto mievento = new EnviaTexto();

        miboton.addActionListener(mievento);

        add(miboton);

        Thread mihilo = new Thread(this);

        mihilo.start();

    }

    @Override
    public void run() {

        try {
            ServerSocket servidor_cliente = new ServerSocket(9090);

            Socket cliente;

            PaqueteEnvio paqueteRecibido;

            while (true) {

                cliente = servidor_cliente.accept();

                ObjectInputStream flujoentrada = new ObjectInputStream(cliente.getInputStream());

                paqueteRecibido = (PaqueteEnvio) flujoentrada.readObject();

                campochat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private class EnviaTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            campochat.append("\n" + campo1.getText());
            
            try {
                Socket misocket = new Socket("192.168.0.2", 9999);

                PaqueteEnvio datos = new PaqueteEnvio();

                datos.setNick(nick.getText());

                datos.setIp(ip.getText());

                datos.setMensaje(campo1.getText());

                ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());

                paquete_datos.writeObject(datos);

                misocket.close();

//                DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
//
//                flujo_salida.writeUTF(campo1.getText());
//                flujo_salida.close();
            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);

                System.out.println(ex.getMessage());

            }

        }

    }

    private JTextField campo1, nick, ip;

    private JTextArea campochat;

    private JButton miboton;

}

class PaqueteEnvio implements Serializable {

    private String nick, ip, mensaje;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
