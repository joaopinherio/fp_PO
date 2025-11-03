public class Carro{
    //atributos
    private String cor;
    private String marca;
    private int ano;
    private double preco;


    public Carro(String cor, String marca, int ano, double preco){
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
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