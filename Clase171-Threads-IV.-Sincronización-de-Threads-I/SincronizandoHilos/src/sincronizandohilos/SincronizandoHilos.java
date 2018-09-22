/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizandohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class SincronizandoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HilosVarios hilo1 = new HilosVarios();

        HilosVarios hilo2 = new HilosVarios();

        hilo1.start();

        try {
            hilo1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SincronizandoHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

        hilo2.start();

        try {
            hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SincronizandoHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("terminadas las tareas");
    }

}

class HilosVarios extends Thread {

    public void run() {

        for (int i = 0; i < 15; i++) {

            try {
                System.out.println("Ejecutando Hilo " + getName());

                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosVarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
