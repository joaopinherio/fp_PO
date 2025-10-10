public class Evento{
    //atributos
    private String nome;
    private String local;
    private double preco_ing;


    public Evento(String nome, String local, double preco_ing){
        this.nome = nome;
        this.local = local;
        p_warning();
        this.preco_ing = preco_ing;
    }

    private void p_warning(){
        System.out.println("Digite um valor positivo para o preco do ingresso");
    }

    public double get_preco_ing(){
        return preco_ing;
    }

}