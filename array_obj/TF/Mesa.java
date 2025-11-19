public class Mesa{

    private int id_Mesa;
    private int capacidade;
    private boolean reserva;

    public Mesa(int id_Mesa, int capacidade, boolean reserva){
        this.id_Mesa =id_Mesa;
        this.capacidade = capacidade;
        this.reserva = reserva;
    }    
    public void setId(String id){
        this.id_Mesa = id;
    }
    public void setCapacidade(String n){
        this.nome = n;
    }
    public void setReserva(boolean res){
        this.reserva = res;
    }
    public int getId(){
        return id_Mesa;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public boolean getReserva(){
        return reserva;
    }
    
}
