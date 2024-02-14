package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		List<Product> product = new ArrayList<>();
		
		System.out.println("enter the number of products");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Product" + i + "data");
			System.out.println("Commom, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.println("NAME");
			String name = sc.next();
			System.out.println("Price");
			Double price = sc.nextDouble();
			
			if(ch == 'c') {
				product.add(new Product(name, price));
			}
			else if( ch == 'i') {
				System.out.println("Custom fee");
				Double customFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customFee));
			}
			else {
				System.out.println("Manufacture date");
				
				product.add(new UsedProduct(name,price, null));
			}
		}
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : product) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
