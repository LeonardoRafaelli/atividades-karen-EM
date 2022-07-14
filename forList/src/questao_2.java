import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, cont = 0, contPeso = 0;
        double peso, altura, alturaTotal = 0, time1 = 0, time2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println("Informe sua idade: ");
                idade = sc.nextInt();
                System.out.println("Informe seu peso: ");
                peso = sc.nextDouble();
                System.out.println("Informe sua altura: ");
                altura = sc.nextDouble();
                if(idade < 18){
                    cont++;
                }
                if(cont == 0){
                    time1 += idade;
                } else {
                    time2 += idade;
                }
                if(peso > 80){
                    contPeso++;
                }
                alturaTotal += altura;
            }
        }
        System.out.println("Jogadores com idade inferior a 18: " + cont);
        System.out.println("A media da idade do time 1: " + (time1/11));
        System.out.println("A media da idade do time 2: " + (time2/11));
        System.out.println("A media da altura do jogadores: " + (alturaTotal/22));
        System.out.println("Percentual de jogadores com mais de 80KG: " + (contPeso*100/22) + "%");
    }
}

