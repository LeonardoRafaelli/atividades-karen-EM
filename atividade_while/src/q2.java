import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		while (num > 0) {
			System.out.print("\nInforme um número: ");
			num = sc.nextInt();

			System.out.print("Número: " + num
					+ "\nQuadrado do número: " + Math.pow(num, 2)
					+ "\nCubo do número: " + Math.pow(num, 3)
					+ "\nRaíz quadrada do número: " + Math.sqrt(num) + "\n");
		}

		sc.close();
	}
}