
package uso_arrays_segundo;


public class Uso_Arrays_Segundo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] matriz_aleatorios=new int [150];
        
        for (int i=0; i<matriz_aleatorios.length;i++){
            
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
            
        }
        for(int numeros:matriz_aleatorios){
            
                System.out.print(numeros + " ");
        }
    }
    
}
