import java.util.Scanner;

public class ParImpar {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        }
        if(num % 2 != 0){
            System.out.println("Impar");
        }
    }
}
