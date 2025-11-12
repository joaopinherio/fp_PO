
public class Carro{

    private String cor;
    private String marca;
    private int ano;
    private double preco;
    //constructor
    public Carro(String cor, String marca, int ano, double preco){   
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
    //metodo string
    public String toString(){
        return "O carro: " + marca + " " + cor + ", ano " + ano;
    }
    
}