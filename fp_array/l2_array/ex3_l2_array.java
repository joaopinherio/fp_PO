/*
Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no
último ano. Faça um programa que leia o saldo médio de 30 clientes, em um vetor, e calcule
o valor do crédito, de acordo com a tabela abaixo, e armazene esses valores em outro vetor.
O final do programa exiba os dois vetores. Implemente um método para calcular o valor do
crédito e também para ler e escrever os vetores.
 */

import java.util.Random;
import java.util.Scanner;

public class ex3_l2_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        
        double [] clientsB = new double [5];
        double [] clientsA = new double [5];

        get_balanceBefore(clientsA);
        print_All(clientsA);

        get_balanceAfter(clientsB);
        print_All(clientsB);

        

    }

    /* 
    public static double[] get_array(double a[]){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("informe um numero: ");
            a [i] = in.nextDouble();
        }   
        return a;
    }
    * 
    */

    public static double[] get_balanceBefore(double a[]) {
        Random randomGenerator = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = randomGenerator.nextInt(10000);
        }
        return a;
    }

    public static double[] get_balanceAfter(double a[]) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 500) a[i] += 0;
            if(a[i] > 500 && a[i] <= 1500) a[i] += a[i] * 0.1;
            if(a[i] > 1500 && a[i] <= 2500) a[i] += a[i] * 0.15;
            if(a[i] > 500 && a[i] <= 1500) a[i] += a[i] * 0.2;
            if(a[i] > 500 && a[i] <= 1500) a[i] += a[i] * 0.25;
        }
        return a;
    }

    public static void print_All(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Saldo Cliente " + (i + 1) + ": " + a[i]);
        }
    }



}