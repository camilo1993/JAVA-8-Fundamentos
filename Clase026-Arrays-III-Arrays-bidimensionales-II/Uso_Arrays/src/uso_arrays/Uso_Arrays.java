/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_arrays;

/**
 *
 * @author kamilo
 */
public class Uso_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matrix = {
            {15, 56, 75, 17, 97},
            {34, 6, 32, 21, 65},
            {33, 54, 22, 15, 68},
            {33, 78, 21, 57, 11},};
        
             for (int[] fila : matrix) {
            System.out.println();
            for(int z: fila){
                System.out.print(z + " ");
            }
        }






//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//
//        }

    }

}
