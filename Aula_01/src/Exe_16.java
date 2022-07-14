import java.util.Scanner;

public class Exe_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Perímetro: " + ((base * 2) + (altura*2)));
		System.out.println("Área: " + (base * altura));
	}
}
