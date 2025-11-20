
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

    public boolean rmv_bycode (int codigo){
        int pos = fetch_bycode(codigo);
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
    
    public int fetch (Livro v){
        int pos = -1;
        int codigo = v.get_codigo();
        for(int i = 0; i < index; i++){
            if(vetor[i].get_codigo() == codigo) pos = i;
        }
        return pos;
    }

    public int fetch_bycode (int codigo){
        int pos = -1;
        for(int i = 0; i < index; i++){
            if(vetor[i].get_codigo() == codigo) pos = i;
        }
        return pos;
    }

    public void fetch_bycode_print (int codigo){
        int pos = -1;
        for(int i = 0; i < index; i++){
            if(vetor[i].get_codigo() == codigo) pos = i;
        }
        if(pos == -1) System.out.println("A estante nao possui livros com esse codigo");
        else System.out.println(vetor[pos]);
    }
    /*  
     * 
     public int fetch_byauthor (Livro v){
        int pos = -1;
        String autor = v.get_autor();
        for(int i = 0; i < index; i++){
            if((vetor[i].get_autor().equals(autor)) == true ) pos = i;
        }
        return pos;
    }
    */

    public void fetch_byauthor (String autor){
        int pos = -1;
        for(int i = 0; i < index; i++){
            if((vetor[i].get_autor().equals(autor)) == true ) pos = i;
        }
        if(pos == -1)System.out.println("A estante nao possui livros com esse autor");
        else System.out.println(vetor[pos]);
    }




    public void print_vet(){
        for(int i = 0; i < index; i++){
            System.out.println("\nLivro: " + (i+1) + ":" + vetor[i].toString());
        }
    }


    
}