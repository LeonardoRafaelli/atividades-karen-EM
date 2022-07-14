import java.util.Scanner;

public class Exe_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Sucessor: " + (num + 1));
		System.out.println("Antecessor: " + (num - 1));
	}
}
