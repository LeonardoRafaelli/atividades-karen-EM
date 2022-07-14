import java.util.Scanner;

public class Exe_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, endereco, telefone;
		
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Endereco: ");
		endereco = sc.next();
		System.out.print("Telefone: ");
		telefone = sc.next();
		
		
		System.out.print("Nome: " + nome);
		System.out.print("Endereco: " + endereco);
		System.out.print("Telefone: " + telefone);
	}
}
