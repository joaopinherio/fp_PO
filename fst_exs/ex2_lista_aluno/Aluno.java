public class Aluno{
    //atributos
    public String nome;
    public int matricula;
    public double P1, P2, P3;
    public double exs_med;
    public double freq;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void set_P1(double P1){
        this.P1 = P1;
    }

    public void set_P2(double P2){
        this.P2 = P2;
    }

    public void set_P3(double P3){
        this.P3= P3;
    }

    public void set_exs_med(double exs_med){
        this.exs_med = exs_med;
    }
    
    public void set_freq(double freq){
        this.freq = freq;
    }

    public String toString(){
        return "Suas notas:" + P1 + P2 + P3;
    }



}