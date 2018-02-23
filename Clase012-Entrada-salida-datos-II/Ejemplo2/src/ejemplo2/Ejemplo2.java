package ejemplo2;

import javax.swing.*;


public class Ejemplo2 {

    public static void main(String[] args) {
        
    String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor ");
    
    String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
    
    int edad_usuario=Integer.parseInt(edad);
    
    System.out.println("Hola " + nombre_usuario  + " El año que viene tendras " + (edad_usuario+1)+ " años");
    
    }
    
}
