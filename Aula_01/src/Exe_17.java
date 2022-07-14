import java.util.Scanner;

public class Exe_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = sc.nextDouble();

		
		System.out.println("Perímetro: " + (2 * 3.14 * raio));
		System.out.println("Área: " + (3.14 * (raio * raio)));
	}
}
