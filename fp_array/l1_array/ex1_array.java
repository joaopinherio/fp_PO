/*
 * 1) Exercício de contextualização:
Crie um vetor de 20 elementos, do tipo double, com nome numeros.
Armazenar valores no vetor.
Mostrar em tela: Quantos elementos o vetor possui, os valores e seus respectivos índices.
 */

import java.util.Scanner;

public class ex1_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        double [] numeros = new double [20];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("informe um numero: ");
            numeros [i] = in.nextInt();
        }
        
    }

    public static double[] get_array(double a[]){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("informe um numero: ");
            a [i] = in.nextDouble();
            return a[];
        }   
    }

    public static void print_array(int a []){
        for (int i = 0; i < a.length; i++){
            System.out.println("Numeros digitados: " + a [i]);
        }
    } 
}