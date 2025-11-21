public class Pedido {

    private Pedido[] vetor;
    private int index;
    private Caderno_Reservas reserva;
    private int id;
    private boolean Hamburguer;
    private boolean Pizza;
    private boolean Batata;
    private boolean Refrigerante;

    //constructor
    public Pedido() {
        Hamburguer = false;
        Pizza = false;
        Batata = false;
        Refrigerante = false;
    }

    public boolean pedirHamburguer() {
        Hamburguer = true;
        return true;
    }

    public boolean pedirPizza() {
        Pizza = true;
        return true;
    }

    public boolean pedirBatata() {
        Batata = true;
        return true;
    }

    public boolean pedirRefrigerante() {
        Refrigerante = true;
        return true;
    }

    public boolean getHamburguer() {
        return Hamburguer;
    }

    public boolean getPizza() {
        return Pizza;
    }

    public boolean getBatata() {
        return Batata;
    }

    public boolean getRefrigerante() {
        return Refrigerante;
    }
    public String toString(){

        String comanda = "";

        if(Hamburguer == true) comanda += "Hamburguer ";
        if(Pizza == true) comanda += "Pizza ";
        if(Batata == true) comanda += "Batata ";
        if(Refrigerante == true) comanda += "Refrigerante ";
                
        return comanda;
    }


}
