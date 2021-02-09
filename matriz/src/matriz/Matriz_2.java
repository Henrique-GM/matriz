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
public class Matriz_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
              
        System.out.print("Digite a quantidade de linhas: ");
        int L = sc.nextInt();
        
        System.out.print("Digite a quantidade de colunas: ");
        int C = sc.nextInt();
        
        
        int[][] matriz = new int[L][C];
      
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Digite o número na matriz: ");
        int N = sc.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j] == N) {
                    
                    System.out.print("Posição: " + "Linha: " + i + " Coluna: " + j);
                    System.out.println();
                    
                    if (j < matriz.length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                    
                }
            }
        }
        
        sc.close();
    }
}
