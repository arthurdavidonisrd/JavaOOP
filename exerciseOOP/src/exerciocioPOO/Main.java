package exerciocioPOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.println("Name:");
		product.name = input.nextLine();
		
		System.out.println("Price:");
		product.price = input.nextDouble();
		
		System.out.println("Quantity in stock:");
		product.quantity = input.nextInt();
		
		System.out.println(product.toString());
		
		
		input.close();

	}

}
