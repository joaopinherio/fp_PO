import java.util.Scanner;

public class AppVentilador{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        Ventilador ventilador1 = new Ventilador("Eletrolux");

        String estado = ventilador1.mostrarEstado();
        System.out.println("Primeiro estado:");
        System.out.println(estado+ "\n");

        ventilador1.ligar();
        
        ventilador1.aumentarVelocidade(0);
        ventilador1.ligar();

        System.out.println("Segundo estado:");
        estado = ventilador1.mostrarEstado();
    
        System.out.println(estado);
    }
}