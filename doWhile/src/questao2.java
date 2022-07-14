import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cityCounter = 0, code, carNumber, accident, carSum = 0, carSumLess = 0,
                cityLess = 0, mayor = 0, minority = 999999999, accidentSum = 0,
                lessCityCode = 0,
                mayorCityCode = 0;


        do {
            System.out.println("Codigo da cidade: ");
            code = sc.nextInt();

            System.out.println("Números de veiculos de passeio: ");
            carNumber = sc.nextInt();

            System.out.println("Número de acidentes: ");
            accident = sc.nextInt();

            if (carNumber < 2000) {
                cityLess++;
                carSumLess += accident;
            }

            if (accident < minority) {
                lessCityCode = code;
                minority = accident;
            }

            if (accident > mayor) {
                mayorCityCode = code;
                mayor = accident;
            }

            accidentSum += accident;
            carSum += carNumber;
            cityCounter++;

        } while (cityCounter <= 4);

        System.out.println("Codigo cidade com o maior indice de acidentes: " + mayorCityCode +  " Indice: " + (mayor * 100)/accidentSum);
        System.out.println("Codigo cidade: com o menor indice de acidentes " + lessCityCode + " Indice: " + (minority * 100)/accidentSum);
        System.out.println("Média de veiculos das cidades: " + (carSum / cityCounter));
        System.out.println("Média de acidentes de transito com cidades com menos de 2000 veiculos: " + (carSumLess / cityLess));
    }
}
