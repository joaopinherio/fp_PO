import java.util.Random;
import java.util.Scanner;

public class app_book
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);
        Random randomGenerator = new Random();

        Estante e1 = new Estante(3); 

        Livro livro1 = new Livro(111, "Memorias do subsolo", "Dostoievsky", 1864);
        Livro livro2 = new Livro(222, "Equanto agonizo", "W. Faulkner", 1930);
        Livro livro3 = new Livro(333, "Crime e Castigo", "Dostoievsky", 1866);
        Livro livro4 = new Livro(444, "The Shining", "S. King", 1977);

        
        String option = "";
        int op = 0;
        while((option.equalsIgnoreCase("sair")) == false){
            print_menu();
            op = in.nextInt();

            int aux = 0;
            String aux_s = "";
            switch(op){
                
                /*  
                case 1:
                System.out.println("Escolha para cadastro, entre os 4 livros disponiveis, escrendo seu respectivo numero:");
                aux = in.nextInt();
                if(aux == 1) e1.addVet(livro1);
                if(aux == 2) e1.addVet(livro2);
                if(aux == 3) e1.addVet(livro3);
                if(aux == 4) e1.addVet(livro4);
                break;
                */

                case 1:
                    String titulo = ""; String autor = ""; int ano = 0; int codigo = 0;
                    System.out.print("Nome da obra: "); in.nextLine(); titulo = in.nextLine();
                    System.out.print("\nNome da do autor: "); autor = in.nextLine();
                    System.out.print("\nAno da obra: "); ano = in.nextInt();
                    codigo = randomGenerator.nextInt(1000 - 100) + 100;

                    Livro livro_aux = new Livro(codigo,titulo, autor, ano);
                    e1.addVet(livro_aux);
                    break;
                case 2:
                    System.out.println("Busque um livro digitando seu codigo");
                    aux = in.nextInt();
                    e1.fetch_bycode_print(aux);
                    break;
                case 3:
                    System.out.println("Busque um livro digitando seu autor");
                    in.nextLine();
                    aux_s = in.nextLine();
                    e1.fetch_byauthor(aux_s);
                    break;
                case 4:
                    System.out.println("Remova um livro digitando seu codigo");
                    aux = in.nextInt();
                    e1.rmv_bycode(aux);
                    break;
                case 5:
                    System.out.println("Livros de na estante:");
                    e1.print_vet();
                    break;
                case 6:
                    option = "sair";
                    System.out.println("Fim de consulta");
                    break;
                }

                System.out.println("\n");
            }   
        }
        
        
    static void print_menu(){
            
        System.out.println("============= MENU ==============");
            
        System.out.println("Opcao 1: Cadastra livro");
        System.out.println("Opcao 2: Busca livro por codigo");
        System.out.println("Opcao 3: Busca livro por autor");
        System.out.println("Opcao 4: Exclui livro por codigo");
        System.out.println("Opcao 5: Exibe os livros disponiveis");
        System.out.println("Opcao 6: Sair");
            
        System.out.println("=================================");
    }


}   