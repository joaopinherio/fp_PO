/*Use sua criatividade e instancie os objetos necessários e evoque as
mensagens adequadas para reproduzir outras imagens.*/

public class exp1 {

    public static void main(String args[]) {

        Square quad1 = new Square();
        Circle C1 = new Circle();

        int size = 15;
        int s_limit = 1;
        int f_limit = 299;
        int y_pos = 15;
        String black = "black", white = "white", orange = "orange";

        // line(50, 50, 30, size, black);

        circle(180, 60, 110, "black"); //corpo
        circle(120, 90, 150, "white"); //barriga

        circle(92, 103, 5, "black");//cabeca

        line(120, 180, 15, size, black);
        line(105, 195, 30, size, black);
        line(105, 195, 45, size, black);
        line(105, 195, 60, size, black);
        line(105, 195, 75, size, black);
        line(105, 195, 90, size, black);
        line(105, 195, 105, size, black);

        line(115, 160, 75, size, orange);//bico
        line(130, 160, 80, size, orange);//bico

        line(75, 135, 255, size, orange);//pataE
        line(90, 120, 270, size, orange);//pataE

        line(165, 215, 255, size, orange);//pataD
        line(180, 200, 270, size, orange); //pataD

    }


    public static void line(int s_limit, int f_limit, int y, int size, String color) {
        for (int x = s_limit; x < f_limit; x += size) {

            Square aux = new Square();
            aux.changeColor(color);
            aux.moveVertical(y);

            aux.changeSize(size);
            aux.moveHorizontal(x);
            aux.makeVisible();
        }
    }

    public static void circle(int diam, int x, int y, String color) {
        Circle aux = new Circle();
        aux.changeColor(color);

        aux.changeSize(diam);
        aux.moveHorizontal(x);
        aux.moveVertical(y);

        aux.makeVisible();
    }

}