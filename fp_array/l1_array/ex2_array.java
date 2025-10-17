/*
Escreva um programa que lê um valor n inteiro e guarde em um vetor os n primeiros 
termos da série de Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, ... O programa deve escrever o vetor, ao seu final. 
(Obs.: n determina a quantidade de elementos que você quer mostrar da serie Fibo)
 */

import java.util.Scanner;

public class ex2_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        double [] numeros = new double [20];

        get_array(numeros);
        System.out.println("O vetor possui " + numeros.length + " elementos");
        print_array(numeros);
        
    }

    public static double[] get_array(double a[]){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("informe um numero: ");
            a [i] = in.nextDouble();
        }   
        return a;
    }

    public static void print_array(double a []){
        for (int i = 0; i < a.length; i++){
            System.out.println("Numero digitado " + (i+1) + ": " +  a [i]);
        }
    } 
}