
package factorial;



import javax.swing.*;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long resultado=2L;
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        for (int i=numero;i>0;i--){
            
            resultado=resultado*i;
            
        }
        
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
    
}
