public class Aluno{
    //atributos
    public String nome;
    public int matricula;
    public double P1, P2, P3;
    public double exs_med;
    public double freq;
    public double G1;
    public double G2;

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

    public void set_G2(double G2){
        this.G2 = G2;
    }

    public double get_G1(){
        return (P1 + P2 + P3 + exs_med)/4;
    }
    
    public String toString(){
        if(G1 < 7){
            return "Suas G1: " + G1 + "\nVoce foi aprovado " ;
        }else{
            return "Sua G1: " + G1 + "\nVoce foi reprovado " ;
        }
    }






}