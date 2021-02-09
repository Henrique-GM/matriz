/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;



/**
 *
 * @author Henrique
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < matriz.length; i++) {
            //Acessando linha e coluna da primeira posição
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        
        int contar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j] < 0) {
                    
                    contar++;
                    
                }
            }
        }
        
        System.out.println("Números negativos: " + contar);
        
        sc.close();
    }
    
}
