/* Faça um programa que leia uma String correspondente a um valor em
binário de 8 bits (exemplo: 00000100) e escreve o valor em decimal 
correspondente (4). Para isso, crie um método que recebe a String, 
converte e devolve o valor para decimal.

Faça um programa que leia duas strings: s1 e s2. A seguir, 
construa um método que verifica se s1 está contida em s2. 
O programa deve, ao final, escrever se s1 está ou não contida em s2. */

import java.util.Scanner;

public class dual_programming{

    public static void main(String args[]) {

        String nome1 = get_string(), nome2 = get_string();
        
        String fst_name = nome1, snd_name = nome1, trd_name = nome1;
             
        if(fst_name.compareTo(nome2) > 0) fst_name =  nome2;
        //if(fst_name.compareTo(nome3) > 0) fst_name = nome3; 

        if(trd_name.compareTo(nome2) < 0) trd_name = nome2;
       //if(trd_name.compareTo(nome3) < 0) trd_name = nome3;

        if(fst_name.compareTo(nome2) == 0 && trd_name.compareTo(nome3) == 0){
            snd_name = nome1;
        } 
        if(fst_name.compareTo(nome1) == 0 && trd_name.compareTo(nome3) == 0){
            snd_name = nome2;
        }
        else snd_name = nome3;
 

        System.out.println("Nomes em ordem alfabetica: \n1: " + fst_name);
        System.out.println("2: " + snd_name);
        System.out.println("3: " + trd_name);
    
    }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um nome");
        return in.nextLine();
    }

}