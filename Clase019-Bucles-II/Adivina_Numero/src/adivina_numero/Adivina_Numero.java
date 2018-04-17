
package adivina_numero;


import java.util.*;
public class Adivina_Numero {


   
    public static void main(String[] args) {
       
        int aleatorio=(int)(Math.random()*100);
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
                
        int intentos=0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un numero, por favor");
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                
                System.out.println("Mas bajo");
                
            }
            else if (aleatorio>numero){
                
                System.out.println("Mas alto");
            }
        }
        
        
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
        
    }
    
}
