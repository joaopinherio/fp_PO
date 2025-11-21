public class Cliente{
    private int id_Cliente;
    private String nome;
    private String telefone;


    public Cliente(int id_Cliente, String nome, String telefone){
        this.id_Cliente = id_Cliente;
        this.nome = nome;
        this.telefone = telefone;
    }
    public void setId(int id){
        this.id_Cliente = id;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setTel(String tel){
        this.telefone = tel;
    }
    public int getId(){
        return id_Cliente;
    }
    public String getNome(){
        return nome;
    }
    public String getTel(){
        return telefone;
    }
    public String toString(){
        return "ID do Cliente: " +id_Cliente+ " | Nome: " +nome+ " | Telefone: " +telefone;
                
    }
}