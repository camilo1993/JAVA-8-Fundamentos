/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosinsincronizar;

import java.util.concurrent.locks.*;

/**
 *
 * @author Kmilo
 */
public class BancoSinSincronizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Banco b = new Banco();

        for (int i = 0; i < 100; i++) {

            EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);

            Thread t = new Thread(r);

            t.start();

        }

        // TODO code application logic here
    }

}

class Banco {

    public Banco() {

        cuentas = new double[100];

        for (int i = 0; i < cuentas.length; i++) {

            cuentas[i] = 2000;

        }

        // saldoSuficiente = cierreBanco.newCondition();
    }

    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {

        //  cierreBanco.lock();
//        try {
        while (cuentas[cuentaOrigen] < cantidad) { //evalua el saldo que el saldo no es inferior a la transferencia

//                System.out.println("-----Cantidad insuficiente: " + cuentaOrigen + "....SALDO:" + cuentas[cuentaOrigen] + "..." + cantidad);
            //return;
            //saldoSuficiente.await();
            wait();

        }

        System.out.println(Thread.currentThread());

        cuentas[cuentaOrigen] -= cantidad; //dinero que sale de la cuenta 

        System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

        cuentas[cuentaDestino] += cantidad;

        System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());

        notifyAll();

//            saldoSuficiente.signalAll();
    } //finally {
//            cierreBanco.unlock();
//        }
//    }

    public double getSaldoTotal() {

        double suma_cuentas = 0;

        for (double a : cuentas) {

            suma_cuentas += a;

        }
        return suma_cuentas;

    }

    private final double[] cuentas;

//    private Lock cierreBanco = new ReentrantLock();
//    private Condition saldoSuficiente;
}

class EjecucionTransferencias implements Runnable {

    public EjecucionTransferencias(Banco b, int de, double max) {

        banco = b;

        deLaCuenta = de;

        cantidadMax = max;

    }

    @Override
    public void run() {
        try {
            while (true) {

                int paraLaCuenta = (int) (100 * Math.random());

                double cantidad = cantidadMax * Math.random();

                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);

                Thread.sleep((int) (Math.random() * 10));

            }
        } catch (InterruptedException e) {
        }

    }

    private Banco banco;

    private int deLaCuenta;

    private double cantidadMax;

}
