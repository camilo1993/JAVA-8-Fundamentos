package uso_bucle_2;


import javax.swing.*;
public class Uso_Bucle_2 {


    public static void main(String[] args) {
       
        Boolean arroba=false;
        
        String mail=JOptionPane.showInputDialog("Introduce mail");
        
        for(int i=0; i<mail.length();i++){
            
            if(mail.charAt(i)=='@'){
                
                arroba=true;
            }
        }
        
        if(arroba==true){
            
            System.out.println("Es correcto");
        }
        else{
            System.out.println("No es correcto");
        }
    }
    
}
