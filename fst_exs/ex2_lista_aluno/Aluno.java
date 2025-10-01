public class Aluno{
    //atributos
    public String nome;
    public int matricula;
    public double P1, P2, P3;
    public double exs_med;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public double set_P1(double P1){
        this.P1 = P1;
    }


}