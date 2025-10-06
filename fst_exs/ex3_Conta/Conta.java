public class Conta{
    public String n_Conta;
    public double saldo;


    public Conta(String n_Conta, double saldo){
        this.saldo = saldo;
        
    }
    
    private String verifica_num(String n_Conta){
        while(true){
            n_Conta.charAT(3)
            if(n_Conta.charAT(3) == 0){
               return this.n_Conta = n_Conta;
            }else{
                System.out.println("Numero de conta 3 digitos!!");
            }
        }
    }



}