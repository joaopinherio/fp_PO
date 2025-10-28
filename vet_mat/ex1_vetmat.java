/*
 * Criar um método que recebe uma matriz quadrada e devolve a soma dos
elementos da diagonal principal. Faça em versão com 2 laços e com 1 laço
 */

package vet_mat;
import java.util.Random;
import java.util.Scanner;

public class ex1_vetmat{  
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        
        int [][] matriz1 = new int [6][6];

        get_mat(matriz1);

        print_mat(matriz1);

        print_diagMat(matriz1);

        System.out.println("Diagonal 2 loop: " + sum_diagMat(matriz1));
        System.out.println("\nDiagonal 1 loop: " + SLsum_diagMat(matriz1));        
    }
    
    public static int[][] get_mat(int m[][]) {
        Random randomGenerator = new Random();

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = randomGenerator.nextInt(10);
            } 
        }
        return m;
    }

    public static int sum_diagMat(int m[][]){
        
        int count_l = 0, count_c = 0;
        int sum = 0;
        for (int i = 0 ; i < m.length; i++) {
            for(int j = 0; j < m.length; j++){
                if(j == count_l && i == count_c){
                    sum += m[i][j];
                    count_c++;
                    count_l++;
                }
            }
        }
        return sum;
    }

    public static int SLsum_diagMat(int m[][]){
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
            }
        return sum;
    }


    public static void print_diagMat(int m[][]){
        
        int count_l = 0, count_c = 0;
        for (int i = 0 ; i < m.length; i++) {
            for(int j = 0; j < m.length; j++){
                if(j == count_l && i == count_c){
                    if(count_l > 0){
                        for(int k = 0; k < count_l; k++){
                            System.out.print("  ");
                        }
                    }
                    System.out.println(m[i][j]);
                    count_c++;
                    count_l++;   
                }
            }
        }
    }


    public static void print_mat(int m[][]){
        for (int i = 0 ; i < m.length; i++) {
            for(int j = 0; j < m.length; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }

}

 