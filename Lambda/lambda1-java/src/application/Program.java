package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));

		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().compareToIgnoreCase(p2.getName());

		};

		list.sort(comp);

		for (

		Product p : list) {
			System.out.println(p);
		}
	}
}
