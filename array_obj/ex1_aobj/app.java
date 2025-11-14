public class app
{
    public static void main(String [] args)
    {
        VetorCarros vc = new VetorCarros(3); 

        Carro carro1 = new Carro("prata", "nissan", 2007, 5000);

        
        
        vc.addVet(carro1);

        vc.print_vet();


    }
}
