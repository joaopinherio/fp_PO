public class Ingresso{
    //atributos
    private String numero;
    private String comprador;
    private double valor_pago;

    
    public Ingresso(String numero, String comprador, double valor_pago){
        this.numero = numero;
        this.comprador = comprador;
        this.valor_pago = valor_pago;
    }

    public void ligar(){
        this.ligado = get_estado_velo(velocidade);
    }

    public void aumentarVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void diminuiVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    private boolean get_estado_velo(int velocidade){
        if(velocidade > 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean get_Ligado(){
        return ligado;
    }

    public String mostrarEstado(){
        if(ligado == true){
            return "Ventilador de marca: " + marca + " esta na velocidade: " + velocidade +  " esta ligado";
        }else{
            return "Ventilador de marca: " + marca + " esta na velocidade: " + velocidade +  " esta desligado";
        }
    }


}