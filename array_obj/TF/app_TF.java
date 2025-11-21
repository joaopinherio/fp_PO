
import java.util.Random;
import java.util.Scanner;

public class app_TF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randomGenerator = new Random();

        Controle_Mesa controleM = new Controle_Mesa(5);
        Caderno_Reservas cadernoR = new Caderno_Reservas(5);

        Mesa mesa1 = new Mesa(1, 5);
        Mesa mesa2 = new Mesa(2, 5);
        Mesa mesa3 = new Mesa(3, 5);
        Mesa mesa4 = new Mesa(4, 5);
        Mesa mesa5 = new Mesa(5, 5);

        controleM.addVet(mesa1);
        controleM.addVet(mesa2);
        controleM.addVet(mesa3);
        controleM.addVet(mesa4);
        controleM.addVet(mesa5);

        controleM.print_vet();

        System.out.println("controle de res antes:");
        cadernoR.print_vet();


        boolean menu = true;
        int op = 0;
        while (menu == true) {
            print_inicial();
            op = in.nextInt();

            switch (op) {

                case 1:
                    Cliente cliente = cadastra_cliente();
                    if(cliente.getId() > 0){
                        int aux_idM = cadastra_mesa(controleM);
                        Reserva reserva = new Reserva(cliente, controleM.fetch_Mesa(aux_idM), "20h 12/12");
                        int aux_id = cadernoR.get_index();
                        reserva.set_ID(aux_id + 1);
                        cadernoR.addVet(reserva);
                        controleM.rmv_byID(aux_idM);
                    }
                    break;
                case 4:
                    System.out.println("Controle de mesas");
                    controleM.print_vet();
                    break;
                case 5:
                    System.out.println("Controle de reservas:");
                    cadernoR.print_vet();
                    break;
                case 6:
                    menu = true;
                    System.out.println("Fim de consulta");
                    break;
                default:
                    System.out.println("Digite uma opcao valida!");
                    break;
            }

            System.out.println("\n");
        }

    }

    static void print_inicial() {

        System.out.println("=========== Bem vindo ===========");

        System.out.println("Opcao 1: Cadastra cliente");
        System.out.println("Opcao 4: Controle de mesa");
        System.out.println("Opcao 5: Controle de reservas");
        System.out.println("Opcao 6: Sair");

        System.out.println("=================================");
    }


    static Cliente cadastra_cliente(){
        Scanner in = new Scanner(System.in);
        Random randomGenerator = new Random();

        String nome = "";
        String telefone = "";
        int id = 0;
        
        Cliente cliente_aux = new Cliente(id, nome, telefone);

        System.out.print("Nome do cliente: ");
        cliente_aux.setNome(in.nextLine());
        
        System.out.print("\nTelefone do cliente: ");
        cliente_aux.setTel(in.nextLine());

        cliente_aux.setId(randomGenerator.nextInt(100 - 1) + 1);

        return cliente_aux;
    }

    static int cadastra_mesa (Controle_Mesa controleM){
        Scanner in = new Scanner(System.in);

        System.out.println("Estas sao as mesas disponiveis no momento\nPor favor escolha um numero disponivel para a sua reserva");
        controleM.print_vet();

        int id_mesa = 0;

        boolean teste = false;
        while(teste == false){
            
            id_mesa = in.nextInt();

            if(controleM.fetch_byID(id_mesa) == -1){
                System.out.println("O numero de mesa escolhido nao esta disponivel (ocupado/nao existe)");
            }else{
                System.out.println("Mesa " + id_mesa + " reservada!");
                teste = true;
            }
        }
        return id_mesa;
    }

    static void print_Cliente() {

        System.out.println("============= MENU ==============");

        System.out.println("Opcao 1: Cadastra Cliente");
       System.out.println("Opcao 2: Busca livro por codigo");
        System.out.println("Opcao 3: Busca livro por autor");
        System.out.println("Opcao 4: Exclui livro por codigo");
        System.out.println("Opcao 5: Exibe os livros disponiveis");
        System.out.println("Opcao 6: Sair");

        System.out.println("=================================");
    }

}
