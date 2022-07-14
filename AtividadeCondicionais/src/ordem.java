import java.util.Scanner;

public class ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primiero numero?");
        double num1 = sc.nextDouble();
        System.out.println("Primiero numero?");
        double num2 = sc.nextDouble();
        System.out.println("Primiero numero?");
        double num3 = sc.nextDouble();

        if (num1 < num2 && num2 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + "," + num2 + "e" + num3);
            }
            if (num3 < num2) {
                System.out.println(num1 + "," + num3 + "e" + num2);
            }

        }
        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + "," + num1 + "e" + num3);
            }
            if (num1 < num2) {
                System.out.println(num2 + "," + num3 + "e" + num1);
            }

        }
        if (num3 < num2 && num3 < num1) {
            if (num3 < num1) {
                System.out.println(num3 + "," + num1 + "e" + num2);
            }
            if (num3 < num2) {
                System.out.println(num3 + "," + num2 + "e" + num1);
            }

        }
    }
}