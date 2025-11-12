
public class VetorCarros{

    private Carro [] vetor;
    private int index;
    //constructor
    public VetorCarros(int len){   
        vetor = new Carro[len];
        index = 0;
    }

    public boolean addVet(Carro c){
        if(index >= vetor.length){
            return false;
        } else {
            vetor[index] = c;
            index++;
            return true;
        }
    }

    public void print_vet(){
        for(int i = 0; i < index; i++){
            System.out.println("\nCarro na vaga " + (i+1) + ":" + vetor[i].toString());
        }
    }


    
}