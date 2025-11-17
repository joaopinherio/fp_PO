public class Reserva{

    private int id_cliente;
    private Cliente cliente;
    private Mesa mesa;
    private String data;
    private String hora;
    private Pedido pedido;
    //constructor
    public Reserva(int codigo, String titulo, String autor, int ano){   
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
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