import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento;

        System.out.print("Códigos:\n1 - Escriturário\n2 - Secretário\n3 - Caixa\n4 - Gerente\n5 - Diretor\n -->: ");
        int codigo = sc.nextInt();

        System.out.print("Insira seu salário atual (R$): ");
        double salario = sc.nextDouble();

        switch (codigo){
            case 1 -> {
                aumento = salario * 0.5;
                salario += aumento;
                System.out.println("Cargo: Escruturário\nValor do aumento: " + aumento + "\nNovo salário: " + salario);
            }
            case 2 -> {
                aumento = salario * 0.35;
                salario += aumento;
                System.out.println("Cargo: Secretário\nValor do aumento: " + aumento + "\nNovo salário: " + salario);
            }
            case 3 -> {
                aumento = salario * 0.2;
                salario += aumento;
                System.out.println("Cargo: Caixa\nValor do aumento: " + aumento + "\nNovo salário: " + salario);
            }
            case 4 -> {
                aumento = salario * 0.1;
                salario += aumento;
                System.out.println("Cargo: Gerente\nValor do aumento: " + aumento + "\nNovo salário: " + salario);
            }
            case 5 -> {
                System.out.println("Cargo: Diretor\nValor do aumento: não possui aumento\nNovo salário: " + salario);
            }
        }
        sc.close();
    }
}
