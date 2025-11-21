
public class Caderno_Reservas{ 

    private Reserva [] vetor;
    private int index;
    //constructor
    public Caderno_Reservas(int len){ 
        vetor = new Reserva[len];
        index = 0;
    }

    public boolean addVet(Reserva a){
        int code_check = fetch(a);
        if(index >= vetor.length || code_check != -1){
            return false;
        } else {
            vetor[index] = a;
            index++;
            return true;
        }
    }

    public boolean rmv_byID (int id){
        int pos = fetch_byID(id);
        if(pos == -1){
            return false;
        } else {
            for(int i = pos; i < index-1; i++){
                vetor[i] = vetor[i+1];
            }
            vetor[index-1] = null;
            index--;
            return true;
        }
    }
    
    public int fetch (Reserva v){
        int pos = -1;
        int ID = v.get_ID();
        for(int i = 0; i < index; i++){
            if(vetor[i].get_ID() == ID) pos = i;
        }
        return pos;
    }

    public int fetch_byID (int id){
        int pos = -1;
        for(int i = 0; i < index; i++){
            if(vetor[i].get_ID() == id) pos = i;
        }
        return pos;
    }

    public void fetch_byID_print (int id){
        int pos = -1;
        for(int i = 0; i < index; i++){
            if(vetor[i].get_ID() == id) pos = i;
        }
        if(pos == -1) System.out.println("A estante nao possui livros com esse codigo");
        else System.out.println(vetor[pos]);
    }

    public void print_vet(){
        System.out.println("Reservas marcadas:");
        for(int i = 0; i < index; i++){
            System.out.println("\nReserva "+ i+1 +vetor[i].toString());
        }
    }


    
}