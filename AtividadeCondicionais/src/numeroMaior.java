import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Insira um numero: ");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.println("O maior é: " + num1);
        }
        if(num2 > num1){
            System.out.println("O maior é: " + num2);
        }
    }

}
