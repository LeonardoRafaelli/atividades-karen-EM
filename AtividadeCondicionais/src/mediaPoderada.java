import java.util.Scanner;

public class mediaPoderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double num3 = sc.nextDouble();
        double media = ((2 * num1) + (3 * num2) + (5 * num3)) / 10;
        System.out.println(media);
        if (media >= 8 && media <= 10) {
            System.out.println("Conceito A");
        }
        if (media > 8 && media <= 8) {
            System.out.println("Conceito B");
        }
        if (media > 6 && media <= 7) {
            System.out.println("Conceito C");
        }
        if (media > 5 && media <= 6) {
            System.out.println("Conceito D");
        }
        if (media > 0 && media <= 5) {
            System.out.println("Conceito E");
        }
    }
}
