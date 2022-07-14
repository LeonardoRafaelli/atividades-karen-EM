import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int allNums = 0;
        int contNums = 0;
        int maior = 0;
        int menor = 30000;
        int numPar = 0;
        int contNumPar = 0;
        int contNumImpar = 0;

        while (true) {
            System.out.print("Informe um número: ");
            num = sc.nextInt();

            if (num == 30000) {
                break;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            if (num % 2 == 0) {
                numPar += num;

                contNumPar++;
            } else {
                contNumImpar++;
            }

            allNums += num;

            contNums++;
        }

        System.out.print("\nSoma dos números: " + allNums
                + "\nQuantidade de números digitados: " + contNums
                + "\nMaior número: " + maior
                + "\nMenor número: " + menor
                + "\nMédia dos número pares: " + (numPar / contNumPar)
                + "\nPorcentagem de números ímpares: " + ((contNumImpar * 100) / contNums) + "%");

        sc.close();
    }
}