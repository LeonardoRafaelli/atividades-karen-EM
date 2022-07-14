import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Menu de opções:\n" +
                "1. Somar dois números\n" +
                "2. Raiz quadrada de um número.\n" +
                "Digite a opção desejada: ");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.print(": ");
            double num1 = sc.nextDouble();
            System.out.println("+");
            System.out.print(": ");
            double num2 = sc.nextDouble();
            System.out.println("Resultado: " + (num1 + num2));
        } else {
            System.out.print("Insira um número: ");
            System.out.println(Math.sqrt(sc.nextDouble()));
        }

    }
}
