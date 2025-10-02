
public class Carro{

    private String modelo;
    private String marca;
    private int ano;
    private int kilometers;
    private int valor;
    //constructor
    public Carro(String marca, String modelo, int ano){   
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //metodo string
    public String toString(){
        return "O carro eh um: " + marca + " " + modelo + ", ano " + ano;
    }
    
}