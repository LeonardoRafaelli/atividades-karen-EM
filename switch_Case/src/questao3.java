import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorA, valorB;

        System.out.print("Opções de desconto:\n" +
                "Critério A: R$0,25 por livro + R$7,50 fixo\n" +
                "Critério B: R$0,50 por livro + R$2,50 fixo\n");

        System.out.print("Digite a quantidade de livros que deseja comprar: ");
        int qtdLivros = sc.nextInt();

        valorA = (qtdLivros * 0.25) + 7.5;
        valorB = (qtdLivros * 0.5) + 2.5;

        if(valorA < valorB){
            System.out.println("Melhor opção para aproveitar: Critério A");
        } else {
            System.out.println("Melhor opção para aproveitar: Critério B");
        }
        System.out.println("Valor critério A: " + valorA );
        System.out.println("Valor critério B: " + valorB );

    }
}
