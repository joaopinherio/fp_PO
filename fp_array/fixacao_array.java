import java.util.Random;
import java.util.Scanner;

public class fixacao_array{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        
        double [] sensor1 = new double [3];
        double [] sensor2 = new double [3];
        double [] Vresult = new double [3];
        double [] Vconcat = new double [sensor1.length + sensor2.length];



        get_temps(sensor1);
        get_temps(sensor2);
        System.out.println("Temperaturas do sensor 1:");
        print_All(sensor1);
        
        //System.out.println("\nTemperaturas do sensor 2:");
        //print_All(sensor2);

        //Vresult = get_Sub(sensor1, sensor2, Vresult);

        //System.out.println("\nsubtracao 1 - 2");
        //print_All(Vresult);

        System.out.println("\nHAHAHA");
        sensor1 = inverte_parimpar(sensor1);
        Vconcat = concatenar(sensor1, sensor2);

        print_All(Vconcat);
        

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
    public static double[] get_temps(double a[]) {
       Random randomGenerator = new Random();
       for (int i = 0; i < a.length; i++) {
           a[i] = randomGenerator.nextInt(10000);
       }
       return a;
   }
    
    public static double[] get_Sub(double a[], double b[], double result[]){
        for (int i = 0; i < a.length; i++) { 
            result[i] = a[i] - b[i];
        }
        return result;
    }


    public static void print_All(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Temperatura: " + (i + 1) + ": " + a[i]);
        }
    }

    public static double[] inverte_parimpar(double a[]) {
        double aux[] = new double [a.length];
        for (int i = 0; i <= a.length -1 ; i++) {
            if ((i + 1) % 2 != 0) {
                aux[i] = a [(i+1)];
            }
            if ((i + 1) % 2 == 0) {
                aux[i] = a [(i-1)];
            }
        }
        return aux;
    }

    public static double[] concatenar(double a[], double b[]) {
        double aux[] = new double [a.length + b.length];
        for (int i = 0; i < aux.length -1 ; i++) {
            if (i <= a.length) {
                aux[i] = a [i];
            }
            if (i > a.length && i <= b.length) {
                aux[i] = b [(i-aux.length)];
            }
        }
        return aux;
    }









}