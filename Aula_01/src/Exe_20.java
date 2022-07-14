import java.util.Scanner;

public class Exe_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu tempo de vida atual: ");
		System.out.print("Dia: ");
		int dia = sc.nextInt();
		System.out.print("Mês: ");
		int mes = sc.nextInt();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		
		System.out.println("Total de dias que você está presente neste lindo e amado planeta chamado TERRA <3<3<3<3: " + ((ano * 365) + (mes * 30) + dia));
	}
}
