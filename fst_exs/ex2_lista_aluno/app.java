import java.util.Scanner;

public class app{
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        Aluno aluno1 = new Aluno("Joao", 80402451);

        aluno1.set_P1(8.5);
        aluno1.set_P2(9);
        aluno1.set_P3(7);

        aluno1.set_exs_med(8);
        aluno1.set_freq(80);

        String results = aluno1.toString();

        System.out.println(results);


    }
}