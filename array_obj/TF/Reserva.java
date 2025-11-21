public class Reserva{

    private int id_Reserva;
    private Cliente cliente;
    private Mesa mesa;
    private String data_hora;

    //constructor
    public Reserva(Cliente cliente, Mesa mesa, String data_hora){   
        this.cliente = cliente;
        this.mesa = mesa;
        this.data_hora = data_hora;
    }

    public void set_ID(int id_Reserva){
        this.id_Reserva = id_Reserva;
    }

    public void set_Cliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void set_Mesa(Mesa mesa){
        this.mesa = mesa;
    }

    public Cliente get_Cliente(){
        return cliente;
    }
    public int get_ID(){
        return id_Reserva;
    }
    //metodo string
    public String toString(){
        return "\nCliente:" + cliente.getNome() + "\nMesa: " + mesa.get_ID() + "\nHorario: " + data_hora;
    }
    
}