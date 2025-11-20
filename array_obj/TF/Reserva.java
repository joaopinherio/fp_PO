public class Reserva{

    private Cliente cliente;
    private Mesa mesa;
    private String data_hora;
    private String titulo;
    private String autor;
    private int ano;
    private int codigo;
    //constructor
    public Reserva(Cliente cliente, Mesa mesa, String data_hora){   
        this.cliente = cliente;
        this.mesa = mesa;
        this.data_hora = data_hora;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int get_codigo(){
        return codigo;
    }

    public String get_autor(){
        return autor;
    }
    //metodo string
    public String toString(){
        return " Livro " + titulo + " do autor " + autor + " do ano: " + ano + ", possui codigo:  " + codigo;
    }
    
}