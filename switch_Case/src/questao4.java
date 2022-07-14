import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorProduto = 5000, valorFinal = 0, valorParcela = 0, diferenca;

        System.out.println("Opções de pagamento:\n" +
                "1 - Pagamento à vista - 15% de desconto sobre o valor total da compra\n" +
                "2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra\n" +
                "3 - Pagamento parcelado em 6 vezes - não tem desconto\n" +
                "4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra." +
                "\n\nDigite sua opcao: ");

        switch (sc.nextInt()){
            case 1 -> {
                valorFinal = valorProduto - (valorProduto * 0.15);
            }
            case 2 -> {
                valorFinal = valorProduto - (valorProduto * 0.1);
            }
            case 3 -> {
                valorFinal = valorProduto;
                valorParcela = valorFinal / 6;
                System.out.println("Quantidade de parcelas: 6");
                System.out.println("Valor das parcelas: " + valorParcela);
            }
            case 4 -> {
                valorFinal = valorProduto + (valorProduto * 0.08);
                valorParcela = valorFinal / 12;
                System.out.println("Quantidade de parcelas: 12");
                System.out.println("Valor das parcelas: " + valorParcela);
            }
        };

        diferenca = valorFinal - valorProduto;

        System.out.println("Valor da compra: " + valorProduto +
                "\nValor final: " + valorFinal);

        if(diferenca > 0){
            System.out.println("Juros: " + diferenca);
        } else {
            System.out.println("Desconto: " + diferenca);
        }
    }
}
