/*
Criar um método que recebe uma matriz qualquer e armazena num vetor
(jogaNoVetor). Qual seriam os parâmetros necessários?

int[height][width] matrix
height = matrix.length;
width = matrix[0].length;

 */

package vet_mat;
import java.util.Random;
import java.util.Scanner;

public class ex2_vetmat{  
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        
        int [][] matriz1 = new int [5][3];

        get_mat(matriz1);

        print_mat(matriz1);

        int [] transVet = jogaNoVetor(matriz1);

        print_array(transVet);


        System.out.println("\naltura:" + matriz1.length);
        System.out.println("altura:" + matriz1[0].length);

      
    }
    
    public static int[][] get_mat(int m[][]) {
        Random randomGenerator = new Random();

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = randomGenerator.nextInt(10);
            } 
        }
        return m;
    }

    public static int [] jogaNoVetor(int m[][]) {
        int [] aux_vet = new int[m.length * m[0].length];

        int y = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                aux_vet [y] = m[i][j];
                y++;
            } 
        }
        return aux_vet;
    }

    public static void print_mat(int m[][]){
        for (int i = 0 ; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void print_array(int a []){
        for (int i = 0; i < a.length; i++){
            //System.out.println((i+1) + ": " +  a [i]);
            System.out.print(a [i] + " ");
        }
    } 

}

 