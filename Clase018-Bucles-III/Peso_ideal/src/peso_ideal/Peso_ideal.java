package peso_ideal;

import javax.swing.*;
public class Peso_ideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String genero="";
        
        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
         
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
    
        int pesoideal=0;
        
        if(genero.equalsIgnoreCase("H")){
            
            pesoideal=altura-110;
        }
        else if(genero.equalsIgnoreCase("M")){
            
            pesoideal=altura-120;
                    
        }
        
        System.out.println("Tu peso ideal es " + pesoideal);
    }
    
    
    
}
