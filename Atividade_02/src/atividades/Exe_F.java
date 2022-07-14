package atividades;

import java.util.Scanner;

public class Exe_F {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário mínimo: ");
		int num1 = sc.nextInt();
		
		System.out.print("Salário do funcionário: ");
		int num2 = sc.nextInt();
		
		int qntdSal = num2 / num1;
		
		System.out.println("Quantidade de salários mínimos que este funcionário possui: " + (qntdSal));
		
		sc.close();
		
	}
}
