import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = sc.nextInt(), i = 2, numDiv = 0;

        do{
            if(num % i == 0){
                numDiv++;
            }
            i++;
        }while(i < num);

        if(numDiv == 0 ){
            System.out.println(num + " é um numero primo");
        }

        else {
            System.out.println(num + " não é numero primo");
        }

        sc.close();
    }
}