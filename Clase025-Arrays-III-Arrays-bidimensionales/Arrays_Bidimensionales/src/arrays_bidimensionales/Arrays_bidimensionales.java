/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_bidimensionales;

/**
 *
 * @author kamilo
 */
public class Arrays_bidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matrix = new int[4][5];

        matrix[0][0] = 15;
        matrix[0][1] = 21;
        matrix[0][2] = 53;
        matrix[0][3] = 42;
        matrix[0][4] = 21;

        matrix[1][0] = 43;
        matrix[1][1] = 35;
        matrix[1][2] = 65;
        matrix[1][3] = 74;
        matrix[1][4] = 26;

        matrix[2][0] = 1;
        matrix[2][1] = 86;
        matrix[2][2] = 64;
        matrix[2][3] = 83;
        matrix[2][4] = 75;

        matrix[3][0] = 77;
        matrix[3][1] = 76;
        matrix[3][2] = 89;
        matrix[3][3] = 99;
        matrix[3][4] = 41;

//        System.out.println("Valor almacenado en la posicion 2,3= " + matrix [2][3]); 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]+ " ");
            }

        }

    }

}
