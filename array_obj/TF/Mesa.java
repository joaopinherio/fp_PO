public class Mesa{

    private int id_Mesa;
    private int capacidade;
    private boolean ocup;

    public Mesa(int id_Mesa, int capacidade){
        this.id_Mesa =id_Mesa;
        this.capacidade = capacidade;
        this.ocup = false;
    }    

    public void set_Capacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void set_Ocup(boolean res){
        this.ocup = res;
    }
    public int get_ID(){
        return id_Mesa;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public String toString(){
        return " Mesa: " + id_Mesa;
    }

    
}
