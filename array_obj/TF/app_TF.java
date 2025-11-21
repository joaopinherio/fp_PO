
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


        boolean menu_principal = true;
        int op_principal = 0;
        while (menu_principal == true) {
            
            print_principal();
            op_principal = 0;
            op_principal = in.nextInt();

            switch (op_principal) {

                case 1:
                    boolean menu_cliente = true;
                    int op_cliente = 0;

                    while (menu_cliente == true) {
                        print_menu();
                        op_cliente = in.nextInt();

                        Pedido pedido = new Pedido();
            
                        switch (op_cliente) {
            
                            case 1:
                                pedido.pedirHamburguer();
                                break;
                            case 2:
                                pedido.pedirPizza();
                                break;
                            case 3:
                                pedido.pedirBatata();
                                break;
                            case 4:
                                pedido.pedirRefrigerante();
                                break;
                            case 5:
                                pedido.toString();
                                break;
                            case 6:
                                menu_cliente = false;
                                System.out.println("Fim de consulta (pedido)");
                                break;
                            default:
                                System.out.println("Digite uma op1cao valida!");
                                break;
                        }
            
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("Para entrar neste modo eh necessario digitar a senha");
                    boolean menu_admin = aut_admin();
                    int op_admin = 0;

                    while (menu_admin == true) {
                        print_admin();
                        op_admin = in.nextInt();
            
                        switch (op_admin) {
            
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
                            case 2:
                                System.out.println("Controle de mesas");
                                controleM.print_vet();
                                break;
                            case 3:
                                System.out.println("Controle de reservas:");
                                cadernoR.print_vet();
                                break;
                            case 4:
                                System.out.println("Digite o nome para verificar sua reserva\n");
                                in.nextLine();
                                cadernoR.fetch_byNome(in.nextLine());
                                break;
                            case 6:
                                menu_admin = false;
                                System.out.println("Fim de consulta (admin)");
                                break;
                            default:
                                System.out.println("Digite uma op1cao valida!");
                                break;
                        }
            
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    menu_principal = false;
                    System.out.println("Fim de consulta (geral)");
                    break;
                default:
                    System.out.println("Digite uma opcao valida!");
                    break;
                }
            //fim switch geral
            }



        }


    static void print_menu() {

        System.out.println("=========== Menu Restaurante ===========");

        System.out.println("1 - Hambúrguer  - R$ 20.00");
        System.out.println("2 - Pizza       - R$ 35.00");
        System.out.println("3 - Batata Frita- R$ 12.00");
        System.out.println("4 - Refrigerante- R$ 5.00");
        System.out.println("6 - Finalizar pedido");

        System.out.println("=================================");
    }

    static void print_admin() {

        System.out.println("=========== Menu Admin ===========");

        System.out.println("opcao 1: Cadastra cliente");
        System.out.println("opcao 2: Controle de mesa");
        System.out.println("opcao 3: Controle de reservas");
        System.out.println("opcao 4: Consulta reserva por nome");
        System.out.println("opcao 6: Sair");

        System.out.println("=================================");
    }

    static boolean aut_admin(){
        Scanner in = new Scanner(System.in);

        boolean teste = false;
        
        while(teste == false){
        String input = in.nextLine();

            if(input.equals("admin") == false){
                System.out.println("Senha incorreta, voce nao tem permissao");
            }else{
                System.out.println("Permissao concedida!");
                teste = true;
            }
        }
        return teste;        
    }



    static void print_principal() {

        System.out.println("=========== Menu Principal ===========");

        System.out.println("opcao 1: Fazer pedido (Menu cliente)");
        System.out.println("opcao 2: Menu admin");
        System.out.println("opcao 3: Sair");

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


}
