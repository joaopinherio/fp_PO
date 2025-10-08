public class Evento{
    //atributos
    private String nome;
    private String local;
    private double preco_ing;

    

    public Evento(String marca){
        this.marca = marca;
        this.ligado = false;
        this.velocidade = 1;
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