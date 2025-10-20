/*
Escreva um programa que leia 30 valores reais, todos pertencentes ao intervalo [0;10], calcule
a média aritmética desses valores. Os valores devem ser inseridos em um vetor.
 */

import java.util.Scanner;

public class ex4_l2_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        
        double [] clientsB = new double [20];
        double [] clientsA = new double [20];

        get_array(clientsA);
        print_All(clientsA);

        System.out.println("\nValor de saldo apos a adicao do credito:");
        get_balanceAfter(clientsA, clientsB);
        print_All(clientsB);

        

    }

    public static double[] get_array(double a[]){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("informe um numero: ");
            a [i] = in.nextDouble();
        }   
        return a;
    }
    
    /*
     * 
     public static double[] get_balanceBefore(double a[]) {
        Random randomGenerator = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = randomGenerator.nextInt(10000);
        }
        return a;
    }
    */
    
    public static double[] get_balanceAfter(double a[], double j[]) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 500) j[i] = a[i];
            if(a[i] > 500 && a[i] <= 1500) j[i] = a[i] * 1.1;
            if(a[i] > 1500 && a[i] <= 2500) j[i] = a[i] * 1.15;
            if(a[i] > 2500 && a[i] <= 4000) j[i]  = a[i] * 1.2;
            if(a[i] > 4000) j[i] = a[i] * 1.25;
        }
        return j;
    }


    public static void print_All(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Saldo Cliente " + (i + 1) + ": " + a[i]);
        }
    }



}