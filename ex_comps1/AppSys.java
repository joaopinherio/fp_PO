import java.util.Scanner;

public class AppSys{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Bem vindo a venda de ingressos");
        System.out.println("Selecionne o novo do evento que deseja assistir");
        String nome_evento = in.nextLine();

        Evento evento1 = new Evento(nome_evento, "POA", 9.90);

        int count_ingresso = 0;
        
        System.out.println("Qual o numero de ingressos?");
        int num_ingresso = in.nextInt();

        System.out.println("Qual seu nome?");
        String nome_comprador = in.nextLine();

        System.out.println("Insira o valor de pagamento (Preco do ingresso: " + evento1.get_preco_ing() + ")");

        Ingresso ingresso1 = new Ingresso(num_ingresso, nome_comprador , 9, evento1);

        String ingresso = "";
        
        if(ingresso1.price_test() == -1){
            System.out.println("So eh possivel comprar 1 ou 2 ingressos");
            ingresso = "ingresso invalido";
        }
        if(ingresso1.price_test() == -1){
            System.out.println("O valor pago nao eh compativel com o valor do evento");
            ingresso = "ingresso invalido";
        } else{
            ingresso = ingresso1.ToString();
        }

        System.out.println(ingresso);
    }
}