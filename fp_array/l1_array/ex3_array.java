/*
3) Crie um vetor para 20 alturas em cm (use um vetor de inteiros): 

a) Preencha o vetor com alturas aleatórias do intervalo [0; 200]; (pode usar Random)

b) Escreva apenas as alturas pares; 

c) Escreva apenas as alturas cujos índices são pares; 

d) Escreva apenas as alturas pares cujos índices são impares; 

e) Escreva o vetor ao contrário; (usar decremento)

f) Escreva a média das alturas; 

g) Escreva quantas alturas estão acima da média; 

h) Escreva a menor altura e a sua posição.
 */

import java.util.Random;

public class ex3_array {
    public static void main(String[] args){

        int [] alturas = new int [5];
        
        get_array(alturas);

        System.out.println("Todas as alturas:");
        print_All(alturas);
        
        System.out.println("\nApenas alturas pares:");
        print_OnlyEven(alturas);
        
        System.out.println("\nApenas alturas cujo indices sao pares:");
        print_IndEven(alturas);
        
        System.out.println("\nApenas alturas cujo indices sao impares:");
        print_IndOdd(alturas);
         
        System.out.println("\nOrdem das alturas na ordem inversa:");
        reverse_print(alturas);
         
        System.out.print("\nMedia das alturas: ");
        double med_alturas = get_med(alturas);
        System.out.println(+ med_alturas);
        System.out.println("\nApenas alturas acima da media:");
        print_Abvmed(alturas, med_alturas);
         
        int menor = get_lesser(alturas);
        int pos_menor = get_lesserPos(alturas, menor);
         
        System.out.println("\nMenor altura:\nIndice " + pos_menor + ": " +menor);
        
    }

    public static int[] get_array(int a[]) {
        Random randomGenerator = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = randomGenerator.nextInt(201);
        }
        return a;
    }

    public static int get_lesser(int a[]) {
        int lesser = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < lesser) {
                lesser = a[i];
            }
        }
        return lesser;
    }

    public static int get_lesserPos(int a[], int lesser) {
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == lesser) {
                pos = i + 1;
                break;
            } else {
                pos = 1;
            }
        }
        return pos;
    }

    public static double get_med(int a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void print_All(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Indice " + (i + 1) + ": " + a[i]);
        }
    }

    public static void print_Abvmed(int a[], double med) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > ((int) med)) {
                System.out.println("Indice " + (i + 1) + ": " + a[i]);
            }
        }
    }

    public static void print_OnlyEven(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Indice " + (i + 1) + ": " + a[i]);
            }
        }
    }

    public static void print_IndEven(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println("Indice " + (i + 1) + ": " + a[i]);
            }
        }
    }

    public static void print_IndOdd(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println("Indice " + (i + 1) + ": " + a[i]);
            }
        }
    }

    public static void reverse_print(int a[]) {
        // for(int j = 0; j < a.length; j++){
        int j = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("Indice " + (j) + ": " + a[i]);
            j++;
        }
    }

}
