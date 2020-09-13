package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product a = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		a.name = sc.nextLine();
		System.out.println("Price: ");
		a.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		a.quantity = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println("Product data: "+a);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		a.addProducts(quantity);
		System.out.println("Updated Data: "+a);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		a.removeProducts(quantity);
		System.out.println("Updated Data: "+a);
		
		
		sc.close();
	}

}
