
//public class Controle_Mesa{

/*Fazer um metodo na classe para que assim que a classe seja chamada
 * todas as mesas sejam geradas sem ocupação, se elas forem ocupadas
 * -> tirar das opções do vetor
 * 
 * metodo de procura de apenas mesas livres
 */
public class Controle_Mesa{ 

    private Mesa [] vetor;
    private int index;
    //constructor
    public Controle_Mesa(int len){ 
        vetor = new Mesa[len];
        index = 0;
    }

    public boolean addVet(Mesa a){
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
    
    public int fetch (Mesa v){
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

    public Mesa fetch_Mesa (int id){
        for(int i = 0; i < index; i++){
            if(vetor[i].get_ID() == id) return vetor[i];
        }
        return null;
    }

    public void print_vet(){
        System.out.println("Mesas disponiveis:");
        for(int i = 0; i < index; i++){
            System.out.println("\n" +vetor[i].toString());
        }
    }


    
}