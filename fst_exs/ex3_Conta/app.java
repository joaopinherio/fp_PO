import java.util.Scanner;

public class app{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        Aluno aluno1 = new Aluno("Joao", 80402451);

        aluno1.set_P1(5);
        aluno1.set_P2(5);
        aluno1.set_P3(5);

        aluno1.set_exs_med(5);
        aluno1.set_freq(80);

        //String results = aluno1.toString();

        double G1 = aluno1.get_G1();

        System.out.println(G1);

        if(G1 < 7){
            System.out.println("Sua nota G1 nao foi suficiente\nEscreva a nota da sua G2");
            aluno1.set_G2(in.nextDouble());
        }

        
    }
}