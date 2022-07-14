import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoGrama, precoTotal=0, valorImposto=0;

        System.out.print("Código do produto - Preço por grama\n" +
                "1 a 4 - 10\n" +
                "5 a 7 - 25\n" +
                "8 a 10 - 35\n" +
                "-->: ");
        int codigo = sc.nextInt();

        System.out.print("Peso em quilogramas (Kg): ");
        double peso = sc.nextDouble();

        System.out.print("Código de origem do país - Imposto\n" +
                "1 - 0%\n" +
                "2 - 15%\n" +
                "3 - 25%\n" +
                "-->: ");
        int codigoPais = sc.nextInt();

        pesoGrama = peso * 1000;

        switch(codigo){
            case 1, 2, 3, 4 -> {
                precoTotal = pesoGrama * 10;
            }
            case 5, 6, 7 -> {
                precoTotal = pesoGrama * 25;
            }
            case 8, 9, 10 -> {
                precoTotal = pesoGrama * 35;
            }
        }

        switch (codigoPais){
            case 1 -> {
                valorImposto = precoTotal * 0.0;
            }
            case 2 -> {
                valorImposto = precoTotal * 0.15;
            }
            case 3 -> {
                valorImposto = precoTotal * 0.25;
            }
        }

        System.out.println("Peso do produto: " + pesoGrama +
                "\nPreço do produto: " + precoTotal + "g" +
                "\nValor do imposto: R$" + valorImposto +
                "\nValor total: R$" + (precoTotal + valorImposto));

    }
}
