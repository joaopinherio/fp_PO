import java.util.Scanner;

public class exp_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        int count_ingress = 0;

        int [] numeros = new int [10];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("informe um numero: ");
            numeros [i] = in.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numeros digitados: " + numeros [i]);
        }
        

    }
}