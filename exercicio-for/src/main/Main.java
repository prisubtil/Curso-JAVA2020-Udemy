package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite a quantidade de números que você deseja somar: ");
		int n = sc.nextInt();
		
		
		System.out.println("Digite "+n+" números: ");
		
		for(int i=0; i < n; i++) {
			int numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("O Valor da soma é : "+soma);
		
		sc.close();
		
	}

}
