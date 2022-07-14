import java.util.Scanner;

public class questao_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMulti, num;

        System.out.println("Num entre 1 e 10: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            numMulti = num * i;
            System.out.println(num + " x " + i + " = " + numMulti);
        }
    }

}
