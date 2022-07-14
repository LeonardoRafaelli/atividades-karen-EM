import java.util.Scanner;

public class bhaskara {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double a = sc.nextDouble();
        System.out.println("Informe um numero: ");
        double b = sc.nextDouble();
        System.out.println("Informe um numero: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        double x1 = (-(b) + Math.sqrt(delta))/(2 * a);
        double x2 = (-(b) - Math.sqrt(delta))/(2 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
