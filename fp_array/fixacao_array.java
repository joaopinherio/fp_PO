
import java.util.Scanner;

public class fixacao_array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] sensor1 = new double[3];
        double[] sensor2 = new double[3];
        double[] Vresult = new double[3];
        double[] Vconcat = new double[(sensor1.length + sensor2.length)];

        double[] Vclone = new double[3];

        get_temps(sensor1);
        get_temps(sensor2);
        Vclone = clone(sensor1);

        System.out.println("Temperaturas do sensor 1:");
        print_All(sensor1);

        System.out.println("\nCLONE do sensor 1:");
        print_All(Vclone);

        System.out.println("\nTemperaturas do sensor 2:");
        print_All(sensor2);

        System.out.println("\nSUB VALOR:");
        print_All(substituiValor(sensor1));

        // System.out.println("\nTemperaturas do sensor 2:");
        // print_All(sensor2);
        // Vresult = get_Sub(sensor1, sensor2, Vresult);
        // System.out.println("\nsubtracao 1 - 2");.
        // print_All(Vresult);
        System.out.println("\nHAHAHA");
        // sensor1 = inverte_parimpar(sensor1);
        Vconcat = concatenar(sensor1, sensor2);

        print_All(Vconcat);

        double[] V_intersec = IntersecVet(sensor1, sensor2);

        System.out.println("\nIntersecao dos vetores:");
        print_All(V_intersec);

        double[] V_menos1 = removeE(sensor1, 1);
        
        System.out.println("\nVetor com 1 dado removido:");
        print_All(V_menos1);

        //System.out.println("\nadc um valor:");
        //double[] V_mais1 = adcValor(sensor1);

    }

    public static double[] get_temps(double a[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("informe um numero: ");
            a[i] = in.nextDouble();
        }
        return a;
    }

    /*
            public static double[] get_temps(double a[]) {
        Random randomGenerator = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = randomGenerator.nextInt(10000);
        }
        return a;
    }
     */
    public static double[] get_Sub(double a[], double b[], double result[]) {
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    public static void print_All(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + a[i]);
        }
    }

    public static double[] inverte_parimpar(double a[]) {
        double aux[] = new double[a.length];
        for (int i = 0; i <= a.length - 1; i++) {
            if ((i + 1) % 2 != 0) {
                aux[i] = a[(i + 1)];
            }
            if ((i + 1) % 2 == 0) {
                aux[i] = a[(i - 1)];
            }
        }
        return aux;
    }

    public static double[] concatenar(double a[], double b[]) {
        double aux[] = new double[(a.length + b.length)];
        for (int i = 0; i < aux.length; i++) {
            if (i < a.length) {
                aux[i] = a[i];
            }
            if (i >= a.length) {
                aux[i] = b[(i - a.length)];
            }
        }
        return aux;
    }

    public static double[] clone(double a[]) {
        double aux[] = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        return aux;
    }

    public static double[] IntersecVet(double a[], double b[]) {
        int lesser_length = 0;
        if (a.length < b.length) {
            lesser_length = a.length; 
        }else {
            lesser_length = b.length;
        }

        int length_count = 0;
        for (int i = 0; i < lesser_length; i++) {
            if (a[i] == b[i]) {
                length_count++;
            }
        }
        double aux[] = new double[length_count];
        /*
        
        int j = 0;
        for (int i = 0; i < lesser_length; i++) {
            if (a[i] == b[i]) {
                aux[j] = a[i];
            }
            if(j < lesser_length-1)j++;
        }
        return aux;
         */

        for (int i = 0; i < lesser_length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if (a[i] == b[i]) {
                    aux[j] = a[i];
                }
            }
        }
        return aux;
    }

    public static double[] removeE(double a[], double r_element) {
        double aux[] = new double[a.length - 1];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if ((i+1) == r_element) {
                    aux[j] = a[i++];
                }else aux[j] = a[i];
            }
        }
        return aux;
    }

    //metodo casca
    public static double[] substituiValor(double sens[]) {
        double impar = -2;
        double par = -1;
        double aux[] = new double[sens.length];
        for (int i = 0; i <= sens.length - 1; i++) {
            if (i % 2 == 0) {
                aux[i] = par;
            } else if (i % 2 == 1) {
                aux[i] = impar;
            }
        }
        return aux;
    }

    public static double[] adcValor(double vet[]) {
        Scanner in = new Scanner(System.in);
        
        double aux[] = new double[vet.length + 1];
        for (int i = 0; i <= aux.length - 1; i++) {
            aux[i] = vet[i];
            if (aux.length > vet.length) {
                System.out.println("diga um valor que deseja adicionar ao vetor: ");
                aux[i] = in.nextDouble();
            }
        }
        return aux;
    }

}
