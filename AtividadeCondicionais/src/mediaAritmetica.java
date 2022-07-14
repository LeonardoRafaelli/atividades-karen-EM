import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        double num1 = sc.nextDouble();
        System.out.println("Insira uma nota: ");
        double num2 = sc.nextDouble();
        System.out.println("Insira uma nota: ");
        double num3 = sc.nextDouble();

        double media = (num1 + num2 + num3)/3;

        if(media > 0 && media < 3){
            System.out.println("Reprovado");
        }
        if(media >= 3 && media > 7){
            System.out.println("Exame");
        }
        if(media >= 7 && media <= 10){
            System.out.println("Aprovado");
        }
    }
}
