package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite a quantidade de n�meros que voc� deseja somar: ");
		int n = sc.nextInt();
		
		
		System.out.println("Digite "+n+" n�meros: ");
		
		for(int i=0; i < n; i++) {
			int numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("O Valor da soma � : "+soma);
		
		sc.close();
		
	}

}
