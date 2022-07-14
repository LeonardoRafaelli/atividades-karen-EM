import java.util.Scanner;

// Em uma fábrica trabalham homens e mulheres divididos em três classes:
//         trabalhadores que fazem até 30 peças por mês - classe 1;
//         trabalhadores que fazem de 31 a 50 peças por mês - classe 2;
//         trabalhadores que fazem mais de 50 peças por mês - classe 3;
//         A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% desse salário por peça, acima das 30 peças iniciais. A classe 3 recebe salário mínimo mais 5% desse salário por peça, acima das 30 peças iniciais.
//         Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do operário, e que também calcule e mostre:
//         o número do operário e seu salário;
//         o total da folha de pagamento da fábrica;
//         o número total de peças fabricadas no mês;
//         a média de peças fabricadas pelos homens;
//         a média de peças fabricadas pelas mulheres;
//         o número de operário ou operária de maior salário.

//         A fábrica possui 15 operários.


public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, monthPiecesMade, higherSalaryEmployeeCode = 0, manCounter=0, womenCounter=0, totalPieces = 0;
        String gender;
        double totalPayroll = 0, avgMenPieces=0, avgWomenPieces=0, minimumWage, wage, higherSalaryEmployee = 0;


        System.out.println("Inform the minimum wage: ");
        minimumWage = sc.nextDouble();

        for (int i = 1; i <= 15; i++){
            System.out.println("Inform your code: ");
            code = sc.nextInt();

            System.out.println("Month pieces made: ");
            monthPiecesMade = sc.nextInt();

            System.out.println("Inform your gender ('men', 'women'): ");
            gender = sc.next();

            if(monthPiecesMade <= 30){
                wage = minimumWage;
            } else if(monthPiecesMade <= 50){
                wage = minimumWage + ((minimumWage * 0.03) * (monthPiecesMade-30));
            } else {
                wage = minimumWage + ((minimumWage * 0.05) * (monthPiecesMade-30));
            }

            if(i == 1){
                higherSalaryEmployee = wage;
                higherSalaryEmployeeCode = code;
            } else {
                if(wage > higherSalaryEmployee){
                    higherSalaryEmployee = wage;
                    higherSalaryEmployeeCode = code;
                }
            }

            if(gender.equals("men")){
                manCounter++;
                avgMenPieces += monthPiecesMade;
            } else {
                womenCounter++;
                avgWomenPieces += monthPiecesMade;
            }

            totalPayroll += wage;
            totalPieces += monthPiecesMade;

            System.out.println("------------");
            System.out.println("Employee code: " + code);
            System.out.println("Wage: " + wage);
        }

        System.out.println("Total payroll: " + totalPayroll);
        System.out.println("Total pieces produced: " + totalPieces);
        System.out.println("Average man's pieces produced: " + (avgMenPieces / manCounter));
        System.out.println("Average woman's pieces produced: " + (avgWomenPieces / womenCounter));

        System.out.println("Employee of the month (higher wage):");
        System.out.println("Code: " + higherSalaryEmployeeCode);

    }
}
