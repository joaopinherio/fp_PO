

public class Ingresso{
    //atributos
    private int numero;
    private String comprador;
    private double valor_pago;
    private Evento evento;
    private double preco_ing;
    private String nome_evento;

    public Ingresso(int numero, String comprador, double valor_pago, Evento evento){
        this.numero = numero;
        this.comprador = comprador;
        this.valor_pago = valor_pago;
        this.preco_ing = evento.get_preco_ing();
        this.nome_evento = evento.get_nome();
    }

  /* 
  public void set_preco_ing(){
    this.preco_ing = evento.get_preco_ing();
}
*/  

    public int price_test(){
        if(valor_pago < preco_ing){
            return -1;
        }else{
            return 1;
        }
    }

    public int num_test(){
        if(!(numero == 1 ||numero == 2)){
            return -1;
        }else{
            return 1;
        }
    }

    public double get_valor(){
        return valor_pago;
    }

    public String ToString(){
        return "Ingresso para o " + nome_evento + " confirmado!\n" + "No nome de: " + comprador;  
    }


}