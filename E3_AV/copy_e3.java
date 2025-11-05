/*
Joao Pinheiro e Rafael Ledur
grupo 3
 */

package E3_AV;
import java.util.Random;
import java.util.Scanner;

public class copy_e3{  
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        
        int [][] matriz1 = new int [4][5];

        int [] vetor1 = new int [5];

        get_mat(matriz1);

        print_mat(matriz1);

        //System.out.println("Escreva o numero da linha que voce quer a soma dos elementos: ");
        //int linha = in.nextInt();
        System.out.println("\nVetor maximo por linha:");
        print_array(somaPorLinha(matriz1));

        System.out.println("\nvetor maximo por coluna");
        print_array(maximoPorColuna(matriz1));

        System.out.println("\ntransposta: ");
        print_mat(transposta(matriz1));
      
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

    public static int somaPorLinhaERRO(int m[][], int lin) {
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == lin){
                    sum += m[i][j]; 
                }
            } 
        }
        return sum;
    }

    public static int [] somaPorLinha(int m[][]) {
        int [] aux_vet = new int[m[0].length];

        int y = 0;
        int maior = 0;
    
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){ 
                if(maior == 0) maior = m[i][j];
                if(m[i][j] > maior) maior = m[i][j];
                aux_vet [y] = maior;
                y++;
            } 
            maior = 0;
        }
        return aux_vet;
    }

    public static int [] maximoPorColuna(int m[][]) {
        int [] aux_vet = new int[m[0].length];

        int y = 0;
        int maior = 0;
    
        for(int j = 0; j < m[0].length; j++){
            for(int i = 0; i < m.length; i++){ 
                if(maior == 0) maior = m[i][j];
                if(m[i][j] > maior) maior = m[i][j];
            } 
            aux_vet [y] = maior;
            y++;
            maior = 0;
        }
        return aux_vet;
    }

    public static int[][] transposta(int m[][]){
        int [][] m_aux = new int [m[0].length][m.length];

        for (int i = 0 ; i < m_aux.length; i++) {
            for(int j = 0; j < m_aux[0].length; j++){
                m_aux [i][j] = m [j][i];
            }
        }
        return m_aux;
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

 