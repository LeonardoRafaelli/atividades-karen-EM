package atividades;

import java.util.Scanner;

public class Exe_G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Tabuada do " + num1);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num1 + " X " + i + " = " + (num1 * i));
		}
		sc.close();
		
	}
	
}
