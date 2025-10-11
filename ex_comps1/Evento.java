public class Evento{
    //atributos
    private String nome_evento;
    private String local;
    private double preco_ing;


    public Evento(String nome_evento, String local, double preco_ing){
        this.nome_evento = nome_evento;
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

    public String get_nome(){
        return nome_evento;
    }

}