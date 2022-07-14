import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário do Carlos\nR$ ");
		double salCarlinhos = sc.nextDouble();

		double salJoaozin = salCarlinhos / 3;

		int contMes = 0;

		while (salJoaozin < salCarlinhos) {
			salCarlinhos += salCarlinhos * 0.02;

			salJoaozin += salJoaozin * 0.05;

			contMes++;
		}

		System.out.printf("Salário do Carlos: %.2f", salCarlinhos);
		System.out.printf("\nSalário do João:  %.2f", salJoaozin);
		System.out.printf("\nMeses até o salário de João ultrapassar o de Carlos:  %d", contMes);

		sc.close();
	}
}