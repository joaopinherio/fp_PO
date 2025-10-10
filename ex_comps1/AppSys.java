import java.util.Scanner;

public class AppSys{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        Evento evento1 = new Evento("idioteque", "POA", 9.90);

        Ingresso ingresso1 = new Ingresso(1, "joao", 10, evento1);

        String ingresso = "";
        
        if(ingresso1.price_test() == -1){
            System.out.println("So eh possivel comprar 1 ou 2 ingressos");
            ingresso = "ingresso invalido";
        }
        if(ingresso1.price_test() == -1){
            System.out.println("O valor pago nao eh compativel com o valor do evento");
            ingresso = "ingresso invalido";
        } else{
            
        }

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