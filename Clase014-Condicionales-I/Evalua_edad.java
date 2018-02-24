
package evalua_edad;


import java.util.*;
public class Evalua_edad {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce tu edad, por favor ");
        
        int edad=entrada.nextInt();
        
        if (edad<18){
            
            System.out.println("eres un adolescente");
                    
                   
        }
                
        else if(edad<40){
            
            System.out.println("eres joven");
            
        }
            
        else if (edad<65){
            
            System.out.println("eres maduro");
            
          
        }
        else{
            System.out.println("cuidate");
        }
            
        }
}
