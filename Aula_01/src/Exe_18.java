import java.util.Scanner;

public class Exe_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base Tri�ngulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("�rea: " + ((base * altura)/2));
	}
}
