import java.util.Scanner;

public class Cliente {
    public static void main(String[] args){

        // reading input from user
        Scanner scanner = new Scanner(System.in);
        double xa = scanner.nextDouble();
        double ya = scanner.nextDouble();
        double xb = scanner.nextDouble();
        double yb = scanner.nextDouble();

        Ponto a = new Ponto(xa,ya);
        Ponto b = new Ponto(xb,yb);
        System.out.println((int)a.dist(b)); // calcula e print a distancia
    }
}
