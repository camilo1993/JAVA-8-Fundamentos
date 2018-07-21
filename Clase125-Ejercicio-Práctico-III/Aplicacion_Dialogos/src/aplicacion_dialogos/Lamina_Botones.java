/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_dialogos;

import javax.swing.*;

/**
 *
 * @author Kmilo
 */
public class Lamina_Botones extends JPanel {

    public Lamina_Botones(String titulo, String[] opciones) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup grupo = new ButtonGroup();

        for (int i = 0; i < opciones.length; i++) {

            JRadioButton bot = new JRadioButton(opciones[i]);

            add(bot);

            grupo.add(bot);

            bot.setSelected(i == 0);

        }

    }

}
